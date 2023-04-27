import {Component, OnInit} from '@angular/core';
import {CongesService} from 'src/app/controller/service/Conges.service';
import {CongesDto} from 'src/app/controller/model/Conges.model';
import {CongesCriteria} from 'src/app/controller/criteria/CongesCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import {Router} from '@angular/router';
import { environment } from 'src/environments/environment';
import { RoleService } from 'src/app/zynerator/security/Role.service';
import {DatePipe} from '@angular/common';



import { MessageService, ConfirmationService } from 'primeng/api';
import { AuthService } from 'src/app/zynerator/security/Auth.service';
import { ExportService } from 'src/app/zynerator/util/Export.service';

@Component({
  selector: 'app-conges-list-admin',
  templateUrl: './conges-list-admin.component.html'
})
export class CongesListAdminComponent extends AbstractListController<CongesDto, CongesCriteria, CongesService>  implements OnInit {

    fileName = 'Conges';

  
    constructor(datePipe: DatePipe, congesService: CongesService, messageService: MessageService, confirmationService: ConfirmationService
        , roleService: RoleService, router: Router , authService: AuthService , exportService: ExportService
) {
        super(datePipe, congesService, messageService, confirmationService, roleService, router, authService, exportService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadCongess(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Conges', 'list');
        isPermistted ? this.service.findAll().subscribe(congess => this.items = congess,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'dateDebut', header: 'Date debut'},
            {field: 'dateFin', header: 'Date fin'},
            {field: 'jourRestantParAnnee', header: 'Jour restant par annee'},
        ];
    }



	public initDuplicate(res: CongesDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                'Date debut': this.datePipe.transform(e.dateDebut , 'dd/MM/yyyy hh:mm'),
                'Date fin': this.datePipe.transform(e.dateFin , 'dd/MM/yyyy hh:mm'),
                 'Jour restant par annee': e.jourRestantParAnnee ,
            }
        });

        this.criteriaData = [{
            'Date debut Min': this.criteria.dateDebutFrom ? this.datePipe.transform(this.criteria.dateDebutFrom , this.dateFormat) : environment.emptyForExport ,
            'Date debut Max': this.criteria.dateDebutTo ? this.datePipe.transform(this.criteria.dateDebutTo , this.dateFormat) : environment.emptyForExport ,
            'Date fin Min': this.criteria.dateFinFrom ? this.datePipe.transform(this.criteria.dateFinFrom , this.dateFormat) : environment.emptyForExport ,
            'Date fin Max': this.criteria.dateFinTo ? this.datePipe.transform(this.criteria.dateFinTo , this.dateFormat) : environment.emptyForExport ,
            'Jour restant par annee Min': this.criteria.jourRestantParAnneeMin ? this.criteria.jourRestantParAnneeMin : environment.emptyForExport ,
            'Jour restant par annee Max': this.criteria.jourRestantParAnneeMax ? this.criteria.jourRestantParAnneeMax : environment.emptyForExport ,
        }];
      }
}

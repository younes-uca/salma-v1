import {Component, OnInit} from '@angular/core';
import {NotationService} from 'src/app/controller/service/Notation.service';
import {NotationDto} from 'src/app/controller/model/Notation.model';
import {NotationCriteria} from 'src/app/controller/criteria/NotationCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import {Router} from '@angular/router';
import { environment } from 'src/environments/environment';
import { RoleService } from 'src/app/zynerator/security/Role.service';
import {DatePipe} from '@angular/common';



import { MessageService, ConfirmationService } from 'primeng/api';
import { AuthService } from 'src/app/zynerator/security/Auth.service';
import { ExportService } from 'src/app/zynerator/util/Export.service';

@Component({
  selector: 'app-notation-list-admin',
  templateUrl: './notation-list-admin.component.html'
})
export class NotationListAdminComponent extends AbstractListController<NotationDto, NotationCriteria, NotationService>  implements OnInit {

    fileName = 'Notation';

  
    constructor(datePipe: DatePipe, notationService: NotationService, messageService: MessageService, confirmationService: ConfirmationService
        , roleService: RoleService, router: Router , authService: AuthService , exportService: ExportService
) {
        super(datePipe, notationService, messageService, confirmationService, roleService, router, authService, exportService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadNotations(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Notation', 'list');
        isPermistted ? this.service.findAll().subscribe(notations => this.items = notations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'premierNote', header: 'Premier note'},
            {field: 'deusiemeNote', header: 'Deusieme note'},
            {field: 'troisiemeNote', header: 'Troisieme note'},
            {field: 'quatriemeNote', header: 'Quatrieme note'},
            {field: 'cinquiemeNote', header: 'Cinquieme note'},
            {field: 'sommeDesNotes', header: 'Somme des notes'},
            {field: 'commentaire', header: 'Commentaire'},
        ];
    }



	public initDuplicate(res: NotationDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Premier note': e.premierNote ,
                 'Deusieme note': e.deusiemeNote ,
                 'Troisieme note': e.troisiemeNote ,
                 'Quatrieme note': e.quatriemeNote ,
                 'Cinquieme note': e.cinquiemeNote ,
                 'Somme des notes': e.sommeDesNotes ,
                 'Commentaire': e.commentaire ,
            }
        });

        this.criteriaData = [{
            'Premier note Min': this.criteria.premierNoteMin ? this.criteria.premierNoteMin : environment.emptyForExport ,
            'Premier note Max': this.criteria.premierNoteMax ? this.criteria.premierNoteMax : environment.emptyForExport ,
            'Deusieme note Min': this.criteria.deusiemeNoteMin ? this.criteria.deusiemeNoteMin : environment.emptyForExport ,
            'Deusieme note Max': this.criteria.deusiemeNoteMax ? this.criteria.deusiemeNoteMax : environment.emptyForExport ,
            'Troisieme note Min': this.criteria.troisiemeNoteMin ? this.criteria.troisiemeNoteMin : environment.emptyForExport ,
            'Troisieme note Max': this.criteria.troisiemeNoteMax ? this.criteria.troisiemeNoteMax : environment.emptyForExport ,
            'Quatrieme note Min': this.criteria.quatriemeNoteMin ? this.criteria.quatriemeNoteMin : environment.emptyForExport ,
            'Quatrieme note Max': this.criteria.quatriemeNoteMax ? this.criteria.quatriemeNoteMax : environment.emptyForExport ,
            'Cinquieme note Min': this.criteria.cinquiemeNoteMin ? this.criteria.cinquiemeNoteMin : environment.emptyForExport ,
            'Cinquieme note Max': this.criteria.cinquiemeNoteMax ? this.criteria.cinquiemeNoteMax : environment.emptyForExport ,
            'Somme des notes Min': this.criteria.sommeDesNotesMin ? this.criteria.sommeDesNotesMin : environment.emptyForExport ,
            'Somme des notes Max': this.criteria.sommeDesNotesMax ? this.criteria.sommeDesNotesMax : environment.emptyForExport ,
            'Commentaire': this.criteria.commentaire ? this.criteria.commentaire : environment.emptyForExport ,
        }];
      }
}

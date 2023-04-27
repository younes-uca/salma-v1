import {Component, OnInit, Input} from '@angular/core';

import {RoleService} from 'src/app/zynerator/security/Role.service';
import { ConfirmationService, MessageService } from 'primeng/api';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { environment } from 'src/environments/environment';
import { DatePipe } from '@angular/common';

import { StringUtilService } from 'src/app/zynerator/util/StringUtil.service';
import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {CongesService} from 'src/app/controller/service/Conges.service';
import {CongesDto} from 'src/app/controller/model/Conges.model';
import {CongesCriteria} from 'src/app/controller/criteria/CongesCriteria.model';
@Component({
  selector: 'app-conges-create-admin',
  templateUrl: './conges-create-admin.component.html'
})
export class CongesCreateAdminComponent extends AbstractCreateController<CongesDto, CongesCriteria, CongesService>  implements OnInit {




    constructor(private datePipe: DatePipe, private congesService: CongesService
     , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
    , private confirmationService: ConfirmationService, private router: Router  

    ) {
        super(datePipe, congesService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }










}

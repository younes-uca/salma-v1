import {Component, OnInit, Input} from '@angular/core';

import {ConfirmationService, MessageService} from 'primeng/api';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {DatePipe} from '@angular/common';

import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {AbsenceService} from 'src/app/controller/service/Absence.service';
import {AbsenceDto} from 'src/app/controller/model/Absence.model';
import {AbsenceCriteria} from 'src/app/controller/criteria/AbsenceCriteria.model';



@Component({
  selector: 'app-absence-edit-admin',
  templateUrl: './absence-edit-admin.component.html'
})
export class AbsenceEditAdminComponent extends AbstractEditController<AbsenceDto, AbsenceCriteria, AbsenceService>   implements OnInit {






    constructor(private datePipe: DatePipe, private absenceService: AbsenceService
        , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
        , private confirmationService: ConfirmationService, private router: Router  

    ) {
        super(datePipe, absenceService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
}

    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }







}

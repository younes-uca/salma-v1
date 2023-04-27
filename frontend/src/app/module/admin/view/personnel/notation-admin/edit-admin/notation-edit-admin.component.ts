import {Component, OnInit, Input} from '@angular/core';

import {ConfirmationService, MessageService} from 'primeng/api';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {DatePipe} from '@angular/common';

import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {NotationService} from 'src/app/controller/service/Notation.service';
import {NotationDto} from 'src/app/controller/model/Notation.model';
import {NotationCriteria} from 'src/app/controller/criteria/NotationCriteria.model';



@Component({
  selector: 'app-notation-edit-admin',
  templateUrl: './notation-edit-admin.component.html'
})
export class NotationEditAdminComponent extends AbstractEditController<NotationDto, NotationCriteria, NotationService>   implements OnInit {






    constructor(private datePipe: DatePipe, private notationService: NotationService
        , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
        , private confirmationService: ConfirmationService, private router: Router  

    ) {
        super(datePipe, notationService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
}

    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }







}

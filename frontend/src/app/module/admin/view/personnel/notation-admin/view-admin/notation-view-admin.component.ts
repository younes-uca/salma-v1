import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {DatePipe} from '@angular/common';

import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {MessageService} from 'primeng/api';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {NotationService} from 'src/app/controller/service/Notation.service';
import {NotationDto} from 'src/app/controller/model/Notation.model';
import {NotationCriteria} from 'src/app/controller/criteria/NotationCriteria.model';

@Component({
  selector: 'app-notation-view-admin',
  templateUrl: './notation-view-admin.component.html'
})
export class NotationViewAdminComponent extends AbstractViewController<NotationDto, NotationCriteria, NotationService> implements OnInit {


    constructor(private datePipe: DatePipe, private notationService: NotationService
                , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
                , private router: Router  

    ){
        super(datePipe, notationService, messageService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
    }




}

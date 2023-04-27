import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {DatePipe} from '@angular/common';

import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {MessageService} from 'primeng/api';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {CongesService} from 'src/app/controller/service/Conges.service';
import {CongesDto} from 'src/app/controller/model/Conges.model';
import {CongesCriteria} from 'src/app/controller/criteria/CongesCriteria.model';

@Component({
  selector: 'app-conges-view-admin',
  templateUrl: './conges-view-admin.component.html'
})
export class CongesViewAdminComponent extends AbstractViewController<CongesDto, CongesCriteria, CongesService> implements OnInit {


    constructor(private datePipe: DatePipe, private congesService: CongesService
                , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
                , private router: Router  

    ){
        super(datePipe, congesService, messageService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
    }




}

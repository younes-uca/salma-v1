import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {DatePipe} from '@angular/common';

import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {MessageService} from 'primeng/api';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {NotificationService} from 'src/app/controller/service/Notification.service';
import {NotificationDto} from 'src/app/controller/model/Notification.model';
import {NotificationCriteria} from 'src/app/controller/criteria/NotificationCriteria.model';

@Component({
  selector: 'app-notification-view-admin',
  templateUrl: './notification-view-admin.component.html'
})
export class NotificationViewAdminComponent extends AbstractViewController<NotificationDto, NotificationCriteria, NotificationService> implements OnInit {


    constructor(private datePipe: DatePipe, private notificationService: NotificationService
                , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
                , private router: Router  

    ){
        super(datePipe, notificationService, messageService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
    }




}

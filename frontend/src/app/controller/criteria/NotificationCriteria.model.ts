import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class NotificationCriteria  extends   BaseCriteria  {

    public id: number;
    public reference: string;
    public referenceLike: string;
    public dateNotification: Date;
    public dateNotificationFrom: Date;
    public dateNotificationTo: Date;

}

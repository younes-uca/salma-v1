import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class NotificationDto  extends BaseDto{

    public id: number;
    public reference: string;
   public dateNotification: Date;
    public dateNotificationMax: string ;
    public dateNotificationMin: string ;

}

import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class AbsenceDto  extends BaseDto{

    public id: number;
   public nombreAbsence: number;
   public dateAbsence: Date;
    public justification: string;
    public nombreAbsenceMax: string ;
    public nombreAbsenceMin: string ;
    public dateAbsenceMax: string ;
    public dateAbsenceMin: string ;

}

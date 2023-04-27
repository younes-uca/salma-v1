import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class AbsenceCriteria  extends   BaseCriteria  {

    public id: number;
     public nombreAbsence: number;
     public nombreAbsenceMin: number;
     public nombreAbsenceMax: number;
    public dateAbsence: Date;
    public dateAbsenceFrom: Date;
    public dateAbsenceTo: Date;
    public justification: string;
    public justificationLike: string;

}

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class ParcoursUniversitaireCriteria  extends   BaseCriteria  {

    public id: number;
    public deplome: string;
    public deplomeLike: string;
    public dateObtention: Date;
    public dateObtentionFrom: Date;
    public dateObtentionTo: Date;

}

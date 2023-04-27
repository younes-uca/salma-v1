import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class ParcoursUniversitaireDto  extends BaseDto{

    public id: number;
    public deplome: string;
   public dateObtention: Date;
    public dateObtentionMax: string ;
    public dateObtentionMin: string ;

}

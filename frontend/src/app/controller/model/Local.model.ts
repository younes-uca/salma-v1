import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class LocalDto  extends BaseDto{

    public id: number;
    public libelle: string;
   public dateOccupationPoste: Date;
    public dateOccupationPosteMax: string ;
    public dateOccupationPosteMin: string ;

}

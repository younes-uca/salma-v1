import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class CongesDto  extends BaseDto{

    public id: number;
   public dateDebut: Date;
   public dateFin: Date;
   public jourRestantParAnnee: number;
    public dateDebutMax: string ;
    public dateDebutMin: string ;
    public dateFinMax: string ;
    public dateFinMin: string ;
    public jourRestantParAnneeMax: string ;
    public jourRestantParAnneeMin: string ;

}

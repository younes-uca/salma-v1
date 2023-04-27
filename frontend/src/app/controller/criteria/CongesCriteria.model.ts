import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class CongesCriteria  extends   BaseCriteria  {

    public id: number;
    public dateDebut: Date;
    public dateDebutFrom: Date;
    public dateDebutTo: Date;
    public dateFin: Date;
    public dateFinFrom: Date;
    public dateFinTo: Date;
     public jourRestantParAnnee: number;
     public jourRestantParAnneeMin: number;
     public jourRestantParAnneeMax: number;

}

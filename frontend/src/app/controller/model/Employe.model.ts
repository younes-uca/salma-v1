import {ParcoursUniversitaireDto} from './ParcoursUniversitaire.model';
import {CongesDto} from './Conges.model';
import {DepartementDto} from './Departement.model';
import {SexeDto} from './Sexe.model';
import {EchelonDto} from './Echelon.model';
import {GradeDto} from './Grade.model';
import {PosteDto} from './Poste.model';
import {NotationDto} from './Notation.model';
import {EchelleDto} from './Echelle.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class EmployeDto  extends BaseDto{

    public id: number;
    public login: string;
    public password: string;
    public prenom: string;
    public nom: string;
   public dateDeNaissance: Date;
    public lieuDeNaissance: string;
    public adresse: string;
    public cin: string;
    public tel: string;
   public dateEmbauche: Date;
   public matricule: number;
    public adressEmail: string;
    public compteBancaire: string;
   public nombreAbsence: number;
    public dateDeNaissanceMax: string ;
    public dateDeNaissanceMin: string ;
    public dateEmbaucheMax: string ;
    public dateEmbaucheMin: string ;
    public matriculeMax: string ;
    public matriculeMin: string ;
    public nombreAbsenceMax: string ;
    public nombreAbsenceMin: string ;
    public localMax: string ;
    public localMin: string ;
    public sexe: SexeDto ;
    public parcoursUniversitaire: ParcoursUniversitaireDto ;
    public departement: DepartementDto ;
    public poste: PosteDto ;
    public notation: NotationDto ;
    public conges: CongesDto ;
    public echelle: EchelleDto ;
    public echelon: EchelonDto ;
    public grade: GradeDto ;

}

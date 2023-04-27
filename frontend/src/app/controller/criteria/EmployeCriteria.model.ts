import {ParcoursUniversitaireCriteria} from './ParcoursUniversitaireCriteria.model';
import {CongesCriteria} from './CongesCriteria.model';
import {DepartementCriteria} from './DepartementCriteria.model';
import {SexeCriteria} from './SexeCriteria.model';
import {EchelonCriteria} from './EchelonCriteria.model';
import {GradeCriteria} from './GradeCriteria.model';
import {PosteCriteria} from './PosteCriteria.model';
import {NotationCriteria} from './NotationCriteria.model';
import {EchelleCriteria} from './EchelleCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class EmployeCriteria  extends   BaseCriteria  {

    public id: number;
    public login: string;
    public loginLike: string;
    public password: string;
    public passwordLike: string;
    public prenom: string;
    public prenomLike: string;
    public nom: string;
    public nomLike: string;
    public dateDeNaissance: Date;
    public dateDeNaissanceFrom: Date;
    public dateDeNaissanceTo: Date;
    public lieuDeNaissance: string;
    public lieuDeNaissanceLike: string;
    public adresse: string;
    public adresseLike: string;
    public cin: string;
    public cinLike: string;
    public tel: string;
    public telLike: string;
    public dateEmbauche: Date;
    public dateEmbaucheFrom: Date;
    public dateEmbaucheTo: Date;
     public matricule: number;
     public matriculeMin: number;
     public matriculeMax: number;
    public adressEmail: string;
    public adressEmailLike: string;
    public compteBancaire: string;
    public compteBancaireLike: string;
     public nombreAbsence: number;
     public nombreAbsenceMin: number;
     public nombreAbsenceMax: number;
  public sexe: SexeCriteria ;
  public sexes: Array<SexeCriteria> ;
  public parcoursUniversitaire: ParcoursUniversitaireCriteria ;
  public parcoursUniversitaires: Array<ParcoursUniversitaireCriteria> ;
  public departement: DepartementCriteria ;
  public departements: Array<DepartementCriteria> ;
  public poste: PosteCriteria ;
  public postes: Array<PosteCriteria> ;
  public notation: NotationCriteria ;
  public notations: Array<NotationCriteria> ;
  public conges: CongesCriteria ;
  public congess: Array<CongesCriteria> ;
  public echelle: EchelleCriteria ;
  public echelles: Array<EchelleCriteria> ;
  public echelon: EchelonCriteria ;
  public echelons: Array<EchelonCriteria> ;
  public grade: GradeCriteria ;
  public grades: Array<GradeCriteria> ;

}

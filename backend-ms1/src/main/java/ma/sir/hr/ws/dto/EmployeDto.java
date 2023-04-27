package  ma.sir.hr.ws.dto;

import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeDto  extends AuditBaseDto {

    private String login  ;
    private String password  ;
    private String prenom  ;
    private String nom  ;
    private String dateDeNaissance ;
    private String lieuDeNaissance  ;
    private String adresse  ;
    private String cin  ;
    private String tel  ;
    private String dateEmbauche ;
    private Integer matricule  = 0 ;
    private String adressEmail  ;
    private String compteBancaire  ;
    private Integer nombreAbsence  = 0 ;
    private Local local  ;

    private SexeDto sexe ;
    private ParcoursUniversitaireDto parcoursUniversitaire ;
    private DepartementDto departement ;
    private PosteDto poste ;
    private NotationDto notation ;
    private CongesDto conges ;
    private EchelleDto echelle ;
    private EchelonDto echelon ;
    private GradeDto grade ;



    public EmployeDto(){
        super();
    }



    @Log
    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login){
        this.login = login;
    }

    @Log
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDeNaissance(){
        return this.dateDeNaissance;
    }
    public void setDateDeNaissance(String dateDeNaissance){
        this.dateDeNaissance = dateDeNaissance;
    }

    @Log
    public String getLieuDeNaissance(){
        return this.lieuDeNaissance;
    }
    public void setLieuDeNaissance(String lieuDeNaissance){
        this.lieuDeNaissance = lieuDeNaissance;
    }

    @Log
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    @Log
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }

    @Log
    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEmbauche(){
        return this.dateEmbauche;
    }
    public void setDateEmbauche(String dateEmbauche){
        this.dateEmbauche = dateEmbauche;
    }

    @Log
    public Integer getMatricule(){
        return this.matricule;
    }
    public void setMatricule(Integer matricule){
        this.matricule = matricule;
    }

    @Log
    public String getAdressEmail(){
        return this.adressEmail;
    }
    public void setAdressEmail(String adressEmail){
        this.adressEmail = adressEmail;
    }

    @Log
    public String getCompteBancaire(){
        return this.compteBancaire;
    }
    public void setCompteBancaire(String compteBancaire){
        this.compteBancaire = compteBancaire;
    }

    @Log
    public Integer getNombreAbsence(){
        return this.nombreAbsence;
    }
    public void setNombreAbsence(Integer nombreAbsence){
        this.nombreAbsence = nombreAbsence;
    }

    @Log
    public Local getLocal(){
        return this.local;
    }
    public void setLocal(Local local){
        this.local = local;
    }


    public SexeDto getSexe(){
        return this.sexe;
    }

    public void setSexe(SexeDto sexe){
        this.sexe = sexe;
    }
    public ParcoursUniversitaireDto getParcoursUniversitaire(){
        return this.parcoursUniversitaire;
    }

    public void setParcoursUniversitaire(ParcoursUniversitaireDto parcoursUniversitaire){
        this.parcoursUniversitaire = parcoursUniversitaire;
    }
    public DepartementDto getDepartement(){
        return this.departement;
    }

    public void setDepartement(DepartementDto departement){
        this.departement = departement;
    }
    public PosteDto getPoste(){
        return this.poste;
    }

    public void setPoste(PosteDto poste){
        this.poste = poste;
    }
    public NotationDto getNotation(){
        return this.notation;
    }

    public void setNotation(NotationDto notation){
        this.notation = notation;
    }
    public CongesDto getConges(){
        return this.conges;
    }

    public void setConges(CongesDto conges){
        this.conges = conges;
    }
    public EchelleDto getEchelle(){
        return this.echelle;
    }

    public void setEchelle(EchelleDto echelle){
        this.echelle = echelle;
    }
    public EchelonDto getEchelon(){
        return this.echelon;
    }

    public void setEchelon(EchelonDto echelon){
        this.echelon = echelon;
    }
    public GradeDto getGrade(){
        return this.grade;
    }

    public void setGrade(GradeDto grade){
        this.grade = grade;
    }




}

package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class EmployeCriteria extends  BaseCriteria  {

    private String login;
    private String loginLike;
    private String password;
    private String passwordLike;
    private String prenom;
    private String prenomLike;
    private String nom;
    private String nomLike;
    private LocalDateTime dateDeNaissance;
    private LocalDateTime dateDeNaissanceFrom;
    private LocalDateTime dateDeNaissanceTo;
    private String lieuDeNaissance;
    private String lieuDeNaissanceLike;
    private String adresse;
    private String adresseLike;
    private String cin;
    private String cinLike;
    private String tel;
    private String telLike;
    private LocalDateTime dateEmbauche;
    private LocalDateTime dateEmbaucheFrom;
    private LocalDateTime dateEmbaucheTo;
    private String matricule;
    private String matriculeMin;
    private String matriculeMax;
    private String adressEmail;
    private String adressEmailLike;
    private String compteBancaire;
    private String compteBancaireLike;
    private String nombreAbsence;
    private String nombreAbsenceMin;
    private String nombreAbsenceMax;
    private String local;
    private String localLike;

    private SexeCriteria sexe ;
    private List<SexeCriteria> sexes ;
    private ParcoursUniversitaireCriteria parcoursUniversitaire ;
    private List<ParcoursUniversitaireCriteria> parcoursUniversitaires ;
    private DepartementCriteria departement ;
    private List<DepartementCriteria> departements ;
    private PosteCriteria poste ;
    private List<PosteCriteria> postes ;
    private NotationCriteria notation ;
    private List<NotationCriteria> notations ;
    private CongesCriteria conges ;
    private List<CongesCriteria> congess ;
    private EchelleCriteria echelle ;
    private List<EchelleCriteria> echelles ;
    private EchelonCriteria echelon ;
    private List<EchelonCriteria> echelons ;
    private GradeCriteria grade ;
    private List<GradeCriteria> grades ;


    public EmployeCriteria(){}

    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getLoginLike(){
        return this.loginLike;
    }
    public void setLoginLike(String loginLike){
        this.loginLike = loginLike;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPasswordLike(){
        return this.passwordLike;
    }
    public void setPasswordLike(String passwordLike){
        this.passwordLike = passwordLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public LocalDateTime getDateDeNaissance(){
        return this.dateDeNaissance;
    }
    public void setDateDeNaissance(LocalDateTime dateDeNaissance){
        this.dateDeNaissance = dateDeNaissance;
    }
    public LocalDateTime getDateDeNaissanceFrom(){
        return this.dateDeNaissanceFrom;
    }
    public void setDateDeNaissanceFrom(LocalDateTime dateDeNaissanceFrom){
        this.dateDeNaissanceFrom = dateDeNaissanceFrom;
    }
    public LocalDateTime getDateDeNaissanceTo(){
        return this.dateDeNaissanceTo;
    }
    public void setDateDeNaissanceTo(LocalDateTime dateDeNaissanceTo){
        this.dateDeNaissanceTo = dateDeNaissanceTo;
    }
    public String getLieuDeNaissance(){
        return this.lieuDeNaissance;
    }
    public void setLieuDeNaissance(String lieuDeNaissance){
        this.lieuDeNaissance = lieuDeNaissance;
    }
    public String getLieuDeNaissanceLike(){
        return this.lieuDeNaissanceLike;
    }
    public void setLieuDeNaissanceLike(String lieuDeNaissanceLike){
        this.lieuDeNaissanceLike = lieuDeNaissanceLike;
    }

    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getAdresseLike(){
        return this.adresseLike;
    }
    public void setAdresseLike(String adresseLike){
        this.adresseLike = adresseLike;
    }

    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCinLike(){
        return this.cinLike;
    }
    public void setCinLike(String cinLike){
        this.cinLike = cinLike;
    }

    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getTelLike(){
        return this.telLike;
    }
    public void setTelLike(String telLike){
        this.telLike = telLike;
    }

    public LocalDateTime getDateEmbauche(){
        return this.dateEmbauche;
    }
    public void setDateEmbauche(LocalDateTime dateEmbauche){
        this.dateEmbauche = dateEmbauche;
    }
    public LocalDateTime getDateEmbaucheFrom(){
        return this.dateEmbaucheFrom;
    }
    public void setDateEmbaucheFrom(LocalDateTime dateEmbaucheFrom){
        this.dateEmbaucheFrom = dateEmbaucheFrom;
    }
    public LocalDateTime getDateEmbaucheTo(){
        return this.dateEmbaucheTo;
    }
    public void setDateEmbaucheTo(LocalDateTime dateEmbaucheTo){
        this.dateEmbaucheTo = dateEmbaucheTo;
    }
    public String getMatricule(){
        return this.matricule;
    }
    public void setMatricule(String matricule){
        this.matricule = matricule;
    }   
    public String getMatriculeMin(){
        return this.matriculeMin;
    }
    public void setMatriculeMin(String matriculeMin){
        this.matriculeMin = matriculeMin;
    }
    public String getMatriculeMax(){
        return this.matriculeMax;
    }
    public void setMatriculeMax(String matriculeMax){
        this.matriculeMax = matriculeMax;
    }
      
    public String getAdressEmail(){
        return this.adressEmail;
    }
    public void setAdressEmail(String adressEmail){
        this.adressEmail = adressEmail;
    }
    public String getAdressEmailLike(){
        return this.adressEmailLike;
    }
    public void setAdressEmailLike(String adressEmailLike){
        this.adressEmailLike = adressEmailLike;
    }

    public String getCompteBancaire(){
        return this.compteBancaire;
    }
    public void setCompteBancaire(String compteBancaire){
        this.compteBancaire = compteBancaire;
    }
    public String getCompteBancaireLike(){
        return this.compteBancaireLike;
    }
    public void setCompteBancaireLike(String compteBancaireLike){
        this.compteBancaireLike = compteBancaireLike;
    }

    public String getNombreAbsence(){
        return this.nombreAbsence;
    }
    public void setNombreAbsence(String nombreAbsence){
        this.nombreAbsence = nombreAbsence;
    }   
    public String getNombreAbsenceMin(){
        return this.nombreAbsenceMin;
    }
    public void setNombreAbsenceMin(String nombreAbsenceMin){
        this.nombreAbsenceMin = nombreAbsenceMin;
    }
    public String getNombreAbsenceMax(){
        return this.nombreAbsenceMax;
    }
    public void setNombreAbsenceMax(String nombreAbsenceMax){
        this.nombreAbsenceMax = nombreAbsenceMax;
    }
      
    public String getLocal(){
        return this.local;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public String getLocalLike(){
        return this.localLike;
    }
    public void setLocalLike(String localLike){
        this.localLike = localLike;
    }


    public SexeCriteria getSexe(){
        return this.sexe;
    }

    public void setSexe(SexeCriteria sexe){
        this.sexe = sexe;
    }
    public List<SexeCriteria> getSexes(){
        return this.sexes;
    }

    public void setSexes(List<SexeCriteria> sexes){
        this.sexes = sexes;
    }
    public ParcoursUniversitaireCriteria getParcoursUniversitaire(){
        return this.parcoursUniversitaire;
    }

    public void setParcoursUniversitaire(ParcoursUniversitaireCriteria parcoursUniversitaire){
        this.parcoursUniversitaire = parcoursUniversitaire;
    }
    public List<ParcoursUniversitaireCriteria> getParcoursUniversitaires(){
        return this.parcoursUniversitaires;
    }

    public void setParcoursUniversitaires(List<ParcoursUniversitaireCriteria> parcoursUniversitaires){
        this.parcoursUniversitaires = parcoursUniversitaires;
    }
    public DepartementCriteria getDepartement(){
        return this.departement;
    }

    public void setDepartement(DepartementCriteria departement){
        this.departement = departement;
    }
    public List<DepartementCriteria> getDepartements(){
        return this.departements;
    }

    public void setDepartements(List<DepartementCriteria> departements){
        this.departements = departements;
    }
    public PosteCriteria getPoste(){
        return this.poste;
    }

    public void setPoste(PosteCriteria poste){
        this.poste = poste;
    }
    public List<PosteCriteria> getPostes(){
        return this.postes;
    }

    public void setPostes(List<PosteCriteria> postes){
        this.postes = postes;
    }
    public NotationCriteria getNotation(){
        return this.notation;
    }

    public void setNotation(NotationCriteria notation){
        this.notation = notation;
    }
    public List<NotationCriteria> getNotations(){
        return this.notations;
    }

    public void setNotations(List<NotationCriteria> notations){
        this.notations = notations;
    }
    public CongesCriteria getConges(){
        return this.conges;
    }

    public void setConges(CongesCriteria conges){
        this.conges = conges;
    }
    public List<CongesCriteria> getCongess(){
        return this.congess;
    }

    public void setCongess(List<CongesCriteria> congess){
        this.congess = congess;
    }
    public EchelleCriteria getEchelle(){
        return this.echelle;
    }

    public void setEchelle(EchelleCriteria echelle){
        this.echelle = echelle;
    }
    public List<EchelleCriteria> getEchelles(){
        return this.echelles;
    }

    public void setEchelles(List<EchelleCriteria> echelles){
        this.echelles = echelles;
    }
    public EchelonCriteria getEchelon(){
        return this.echelon;
    }

    public void setEchelon(EchelonCriteria echelon){
        this.echelon = echelon;
    }
    public List<EchelonCriteria> getEchelons(){
        return this.echelons;
    }

    public void setEchelons(List<EchelonCriteria> echelons){
        this.echelons = echelons;
    }
    public GradeCriteria getGrade(){
        return this.grade;
    }

    public void setGrade(GradeCriteria grade){
        this.grade = grade;
    }
    public List<GradeCriteria> getGrades(){
        return this.grades;
    }

    public void setGrades(List<GradeCriteria> grades){
        this.grades = grades;
    }
}

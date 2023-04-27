package ma.sir.hr.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "employe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="employe_seq",sequenceName="employe_seq",allocationSize=1, initialValue = 1)
public class Employe   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String login;
    @Column(length = 500)
    private String password;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String nom;
    private LocalDateTime dateDeNaissance ;
    @Column(length = 500)
    private String lieuDeNaissance;
    @Column(length = 500)
    private String adresse;
    @Column(length = 500)
    private String cin;
    @Column(length = 500)
    private String tel;
    private LocalDateTime dateEmbauche ;
    private Integer matricule = 0;
    @Column(length = 500)
    private String adressEmail;
    @Column(length = 500)
    private String compteBancaire;
    private Integer nombreAbsence = 0;
    private Local local ;

    private Sexe sexe ;
    
    private ParcoursUniversitaire parcoursUniversitaire ;
    
    private Departement departement ;
    
    private Poste poste ;
    
    private Notation notation ;
    
    private Conges conges ;
    
    private Echelle echelle ;
    
    private Echelon echelon ;
    
    private Grade grade ;
    


    public Employe(){
        super();
    }

    public Employe(Long id,String password){
        this.id = id;
        this.password = password ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="employe_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public LocalDateTime getDateDeNaissance(){
        return this.dateDeNaissance;
    }
    public void setDateDeNaissance(LocalDateTime dateDeNaissance){
        this.dateDeNaissance = dateDeNaissance;
    }
    public String getLieuDeNaissance(){
        return this.lieuDeNaissance;
    }
    public void setLieuDeNaissance(String lieuDeNaissance){
        this.lieuDeNaissance = lieuDeNaissance;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Sexe getSexe(){
        return this.sexe;
    }
    public void setSexe(Sexe sexe){
        this.sexe = sexe;
    }
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ParcoursUniversitaire getParcoursUniversitaire(){
        return this.parcoursUniversitaire;
    }
    public void setParcoursUniversitaire(ParcoursUniversitaire parcoursUniversitaire){
        this.parcoursUniversitaire = parcoursUniversitaire;
    }
    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public LocalDateTime getDateEmbauche(){
        return this.dateEmbauche;
    }
    public void setDateEmbauche(LocalDateTime dateEmbauche){
        this.dateEmbauche = dateEmbauche;
    }
    public Integer getMatricule(){
        return this.matricule;
    }
    public void setMatricule(Integer matricule){
        this.matricule = matricule;
    }
    public String getAdressEmail(){
        return this.adressEmail;
    }
    public void setAdressEmail(String adressEmail){
        this.adressEmail = adressEmail;
    }
    public String getCompteBancaire(){
        return this.compteBancaire;
    }
    public void setCompteBancaire(String compteBancaire){
        this.compteBancaire = compteBancaire;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Departement getDepartement(){
        return this.departement;
    }
    public void setDepartement(Departement departement){
        this.departement = departement;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Poste getPoste(){
        return this.poste;
    }
    public void setPoste(Poste poste){
        this.poste = poste;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Notation getNotation(){
        return this.notation;
    }
    public void setNotation(Notation notation){
        this.notation = notation;
    }
    public Integer getNombreAbsence(){
        return this.nombreAbsence;
    }
    public void setNombreAbsence(Integer nombreAbsence){
        this.nombreAbsence = nombreAbsence;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Conges getConges(){
        return this.conges;
    }
    public void setConges(Conges conges){
        this.conges = conges;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Echelle getEchelle(){
        return this.echelle;
    }
    public void setEchelle(Echelle echelle){
        this.echelle = echelle;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Echelon getEchelon(){
        return this.echelon;
    }
    public void setEchelon(Echelon echelon){
        this.echelon = echelon;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Grade getGrade(){
        return this.grade;
    }
    public void setGrade(Grade grade){
        this.grade = grade;
    }
    public Local getLocal(){
        return this.local;
    }
    public void setLocal(Local local){
        this.local = local;
    }

    @Transient
    public String getLabel() {
        label = password;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id != null && id.equals(employe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class CongesCriteria extends  BaseCriteria  {

    private LocalDateTime dateDebut;
    private LocalDateTime dateDebutFrom;
    private LocalDateTime dateDebutTo;
    private LocalDateTime dateFin;
    private LocalDateTime dateFinFrom;
    private LocalDateTime dateFinTo;
    private String jourRestantParAnnee;
    private String jourRestantParAnneeMin;
    private String jourRestantParAnneeMax;



    public CongesCriteria(){}

    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
    }
    public LocalDateTime getDateDebutFrom(){
        return this.dateDebutFrom;
    }
    public void setDateDebutFrom(LocalDateTime dateDebutFrom){
        this.dateDebutFrom = dateDebutFrom;
    }
    public LocalDateTime getDateDebutTo(){
        return this.dateDebutTo;
    }
    public void setDateDebutTo(LocalDateTime dateDebutTo){
        this.dateDebutTo = dateDebutTo;
    }
    public LocalDateTime getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(LocalDateTime dateFin){
        this.dateFin = dateFin;
    }
    public LocalDateTime getDateFinFrom(){
        return this.dateFinFrom;
    }
    public void setDateFinFrom(LocalDateTime dateFinFrom){
        this.dateFinFrom = dateFinFrom;
    }
    public LocalDateTime getDateFinTo(){
        return this.dateFinTo;
    }
    public void setDateFinTo(LocalDateTime dateFinTo){
        this.dateFinTo = dateFinTo;
    }
    public String getJourRestantParAnnee(){
        return this.jourRestantParAnnee;
    }
    public void setJourRestantParAnnee(String jourRestantParAnnee){
        this.jourRestantParAnnee = jourRestantParAnnee;
    }   
    public String getJourRestantParAnneeMin(){
        return this.jourRestantParAnneeMin;
    }
    public void setJourRestantParAnneeMin(String jourRestantParAnneeMin){
        this.jourRestantParAnneeMin = jourRestantParAnneeMin;
    }
    public String getJourRestantParAnneeMax(){
        return this.jourRestantParAnneeMax;
    }
    public void setJourRestantParAnneeMax(String jourRestantParAnneeMax){
        this.jourRestantParAnneeMax = jourRestantParAnneeMax;
    }
      

}

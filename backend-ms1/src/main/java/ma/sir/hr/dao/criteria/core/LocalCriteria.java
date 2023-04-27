package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class LocalCriteria extends  BaseCriteria  {

    private String libelle;
    private String libelleLike;
    private LocalDateTime dateOccupationPoste;
    private LocalDateTime dateOccupationPosteFrom;
    private LocalDateTime dateOccupationPosteTo;



    public LocalCriteria(){}

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public LocalDateTime getDateOccupationPoste(){
        return this.dateOccupationPoste;
    }
    public void setDateOccupationPoste(LocalDateTime dateOccupationPoste){
        this.dateOccupationPoste = dateOccupationPoste;
    }
    public LocalDateTime getDateOccupationPosteFrom(){
        return this.dateOccupationPosteFrom;
    }
    public void setDateOccupationPosteFrom(LocalDateTime dateOccupationPosteFrom){
        this.dateOccupationPosteFrom = dateOccupationPosteFrom;
    }
    public LocalDateTime getDateOccupationPosteTo(){
        return this.dateOccupationPosteTo;
    }
    public void setDateOccupationPosteTo(LocalDateTime dateOccupationPosteTo){
        this.dateOccupationPosteTo = dateOccupationPosteTo;
    }

}

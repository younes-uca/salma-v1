package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class ParcoursUniversitaireCriteria extends  BaseCriteria  {

    private String deplome;
    private String deplomeLike;
    private LocalDateTime dateObtention;
    private LocalDateTime dateObtentionFrom;
    private LocalDateTime dateObtentionTo;



    public ParcoursUniversitaireCriteria(){}

    public String getDeplome(){
        return this.deplome;
    }
    public void setDeplome(String deplome){
        this.deplome = deplome;
    }
    public String getDeplomeLike(){
        return this.deplomeLike;
    }
    public void setDeplomeLike(String deplomeLike){
        this.deplomeLike = deplomeLike;
    }

    public LocalDateTime getDateObtention(){
        return this.dateObtention;
    }
    public void setDateObtention(LocalDateTime dateObtention){
        this.dateObtention = dateObtention;
    }
    public LocalDateTime getDateObtentionFrom(){
        return this.dateObtentionFrom;
    }
    public void setDateObtentionFrom(LocalDateTime dateObtentionFrom){
        this.dateObtentionFrom = dateObtentionFrom;
    }
    public LocalDateTime getDateObtentionTo(){
        return this.dateObtentionTo;
    }
    public void setDateObtentionTo(LocalDateTime dateObtentionTo){
        this.dateObtentionTo = dateObtentionTo;
    }

}

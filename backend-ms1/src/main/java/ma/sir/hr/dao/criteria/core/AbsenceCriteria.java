package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class AbsenceCriteria extends  BaseCriteria  {

    private String nombreAbsence;
    private String nombreAbsenceMin;
    private String nombreAbsenceMax;
    private LocalDateTime dateAbsence;
    private LocalDateTime dateAbsenceFrom;
    private LocalDateTime dateAbsenceTo;
    private String justification;
    private String justificationLike;



    public AbsenceCriteria(){}

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
      
    public LocalDateTime getDateAbsence(){
        return this.dateAbsence;
    }
    public void setDateAbsence(LocalDateTime dateAbsence){
        this.dateAbsence = dateAbsence;
    }
    public LocalDateTime getDateAbsenceFrom(){
        return this.dateAbsenceFrom;
    }
    public void setDateAbsenceFrom(LocalDateTime dateAbsenceFrom){
        this.dateAbsenceFrom = dateAbsenceFrom;
    }
    public LocalDateTime getDateAbsenceTo(){
        return this.dateAbsenceTo;
    }
    public void setDateAbsenceTo(LocalDateTime dateAbsenceTo){
        this.dateAbsenceTo = dateAbsenceTo;
    }
    public String getJustification(){
        return this.justification;
    }
    public void setJustification(String justification){
        this.justification = justification;
    }
    public String getJustificationLike(){
        return this.justificationLike;
    }
    public void setJustificationLike(String justificationLike){
        this.justificationLike = justificationLike;
    }


}

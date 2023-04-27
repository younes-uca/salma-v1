package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PosteCriteria extends  BaseCriteria  {

    private String titre;
    private String titreLike;
    private String discription;
    private String discriptionLike;
    private LocalDateTime dateAffectation;
    private LocalDateTime dateAffectationFrom;
    private LocalDateTime dateAffectationTo;

    private DepartementCriteria departement ;
    private List<DepartementCriteria> departements ;


    public PosteCriteria(){}

    public String getTitre(){
        return this.titre;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
    public String getTitreLike(){
        return this.titreLike;
    }
    public void setTitreLike(String titreLike){
        this.titreLike = titreLike;
    }

    public String getDiscription(){
        return this.discription;
    }
    public void setDiscription(String discription){
        this.discription = discription;
    }
    public String getDiscriptionLike(){
        return this.discriptionLike;
    }
    public void setDiscriptionLike(String discriptionLike){
        this.discriptionLike = discriptionLike;
    }

    public LocalDateTime getDateAffectation(){
        return this.dateAffectation;
    }
    public void setDateAffectation(LocalDateTime dateAffectation){
        this.dateAffectation = dateAffectation;
    }
    public LocalDateTime getDateAffectationFrom(){
        return this.dateAffectationFrom;
    }
    public void setDateAffectationFrom(LocalDateTime dateAffectationFrom){
        this.dateAffectationFrom = dateAffectationFrom;
    }
    public LocalDateTime getDateAffectationTo(){
        return this.dateAffectationTo;
    }
    public void setDateAffectationTo(LocalDateTime dateAffectationTo){
        this.dateAffectationTo = dateAffectationTo;
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
}

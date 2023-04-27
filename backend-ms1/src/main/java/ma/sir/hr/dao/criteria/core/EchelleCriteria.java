package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class EchelleCriteria extends  BaseCriteria  {

    private String reference;
    private String referenceLike;
    private LocalDateTime dateActivation;
    private LocalDateTime dateActivationFrom;
    private LocalDateTime dateActivationTo;

    private EchelleCriteria echelle ;
    private List<EchelleCriteria> echelles ;


    public EchelleCriteria(){}

    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getReferenceLike(){
        return this.referenceLike;
    }
    public void setReferenceLike(String referenceLike){
        this.referenceLike = referenceLike;
    }

    public LocalDateTime getDateActivation(){
        return this.dateActivation;
    }
    public void setDateActivation(LocalDateTime dateActivation){
        this.dateActivation = dateActivation;
    }
    public LocalDateTime getDateActivationFrom(){
        return this.dateActivationFrom;
    }
    public void setDateActivationFrom(LocalDateTime dateActivationFrom){
        this.dateActivationFrom = dateActivationFrom;
    }
    public LocalDateTime getDateActivationTo(){
        return this.dateActivationTo;
    }
    public void setDateActivationTo(LocalDateTime dateActivationTo){
        this.dateActivationTo = dateActivationTo;
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
}

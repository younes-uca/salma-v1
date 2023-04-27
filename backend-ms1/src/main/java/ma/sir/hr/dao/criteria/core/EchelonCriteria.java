package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;

public class EchelonCriteria extends  BaseCriteria  {

    private String reference;
    private String referenceLike;
    private String indice;
    private String indiceMin;
    private String indiceMax;

    private EchelleCriteria echelle ;
    private List<EchelleCriteria> echelles ;


    public EchelonCriteria(){}

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

    public String getIndice(){
        return this.indice;
    }
    public void setIndice(String indice){
        this.indice = indice;
    }   
    public String getIndiceMin(){
        return this.indiceMin;
    }
    public void setIndiceMin(String indiceMin){
        this.indiceMin = indiceMin;
    }
    public String getIndiceMax(){
        return this.indiceMax;
    }
    public void setIndiceMax(String indiceMax){
        this.indiceMax = indiceMax;
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

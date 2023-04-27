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
@Table(name = "poste")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="poste_seq",sequenceName="poste_seq",allocationSize=1, initialValue = 1)
public class Poste   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String titre;
    @Column(length = 500)
    private String discription;
    private LocalDateTime dateAffectation ;

    private Departement departement ;
    


    public Poste(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="poste_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getTitre(){
        return this.titre;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
    public String getDiscription(){
        return this.discription;
    }
    public void setDiscription(String discription){
        this.discription = discription;
    }
    public LocalDateTime getDateAffectation(){
        return this.dateAffectation;
    }
    public void setDateAffectation(LocalDateTime dateAffectation){
        this.dateAffectation = dateAffectation;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Departement getDepartement(){
        return this.departement;
    }
    public void setDepartement(Departement departement){
        this.departement = departement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poste poste = (Poste) o;
        return id != null && id.equals(poste.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


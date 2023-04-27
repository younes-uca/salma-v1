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
@Table(name = "conges")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="conges_seq",sequenceName="conges_seq",allocationSize=1, initialValue = 1)
public class Conges   extends AuditBusinessObject     {

    private Long id;

    private LocalDateTime dateDebut ;
    private LocalDateTime dateFin ;
    private Integer jourRestantParAnnee = 0;



    public Conges(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="conges_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
    }
    public LocalDateTime getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(LocalDateTime dateFin){
        this.dateFin = dateFin;
    }
    public Integer getJourRestantParAnnee(){
        return this.jourRestantParAnnee;
    }
    public void setJourRestantParAnnee(Integer jourRestantParAnnee){
        this.jourRestantParAnnee = jourRestantParAnnee;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conges conges = (Conges) o;
        return id != null && id.equals(conges.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


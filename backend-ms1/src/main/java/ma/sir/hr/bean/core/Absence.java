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
@Table(name = "absence")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="absence_seq",sequenceName="absence_seq",allocationSize=1, initialValue = 1)
public class Absence   extends AuditBusinessObject     {

    private Long id;

    private Integer nombreAbsence = 0;
    private LocalDateTime dateAbsence ;
    @Column(length = 500)
    private String justification;



    public Absence(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="absence_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Integer getNombreAbsence(){
        return this.nombreAbsence;
    }
    public void setNombreAbsence(Integer nombreAbsence){
        this.nombreAbsence = nombreAbsence;
    }
    public LocalDateTime getDateAbsence(){
        return this.dateAbsence;
    }
    public void setDateAbsence(LocalDateTime dateAbsence){
        this.dateAbsence = dateAbsence;
    }
    public String getJustification(){
        return this.justification;
    }
    public void setJustification(String justification){
        this.justification = justification;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Absence absence = (Absence) o;
        return id != null && id.equals(absence.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


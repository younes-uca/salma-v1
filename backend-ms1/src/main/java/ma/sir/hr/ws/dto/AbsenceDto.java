package  ma.sir.hr.ws.dto;

import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbsenceDto  extends AuditBaseDto {

    private Integer nombreAbsence  = 0 ;
    private String dateAbsence ;
    private String justification  ;




    public AbsenceDto(){
        super();
    }



    @Log
    public Integer getNombreAbsence(){
        return this.nombreAbsence;
    }
    public void setNombreAbsence(Integer nombreAbsence){
        this.nombreAbsence = nombreAbsence;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateAbsence(){
        return this.dateAbsence;
    }
    public void setDateAbsence(String dateAbsence){
        this.dateAbsence = dateAbsence;
    }

    @Log
    public String getJustification(){
        return this.justification;
    }
    public void setJustification(String justification){
        this.justification = justification;
    }






}

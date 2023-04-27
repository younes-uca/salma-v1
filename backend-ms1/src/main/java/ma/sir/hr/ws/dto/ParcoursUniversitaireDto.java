package  ma.sir.hr.ws.dto;

import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParcoursUniversitaireDto  extends AuditBaseDto {

    private String deplome  ;
    private String dateObtention ;




    public ParcoursUniversitaireDto(){
        super();
    }



    @Log
    public String getDeplome(){
        return this.deplome;
    }
    public void setDeplome(String deplome){
        this.deplome = deplome;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateObtention(){
        return this.dateObtention;
    }
    public void setDateObtention(String dateObtention){
        this.dateObtention = dateObtention;
    }






}

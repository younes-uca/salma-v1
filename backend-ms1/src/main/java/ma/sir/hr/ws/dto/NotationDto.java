package  ma.sir.hr.ws.dto;

import ma.sir.hr.zynerator.audit.Log;
import ma.sir.hr.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotationDto  extends AuditBaseDto {

    private BigDecimal premierNote  ;
    private BigDecimal deusiemeNote  ;
    private BigDecimal troisiemeNote  ;
    private BigDecimal quatriemeNote  ;
    private BigDecimal cinquiemeNote  ;
    private BigDecimal sommeDesNotes  ;
    private String commentaire  ;




    public NotationDto(){
        super();
    }



    @Log
    public BigDecimal getPremierNote(){
        return this.premierNote;
    }
    public void setPremierNote(BigDecimal premierNote){
        this.premierNote = premierNote;
    }

    @Log
    public BigDecimal getDeusiemeNote(){
        return this.deusiemeNote;
    }
    public void setDeusiemeNote(BigDecimal deusiemeNote){
        this.deusiemeNote = deusiemeNote;
    }

    @Log
    public BigDecimal getTroisiemeNote(){
        return this.troisiemeNote;
    }
    public void setTroisiemeNote(BigDecimal troisiemeNote){
        this.troisiemeNote = troisiemeNote;
    }

    @Log
    public BigDecimal getQuatriemeNote(){
        return this.quatriemeNote;
    }
    public void setQuatriemeNote(BigDecimal quatriemeNote){
        this.quatriemeNote = quatriemeNote;
    }

    @Log
    public BigDecimal getCinquiemeNote(){
        return this.cinquiemeNote;
    }
    public void setCinquiemeNote(BigDecimal cinquiemeNote){
        this.cinquiemeNote = cinquiemeNote;
    }

    @Log
    public BigDecimal getSommeDesNotes(){
        return this.sommeDesNotes;
    }
    public void setSommeDesNotes(BigDecimal sommeDesNotes){
        this.sommeDesNotes = sommeDesNotes;
    }

    @Log
    public String getCommentaire(){
        return this.commentaire;
    }
    public void setCommentaire(String commentaire){
        this.commentaire = commentaire;
    }






}

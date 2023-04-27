package  ma.sir.hr.dao.criteria.core;


import ma.sir.hr.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class NotificationCriteria extends  BaseCriteria  {

    private String reference;
    private String referenceLike;
    private LocalDateTime dateNotification;
    private LocalDateTime dateNotificationFrom;
    private LocalDateTime dateNotificationTo;



    public NotificationCriteria(){}

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

    public LocalDateTime getDateNotification(){
        return this.dateNotification;
    }
    public void setDateNotification(LocalDateTime dateNotification){
        this.dateNotification = dateNotification;
    }
    public LocalDateTime getDateNotificationFrom(){
        return this.dateNotificationFrom;
    }
    public void setDateNotificationFrom(LocalDateTime dateNotificationFrom){
        this.dateNotificationFrom = dateNotificationFrom;
    }
    public LocalDateTime getDateNotificationTo(){
        return this.dateNotificationTo;
    }
    public void setDateNotificationTo(LocalDateTime dateNotificationTo){
        this.dateNotificationTo = dateNotificationTo;
    }

}

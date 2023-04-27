package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.NotificationHistory;
import ma.sir.hr.bean.core.Notification;
import ma.sir.hr.ws.dto.NotificationDto;

@Component
public class NotificationConverter extends AbstractConverter<Notification, NotificationDto, NotificationHistory> {


    public  NotificationConverter(){
        super(Notification.class, NotificationDto.class, NotificationHistory.class);
    }

    @Override
    public Notification toItem(NotificationDto dto) {
        if (dto == null) {
            return null;
        } else {
        Notification item = new Notification();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getDateNotification()))
                item.setDateNotification(DateUtil.stringEnToDate(dto.getDateNotification()));


        return item;
        }
    }

    @Override
    public NotificationDto toDto(Notification item) {
        if (item == null) {
            return null;
        } else {
            NotificationDto dto = new NotificationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(item.getDateNotification()!=null)
                dto.setDateNotification(DateUtil.dateTimeToString(item.getDateNotification()));


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}

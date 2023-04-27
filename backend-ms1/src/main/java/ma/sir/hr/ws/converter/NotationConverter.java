package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.NotationHistory;
import ma.sir.hr.bean.core.Notation;
import ma.sir.hr.ws.dto.NotationDto;

@Component
public class NotationConverter extends AbstractConverter<Notation, NotationDto, NotationHistory> {


    public  NotationConverter(){
        super(Notation.class, NotationDto.class, NotationHistory.class);
    }

    @Override
    public Notation toItem(NotationDto dto) {
        if (dto == null) {
            return null;
        } else {
        Notation item = new Notation();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getPremierNote()))
                item.setPremierNote(dto.getPremierNote());
            if(StringUtil.isNotEmpty(dto.getDeusiemeNote()))
                item.setDeusiemeNote(dto.getDeusiemeNote());
            if(StringUtil.isNotEmpty(dto.getTroisiemeNote()))
                item.setTroisiemeNote(dto.getTroisiemeNote());
            if(StringUtil.isNotEmpty(dto.getQuatriemeNote()))
                item.setQuatriemeNote(dto.getQuatriemeNote());
            if(StringUtil.isNotEmpty(dto.getCinquiemeNote()))
                item.setCinquiemeNote(dto.getCinquiemeNote());
            if(StringUtil.isNotEmpty(dto.getSommeDesNotes()))
                item.setSommeDesNotes(dto.getSommeDesNotes());
            if(StringUtil.isNotEmpty(dto.getCommentaire()))
                item.setCommentaire(dto.getCommentaire());


        return item;
        }
    }

    @Override
    public NotationDto toDto(Notation item) {
        if (item == null) {
            return null;
        } else {
            NotationDto dto = new NotationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getPremierNote()))
                dto.setPremierNote(item.getPremierNote());
            if(StringUtil.isNotEmpty(item.getDeusiemeNote()))
                dto.setDeusiemeNote(item.getDeusiemeNote());
            if(StringUtil.isNotEmpty(item.getTroisiemeNote()))
                dto.setTroisiemeNote(item.getTroisiemeNote());
            if(StringUtil.isNotEmpty(item.getQuatriemeNote()))
                dto.setQuatriemeNote(item.getQuatriemeNote());
            if(StringUtil.isNotEmpty(item.getCinquiemeNote()))
                dto.setCinquiemeNote(item.getCinquiemeNote());
            if(StringUtil.isNotEmpty(item.getSommeDesNotes()))
                dto.setSommeDesNotes(item.getSommeDesNotes());
            if(StringUtil.isNotEmpty(item.getCommentaire()))
                dto.setCommentaire(item.getCommentaire());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}

package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.AbsenceHistory;
import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.ws.dto.AbsenceDto;

@Component
public class AbsenceConverter extends AbstractConverter<Absence, AbsenceDto, AbsenceHistory> {


    public  AbsenceConverter(){
        super(Absence.class, AbsenceDto.class, AbsenceHistory.class);
    }

    @Override
    public Absence toItem(AbsenceDto dto) {
        if (dto == null) {
            return null;
        } else {
        Absence item = new Absence();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNombreAbsence()))
                item.setNombreAbsence(dto.getNombreAbsence());
            if(StringUtil.isNotEmpty(dto.getDateAbsence()))
                item.setDateAbsence(DateUtil.stringEnToDate(dto.getDateAbsence()));
            if(StringUtil.isNotEmpty(dto.getJustification()))
                item.setJustification(dto.getJustification());


        return item;
        }
    }

    @Override
    public AbsenceDto toDto(Absence item) {
        if (item == null) {
            return null;
        } else {
            AbsenceDto dto = new AbsenceDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNombreAbsence()))
                dto.setNombreAbsence(item.getNombreAbsence());
            if(item.getDateAbsence()!=null)
                dto.setDateAbsence(DateUtil.dateTimeToString(item.getDateAbsence()));
            if(StringUtil.isNotEmpty(item.getJustification()))
                dto.setJustification(item.getJustification());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}

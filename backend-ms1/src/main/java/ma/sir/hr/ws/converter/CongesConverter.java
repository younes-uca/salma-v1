package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.CongesHistory;
import ma.sir.hr.bean.core.Conges;
import ma.sir.hr.ws.dto.CongesDto;

@Component
public class CongesConverter extends AbstractConverter<Conges, CongesDto, CongesHistory> {


    public  CongesConverter(){
        super(Conges.class, CongesDto.class, CongesHistory.class);
    }

    @Override
    public Conges toItem(CongesDto dto) {
        if (dto == null) {
            return null;
        } else {
        Conges item = new Conges();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if(StringUtil.isNotEmpty(dto.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(dto.getDateFin()));
            if(StringUtil.isNotEmpty(dto.getJourRestantParAnnee()))
                item.setJourRestantParAnnee(dto.getJourRestantParAnnee());


        return item;
        }
    }

    @Override
    public CongesDto toDto(Conges item) {
        if (item == null) {
            return null;
        } else {
            CongesDto dto = new CongesDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateDebut()!=null)
                dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
            if(item.getDateFin()!=null)
                dto.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
            if(StringUtil.isNotEmpty(item.getJourRestantParAnnee()))
                dto.setJourRestantParAnnee(item.getJourRestantParAnnee());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}

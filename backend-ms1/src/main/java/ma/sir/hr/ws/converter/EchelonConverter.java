package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.EchelonHistory;
import ma.sir.hr.bean.core.Echelon;
import ma.sir.hr.ws.dto.EchelonDto;

@Component
public class EchelonConverter extends AbstractConverter<Echelon, EchelonDto, EchelonHistory> {

    @Autowired
    private EchelleConverter echelleConverter ;
    private boolean echelle;

    public  EchelonConverter(){
        super(Echelon.class, EchelonDto.class, EchelonHistory.class);
    }

    @Override
    public Echelon toItem(EchelonDto dto) {
        if (dto == null) {
            return null;
        } else {
        Echelon item = new Echelon();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getIndice()))
                item.setIndice(dto.getIndice());
            if(this.echelle && dto.getEchelle()!=null)
                item.setEchelle(echelleConverter.toItem(dto.getEchelle())) ;



        return item;
        }
    }

    @Override
    public EchelonDto toDto(Echelon item) {
        if (item == null) {
            return null;
        } else {
            EchelonDto dto = new EchelonDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(StringUtil.isNotEmpty(item.getIndice()))
                dto.setIndice(item.getIndice());
        if(this.echelle && item.getEchelle()!=null) {
            dto.setEchelle(echelleConverter.toDto(item.getEchelle())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.echelle = value;
    }


    public EchelleConverter getEchelleConverter(){
        return this.echelleConverter;
    }
    public void setEchelleConverter(EchelleConverter echelleConverter ){
        this.echelleConverter = echelleConverter;
    }
    public boolean  isEchelle(){
        return this.echelle;
    }
    public void  setEchelle(boolean echelle){
        this.echelle = echelle;
    }
}

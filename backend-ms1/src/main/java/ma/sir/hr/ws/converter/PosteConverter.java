package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.hr.bean.core.Departement;

import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.PosteHistory;
import ma.sir.hr.bean.core.Poste;
import ma.sir.hr.ws.dto.PosteDto;

@Component
public class PosteConverter extends AbstractConverter<Poste, PosteDto, PosteHistory> {

    @Autowired
    private DepartementConverter departementConverter ;
    private boolean departement;

    public  PosteConverter(){
        super(Poste.class, PosteDto.class, PosteHistory.class);
    }

    @Override
    public Poste toItem(PosteDto dto) {
        if (dto == null) {
            return null;
        } else {
        Poste item = new Poste();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getTitre()))
                item.setTitre(dto.getTitre());
            if(StringUtil.isNotEmpty(dto.getDiscription()))
                item.setDiscription(dto.getDiscription());
            if(StringUtil.isNotEmpty(dto.getDateAffectation()))
                item.setDateAffectation(DateUtil.stringEnToDate(dto.getDateAffectation()));
            if(dto.getDepartement() != null && dto.getDepartement().getId() != null){
                item.setDepartement(new Departement());
                item.getDepartement().setId(dto.getDepartement().getId());
            }



        return item;
        }
    }

    @Override
    public PosteDto toDto(Poste item) {
        if (item == null) {
            return null;
        } else {
            PosteDto dto = new PosteDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getTitre()))
                dto.setTitre(item.getTitre());
            if(StringUtil.isNotEmpty(item.getDiscription()))
                dto.setDiscription(item.getDiscription());
            if(item.getDateAffectation()!=null)
                dto.setDateAffectation(DateUtil.dateTimeToString(item.getDateAffectation()));
        if(this.departement && item.getDepartement()!=null) {
            dto.setDepartement(departementConverter.toDto(item.getDepartement())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.departement = value;
    }


    public DepartementConverter getDepartementConverter(){
        return this.departementConverter;
    }
    public void setDepartementConverter(DepartementConverter departementConverter ){
        this.departementConverter = departementConverter;
    }
    public boolean  isDepartement(){
        return this.departement;
    }
    public void  setDepartement(boolean departement){
        this.departement = departement;
    }
}

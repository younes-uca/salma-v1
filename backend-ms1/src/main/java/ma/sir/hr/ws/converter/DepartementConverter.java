package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.hr.zynerator.util.ListUtil;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.DepartementHistory;
import ma.sir.hr.bean.core.Departement;
import ma.sir.hr.ws.dto.DepartementDto;

@Component
public class DepartementConverter extends AbstractConverter<Departement, DepartementDto, DepartementHistory> {

    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private EchelleConverter echelleConverter ;
    @Autowired
    private EchelonConverter echelonConverter ;
    @Autowired
    private SexeConverter sexeConverter ;
    @Autowired
    private CongesConverter congesConverter ;
    @Autowired
    private NotationConverter notationConverter ;
    @Autowired
    private ParcoursUniversitaireConverter parcoursUniversitaireConverter ;
    @Autowired
    private PosteConverter posteConverter ;
    @Autowired
    private GradeConverter gradeConverter ;
    private boolean employe;
    private boolean postes;
    private boolean employes;

    public  DepartementConverter(){
        super(Departement.class, DepartementDto.class, DepartementHistory.class);
        init(true);
    }

    @Override
    public Departement toItem(DepartementDto dto) {
        if (dto == null) {
            return null;
        } else {
        Departement item = new Departement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getDiscription()))
                item.setDiscription(dto.getDiscription());
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;


            if(this.postes && ListUtil.isNotEmpty(dto.getPostes()))
                item.setPostes(posteConverter.toItem(dto.getPostes()));
            if(this.employes && ListUtil.isNotEmpty(dto.getEmployes()))
                item.setEmployes(employeConverter.toItem(dto.getEmployes()));

        return item;
        }
    }

    @Override
    public DepartementDto toDto(Departement item) {
        if (item == null) {
            return null;
        } else {
            DepartementDto dto = new DepartementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getDiscription()))
                dto.setDiscription(item.getDiscription());
        if(this.employe && item.getEmploye()!=null) {
            employeConverter.setDepartement(false);
            dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;
            employeConverter.setDepartement(true);
        }
        if(this.postes && ListUtil.isNotEmpty(item.getPostes())){
            posteConverter.init(true);
            posteConverter.setDepartement(false);
            dto.setPostes(posteConverter.toDto(item.getPostes()));
            posteConverter.setDepartement(true);

        }
        if(this.employes && ListUtil.isNotEmpty(item.getEmployes())){
            employeConverter.init(true);
            employeConverter.setDepartement(false);
            dto.setEmployes(employeConverter.toDto(item.getEmployes()));
            employeConverter.setDepartement(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.postes = value;
        this.employes = value;
    }

    public void initObject(boolean value) {
        this.employe = value;
    }


    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public EchelleConverter getEchelleConverter(){
        return this.echelleConverter;
    }
    public void setEchelleConverter(EchelleConverter echelleConverter ){
        this.echelleConverter = echelleConverter;
    }
    public EchelonConverter getEchelonConverter(){
        return this.echelonConverter;
    }
    public void setEchelonConverter(EchelonConverter echelonConverter ){
        this.echelonConverter = echelonConverter;
    }
    public SexeConverter getSexeConverter(){
        return this.sexeConverter;
    }
    public void setSexeConverter(SexeConverter sexeConverter ){
        this.sexeConverter = sexeConverter;
    }
    public CongesConverter getCongesConverter(){
        return this.congesConverter;
    }
    public void setCongesConverter(CongesConverter congesConverter ){
        this.congesConverter = congesConverter;
    }
    public NotationConverter getNotationConverter(){
        return this.notationConverter;
    }
    public void setNotationConverter(NotationConverter notationConverter ){
        this.notationConverter = notationConverter;
    }
    public ParcoursUniversitaireConverter getParcoursUniversitaireConverter(){
        return this.parcoursUniversitaireConverter;
    }
    public void setParcoursUniversitaireConverter(ParcoursUniversitaireConverter parcoursUniversitaireConverter ){
        this.parcoursUniversitaireConverter = parcoursUniversitaireConverter;
    }
    public PosteConverter getPosteConverter(){
        return this.posteConverter;
    }
    public void setPosteConverter(PosteConverter posteConverter ){
        this.posteConverter = posteConverter;
    }
    public GradeConverter getGradeConverter(){
        return this.gradeConverter;
    }
    public void setGradeConverter(GradeConverter gradeConverter ){
        this.gradeConverter = gradeConverter;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
    public boolean  isPostes(){
        return this.postes ;
    }
    public void  setPostes(boolean postes ){
        this.postes  = postes ;
    }
    public boolean  isEmployes(){
        return this.employes ;
    }
    public void  setEmployes(boolean employes ){
        this.employes  = employes ;
    }
}

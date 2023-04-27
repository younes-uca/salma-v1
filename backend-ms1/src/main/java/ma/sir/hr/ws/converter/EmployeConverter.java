package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.hr.bean.core.Departement;

import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.EmployeHistory;
import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.ws.dto.EmployeDto;

@Component
public class EmployeConverter extends AbstractConverter<Employe, EmployeDto, EmployeHistory> {

    @Autowired
    private EchelonConverter echelonConverter ;
    @Autowired
    private EchelleConverter echelleConverter ;
    @Autowired
    private ParcoursUniversitaireConverter parcoursUniversitaireConverter ;
    @Autowired
    private DepartementConverter departementConverter ;
    @Autowired
    private SexeConverter sexeConverter ;
    @Autowired
    private PosteConverter posteConverter ;
    @Autowired
    private CongesConverter congesConverter ;
    @Autowired
    private GradeConverter gradeConverter ;
    @Autowired
    private NotationConverter notationConverter ;
    private boolean sexe;
    private boolean parcoursUniversitaire;
    private boolean departement;
    private boolean poste;
    private boolean notation;
    private boolean conges;
    private boolean echelle;
    private boolean echelon;
    private boolean grade;

    public  EmployeConverter(){
        super(Employe.class, EmployeDto.class, EmployeHistory.class);
    }

    @Override
    public Employe toItem(EmployeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Employe item = new Employe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLogin()))
                item.setLogin(dto.getLogin());
            if(StringUtil.isNotEmpty(dto.getPassword()))
                item.setPassword(dto.getPassword());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getDateDeNaissance()))
                item.setDateDeNaissance(DateUtil.stringEnToDate(dto.getDateDeNaissance()));
            if(StringUtil.isNotEmpty(dto.getLieuDeNaissance()))
                item.setLieuDeNaissance(dto.getLieuDeNaissance());
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getTel()))
                item.setTel(dto.getTel());
            if(StringUtil.isNotEmpty(dto.getDateEmbauche()))
                item.setDateEmbauche(DateUtil.stringEnToDate(dto.getDateEmbauche()));
            if(StringUtil.isNotEmpty(dto.getMatricule()))
                item.setMatricule(dto.getMatricule());
            if(StringUtil.isNotEmpty(dto.getAdressEmail()))
                item.setAdressEmail(dto.getAdressEmail());
            if(StringUtil.isNotEmpty(dto.getCompteBancaire()))
                item.setCompteBancaire(dto.getCompteBancaire());
            if(StringUtil.isNotEmpty(dto.getNombreAbsence()))
                item.setNombreAbsence(dto.getNombreAbsence());
            if(StringUtil.isNotEmpty(dto.getLocal()))
                item.setLocal(dto.getLocal());
            if(this.sexe && dto.getSexe()!=null)
                item.setSexe(sexeConverter.toItem(dto.getSexe())) ;

            if(this.parcoursUniversitaire && dto.getParcoursUniversitaire()!=null)
                item.setParcoursUniversitaire(parcoursUniversitaireConverter.toItem(dto.getParcoursUniversitaire())) ;

            if(dto.getDepartement() != null && dto.getDepartement().getId() != null){
                item.setDepartement(new Departement());
                item.getDepartement().setId(dto.getDepartement().getId());
            }

            if(this.poste && dto.getPoste()!=null)
                item.setPoste(posteConverter.toItem(dto.getPoste())) ;

            if(this.notation && dto.getNotation()!=null)
                item.setNotation(notationConverter.toItem(dto.getNotation())) ;

            if(this.conges && dto.getConges()!=null)
                item.setConges(congesConverter.toItem(dto.getConges())) ;

            if(this.echelle && dto.getEchelle()!=null)
                item.setEchelle(echelleConverter.toItem(dto.getEchelle())) ;

            if(this.echelon && dto.getEchelon()!=null)
                item.setEchelon(echelonConverter.toItem(dto.getEchelon())) ;

            if(this.grade && dto.getGrade()!=null)
                item.setGrade(gradeConverter.toItem(dto.getGrade())) ;



        return item;
        }
    }

    @Override
    public EmployeDto toDto(Employe item) {
        if (item == null) {
            return null;
        } else {
            EmployeDto dto = new EmployeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLogin()))
                dto.setLogin(item.getLogin());
            if(StringUtil.isNotEmpty(item.getPassword()))
                dto.setPassword(item.getPassword());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(item.getDateDeNaissance()!=null)
                dto.setDateDeNaissance(DateUtil.dateTimeToString(item.getDateDeNaissance()));
            if(StringUtil.isNotEmpty(item.getLieuDeNaissance()))
                dto.setLieuDeNaissance(item.getLieuDeNaissance());
            if(StringUtil.isNotEmpty(item.getAdresse()))
                dto.setAdresse(item.getAdresse());
            if(StringUtil.isNotEmpty(item.getCin()))
                dto.setCin(item.getCin());
            if(StringUtil.isNotEmpty(item.getTel()))
                dto.setTel(item.getTel());
            if(item.getDateEmbauche()!=null)
                dto.setDateEmbauche(DateUtil.dateTimeToString(item.getDateEmbauche()));
            if(StringUtil.isNotEmpty(item.getMatricule()))
                dto.setMatricule(item.getMatricule());
            if(StringUtil.isNotEmpty(item.getAdressEmail()))
                dto.setAdressEmail(item.getAdressEmail());
            if(StringUtil.isNotEmpty(item.getCompteBancaire()))
                dto.setCompteBancaire(item.getCompteBancaire());
            if(StringUtil.isNotEmpty(item.getNombreAbsence()))
                dto.setNombreAbsence(item.getNombreAbsence());
            if(StringUtil.isNotEmpty(item.getLocal()))
                dto.setLocal(item.getLocal());
        if(this.sexe && item.getSexe()!=null) {
            dto.setSexe(sexeConverter.toDto(item.getSexe())) ;
        }
        if(this.parcoursUniversitaire && item.getParcoursUniversitaire()!=null) {
            dto.setParcoursUniversitaire(parcoursUniversitaireConverter.toDto(item.getParcoursUniversitaire())) ;
        }
        if(this.departement && item.getDepartement()!=null) {
            departementConverter.setEmploye(false);
            dto.setDepartement(departementConverter.toDto(item.getDepartement())) ;
            departementConverter.setEmploye(true);
        }
        if(this.poste && item.getPoste()!=null) {
            dto.setPoste(posteConverter.toDto(item.getPoste())) ;
        }
        if(this.notation && item.getNotation()!=null) {
            dto.setNotation(notationConverter.toDto(item.getNotation())) ;
        }
        if(this.conges && item.getConges()!=null) {
            dto.setConges(congesConverter.toDto(item.getConges())) ;
        }
        if(this.echelle && item.getEchelle()!=null) {
            dto.setEchelle(echelleConverter.toDto(item.getEchelle())) ;
        }
        if(this.echelon && item.getEchelon()!=null) {
            dto.setEchelon(echelonConverter.toDto(item.getEchelon())) ;
        }
        if(this.grade && item.getGrade()!=null) {
            dto.setGrade(gradeConverter.toDto(item.getGrade())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.sexe = value;
        this.parcoursUniversitaire = value;
        this.departement = value;
        this.poste = value;
        this.notation = value;
        this.conges = value;
        this.echelle = value;
        this.echelon = value;
        this.grade = value;
    }


    public EchelonConverter getEchelonConverter(){
        return this.echelonConverter;
    }
    public void setEchelonConverter(EchelonConverter echelonConverter ){
        this.echelonConverter = echelonConverter;
    }
    public EchelleConverter getEchelleConverter(){
        return this.echelleConverter;
    }
    public void setEchelleConverter(EchelleConverter echelleConverter ){
        this.echelleConverter = echelleConverter;
    }
    public ParcoursUniversitaireConverter getParcoursUniversitaireConverter(){
        return this.parcoursUniversitaireConverter;
    }
    public void setParcoursUniversitaireConverter(ParcoursUniversitaireConverter parcoursUniversitaireConverter ){
        this.parcoursUniversitaireConverter = parcoursUniversitaireConverter;
    }
    public DepartementConverter getDepartementConverter(){
        return this.departementConverter;
    }
    public void setDepartementConverter(DepartementConverter departementConverter ){
        this.departementConverter = departementConverter;
    }
    public SexeConverter getSexeConverter(){
        return this.sexeConverter;
    }
    public void setSexeConverter(SexeConverter sexeConverter ){
        this.sexeConverter = sexeConverter;
    }
    public PosteConverter getPosteConverter(){
        return this.posteConverter;
    }
    public void setPosteConverter(PosteConverter posteConverter ){
        this.posteConverter = posteConverter;
    }
    public CongesConverter getCongesConverter(){
        return this.congesConverter;
    }
    public void setCongesConverter(CongesConverter congesConverter ){
        this.congesConverter = congesConverter;
    }
    public GradeConverter getGradeConverter(){
        return this.gradeConverter;
    }
    public void setGradeConverter(GradeConverter gradeConverter ){
        this.gradeConverter = gradeConverter;
    }
    public NotationConverter getNotationConverter(){
        return this.notationConverter;
    }
    public void setNotationConverter(NotationConverter notationConverter ){
        this.notationConverter = notationConverter;
    }
    public boolean  isSexe(){
        return this.sexe;
    }
    public void  setSexe(boolean sexe){
        this.sexe = sexe;
    }
    public boolean  isParcoursUniversitaire(){
        return this.parcoursUniversitaire;
    }
    public void  setParcoursUniversitaire(boolean parcoursUniversitaire){
        this.parcoursUniversitaire = parcoursUniversitaire;
    }
    public boolean  isDepartement(){
        return this.departement;
    }
    public void  setDepartement(boolean departement){
        this.departement = departement;
    }
    public boolean  isPoste(){
        return this.poste;
    }
    public void  setPoste(boolean poste){
        this.poste = poste;
    }
    public boolean  isNotation(){
        return this.notation;
    }
    public void  setNotation(boolean notation){
        this.notation = notation;
    }
    public boolean  isConges(){
        return this.conges;
    }
    public void  setConges(boolean conges){
        this.conges = conges;
    }
    public boolean  isEchelle(){
        return this.echelle;
    }
    public void  setEchelle(boolean echelle){
        this.echelle = echelle;
    }
    public boolean  isEchelon(){
        return this.echelon;
    }
    public void  setEchelon(boolean echelon){
        this.echelon = echelon;
    }
    public boolean  isGrade(){
        return this.grade;
    }
    public void  setGrade(boolean grade){
        this.grade = grade;
    }
}

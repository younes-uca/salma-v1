package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.bean.history.EmployeHistory;
import ma.sir.hr.dao.criteria.core.EmployeCriteria;
import ma.sir.hr.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.hr.dao.facade.core.EmployeDao;
import ma.sir.hr.dao.facade.history.EmployeHistoryDao;
import ma.sir.hr.dao.specification.core.EmployeSpecification;
import ma.sir.hr.service.facade.admin.EmployeAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.hr.service.facade.admin.EchelonAdminService ;
import ma.sir.hr.service.facade.admin.EchelleAdminService ;
import ma.sir.hr.service.facade.admin.ParcoursUniversitaireAdminService ;
import ma.sir.hr.service.facade.admin.DepartementAdminService ;
import ma.sir.hr.service.facade.admin.SexeAdminService ;
import ma.sir.hr.service.facade.admin.PosteAdminService ;
import ma.sir.hr.service.facade.admin.CongesAdminService ;
import ma.sir.hr.service.facade.admin.GradeAdminService ;
import ma.sir.hr.service.facade.admin.NotationAdminService ;


import java.util.List;
@Service
public class EmployeAdminServiceImpl extends AbstractServiceImpl<Employe,EmployeHistory, EmployeCriteria, EmployeHistoryCriteria, EmployeDao,
EmployeHistoryDao> implements EmployeAdminService {


    public Employe findByReferenceEntity(Employe t){
        return  dao.findByPassword(t.getPassword());
    }

    public List<Employe> findBySexeId(Long id){
        return dao.findBySexeId(id);
    }
    public int deleteBySexeId(Long id){
        return dao.deleteBySexeId(id);
    }
    public List<Employe> findByParcoursUniversitaireId(Long id){
        return dao.findByParcoursUniversitaireId(id);
    }
    public int deleteByParcoursUniversitaireId(Long id){
        return dao.deleteByParcoursUniversitaireId(id);
    }
    public List<Employe> findByDepartementId(Long id){
        return dao.findByDepartementId(id);
    }
    public int deleteByDepartementId(Long id){
        return dao.deleteByDepartementId(id);
    }
    public List<Employe> findByPosteId(Long id){
        return dao.findByPosteId(id);
    }
    public int deleteByPosteId(Long id){
        return dao.deleteByPosteId(id);
    }
    public List<Employe> findByNotationId(Long id){
        return dao.findByNotationId(id);
    }
    public int deleteByNotationId(Long id){
        return dao.deleteByNotationId(id);
    }
    public List<Employe> findByCongesId(Long id){
        return dao.findByCongesId(id);
    }
    public int deleteByCongesId(Long id){
        return dao.deleteByCongesId(id);
    }
    public List<Employe> findByEchelleId(Long id){
        return dao.findByEchelleId(id);
    }
    public int deleteByEchelleId(Long id){
        return dao.deleteByEchelleId(id);
    }
    public List<Employe> findByEchelonId(Long id){
        return dao.findByEchelonId(id);
    }
    public int deleteByEchelonId(Long id){
        return dao.deleteByEchelonId(id);
    }
    public List<Employe> findByGradeId(Long id){
        return dao.findByGradeId(id);
    }
    public int deleteByGradeId(Long id){
        return dao.deleteByGradeId(id);
    }

    public void configure() {
        super.configure(Employe.class,EmployeHistory.class, EmployeHistoryCriteria.class, EmployeSpecification.class);
    }

    @Autowired
    private EchelonAdminService echelonService ;
    @Autowired
    private EchelleAdminService echelleService ;
    @Autowired
    private ParcoursUniversitaireAdminService parcoursUniversitaireService ;
    @Autowired
    private DepartementAdminService departementService ;
    @Autowired
    private SexeAdminService sexeService ;
    @Autowired
    private PosteAdminService posteService ;
    @Autowired
    private CongesAdminService congesService ;
    @Autowired
    private GradeAdminService gradeService ;
    @Autowired
    private NotationAdminService notationService ;
    public EmployeAdminServiceImpl(EmployeDao dao, EmployeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
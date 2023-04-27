package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.dao.criteria.core.EmployeCriteria;
import ma.sir.hr.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;

public interface EmployeAdminService extends  IService<Employe,EmployeCriteria, EmployeHistoryCriteria>  {

    List<Employe> findBySexeId(Long id);
    int deleteBySexeId(Long id);
    List<Employe> findByParcoursUniversitaireId(Long id);
    int deleteByParcoursUniversitaireId(Long id);
    List<Employe> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<Employe> findByPosteId(Long id);
    int deleteByPosteId(Long id);
    List<Employe> findByNotationId(Long id);
    int deleteByNotationId(Long id);
    List<Employe> findByCongesId(Long id);
    int deleteByCongesId(Long id);
    List<Employe> findByEchelleId(Long id);
    int deleteByEchelleId(Long id);
    List<Employe> findByEchelonId(Long id);
    int deleteByEchelonId(Long id);
    List<Employe> findByGradeId(Long id);
    int deleteByGradeId(Long id);



}

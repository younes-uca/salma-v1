package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Employe;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.Employe;
import java.util.List;


@Repository
public interface EmployeDao extends AbstractRepository<Employe,Long>  {
    Employe findByPassword(String password);
    int deleteByPassword(String password);

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

    @Query("SELECT NEW Employe(item.id,item.password) FROM Employe item")
    List<Employe> findAllOptimized();
}

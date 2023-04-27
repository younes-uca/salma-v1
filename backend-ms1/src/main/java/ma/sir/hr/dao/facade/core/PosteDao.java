package ma.sir.hr.dao.facade.core;

import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Poste;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PosteDao extends AbstractRepository<Poste,Long>  {

    List<Poste> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);

}

package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Poste;
import ma.sir.hr.dao.criteria.core.PosteCriteria;
import ma.sir.hr.dao.criteria.history.PosteHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;

public interface PosteAdminService extends  IService<Poste,PosteCriteria, PosteHistoryCriteria>  {

    List<Poste> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);



}

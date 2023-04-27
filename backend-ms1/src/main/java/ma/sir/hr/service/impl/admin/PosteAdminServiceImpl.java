package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Poste;
import ma.sir.hr.bean.history.PosteHistory;
import ma.sir.hr.dao.criteria.core.PosteCriteria;
import ma.sir.hr.dao.criteria.history.PosteHistoryCriteria;
import ma.sir.hr.dao.facade.core.PosteDao;
import ma.sir.hr.dao.facade.history.PosteHistoryDao;
import ma.sir.hr.dao.specification.core.PosteSpecification;
import ma.sir.hr.service.facade.admin.PosteAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.hr.service.facade.admin.DepartementAdminService ;


import java.util.List;
@Service
public class PosteAdminServiceImpl extends AbstractServiceImpl<Poste,PosteHistory, PosteCriteria, PosteHistoryCriteria, PosteDao,
PosteHistoryDao> implements PosteAdminService {



    public List<Poste> findByDepartementId(Long id){
        return dao.findByDepartementId(id);
    }
    public int deleteByDepartementId(Long id){
        return dao.deleteByDepartementId(id);
    }

    public void configure() {
        super.configure(Poste.class,PosteHistory.class, PosteHistoryCriteria.class, PosteSpecification.class);
    }

    @Autowired
    private DepartementAdminService departementService ;
    public PosteAdminServiceImpl(PosteDao dao, PosteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
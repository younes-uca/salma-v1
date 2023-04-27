package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Notation;
import ma.sir.hr.bean.history.NotationHistory;
import ma.sir.hr.dao.criteria.core.NotationCriteria;
import ma.sir.hr.dao.criteria.history.NotationHistoryCriteria;
import ma.sir.hr.dao.facade.core.NotationDao;
import ma.sir.hr.dao.facade.history.NotationHistoryDao;
import ma.sir.hr.dao.specification.core.NotationSpecification;
import ma.sir.hr.service.facade.admin.NotationAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NotationAdminServiceImpl extends AbstractServiceImpl<Notation,NotationHistory, NotationCriteria, NotationHistoryCriteria, NotationDao,
NotationHistoryDao> implements NotationAdminService {




    public void configure() {
        super.configure(Notation.class,NotationHistory.class, NotationHistoryCriteria.class, NotationSpecification.class);
    }

    public NotationAdminServiceImpl(NotationDao dao, NotationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
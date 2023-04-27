package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Local;
import ma.sir.hr.bean.history.LocalHistory;
import ma.sir.hr.dao.criteria.core.LocalCriteria;
import ma.sir.hr.dao.criteria.history.LocalHistoryCriteria;
import ma.sir.hr.dao.facade.core.LocalDao;
import ma.sir.hr.dao.facade.history.LocalHistoryDao;
import ma.sir.hr.dao.specification.core.LocalSpecification;
import ma.sir.hr.service.facade.admin.LocalAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class LocalAdminServiceImpl extends AbstractServiceImpl<Local,LocalHistory, LocalCriteria, LocalHistoryCriteria, LocalDao,
LocalHistoryDao> implements LocalAdminService {




    public void configure() {
        super.configure(Local.class,LocalHistory.class, LocalHistoryCriteria.class, LocalSpecification.class);
    }

    public LocalAdminServiceImpl(LocalDao dao, LocalHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
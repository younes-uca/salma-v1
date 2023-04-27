package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.bean.history.AbsenceHistory;
import ma.sir.hr.dao.criteria.core.AbsenceCriteria;
import ma.sir.hr.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.hr.dao.facade.core.AbsenceDao;
import ma.sir.hr.dao.facade.history.AbsenceHistoryDao;
import ma.sir.hr.dao.specification.core.AbsenceSpecification;
import ma.sir.hr.service.facade.admin.AbsenceAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AbsenceAdminServiceImpl extends AbstractServiceImpl<Absence,AbsenceHistory, AbsenceCriteria, AbsenceHistoryCriteria, AbsenceDao,
AbsenceHistoryDao> implements AbsenceAdminService {




    public void configure() {
        super.configure(Absence.class,AbsenceHistory.class, AbsenceHistoryCriteria.class, AbsenceSpecification.class);
    }

    public AbsenceAdminServiceImpl(AbsenceDao dao, AbsenceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Conges;
import ma.sir.hr.bean.history.CongesHistory;
import ma.sir.hr.dao.criteria.core.CongesCriteria;
import ma.sir.hr.dao.criteria.history.CongesHistoryCriteria;
import ma.sir.hr.dao.facade.core.CongesDao;
import ma.sir.hr.dao.facade.history.CongesHistoryDao;
import ma.sir.hr.dao.specification.core.CongesSpecification;
import ma.sir.hr.service.facade.admin.CongesAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class CongesAdminServiceImpl extends AbstractServiceImpl<Conges,CongesHistory, CongesCriteria, CongesHistoryCriteria, CongesDao,
CongesHistoryDao> implements CongesAdminService {




    public void configure() {
        super.configure(Conges.class,CongesHistory.class, CongesHistoryCriteria.class, CongesSpecification.class);
    }

    public CongesAdminServiceImpl(CongesDao dao, CongesHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
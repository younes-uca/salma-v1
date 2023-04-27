package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Notification;
import ma.sir.hr.bean.history.NotificationHistory;
import ma.sir.hr.dao.criteria.core.NotificationCriteria;
import ma.sir.hr.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.hr.dao.facade.core.NotificationDao;
import ma.sir.hr.dao.facade.history.NotificationHistoryDao;
import ma.sir.hr.dao.specification.core.NotificationSpecification;
import ma.sir.hr.service.facade.admin.NotificationAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NotificationAdminServiceImpl extends AbstractServiceImpl<Notification,NotificationHistory, NotificationCriteria, NotificationHistoryCriteria, NotificationDao,
NotificationHistoryDao> implements NotificationAdminService {




    public void configure() {
        super.configure(Notification.class,NotificationHistory.class, NotificationHistoryCriteria.class, NotificationSpecification.class);
    }

    public NotificationAdminServiceImpl(NotificationDao dao, NotificationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
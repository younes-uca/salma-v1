package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Notification;
import ma.sir.hr.dao.criteria.core.NotificationCriteria;
import ma.sir.hr.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;

public interface NotificationAdminService extends  IService<Notification,NotificationCriteria, NotificationHistoryCriteria>  {




}

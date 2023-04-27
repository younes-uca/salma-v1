package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.hr.bean.history.NotificationHistory;


public class NotificationHistorySpecification extends AbstractHistorySpecification<NotificationHistoryCriteria, NotificationHistory> {

    public NotificationHistorySpecification(NotificationHistoryCriteria criteria) {
        super(criteria);
    }

    public NotificationHistorySpecification(NotificationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

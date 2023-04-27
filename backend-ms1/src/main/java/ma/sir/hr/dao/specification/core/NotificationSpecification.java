package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.NotificationCriteria;
import ma.sir.hr.bean.core.Notification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class NotificationSpecification extends  AbstractSpecification<NotificationCriteria, Notification>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateNotification", criteria.getDateNotification(), criteria.getDateNotificationFrom(), criteria.getDateNotificationTo());
    }

    public NotificationSpecification(NotificationCriteria criteria) {
        super(criteria);
    }

    public NotificationSpecification(NotificationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

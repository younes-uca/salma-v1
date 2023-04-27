package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.PosteHistoryCriteria;
import ma.sir.hr.bean.history.PosteHistory;


public class PosteHistorySpecification extends AbstractHistorySpecification<PosteHistoryCriteria, PosteHistory> {

    public PosteHistorySpecification(PosteHistoryCriteria criteria) {
        super(criteria);
    }

    public PosteHistorySpecification(PosteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

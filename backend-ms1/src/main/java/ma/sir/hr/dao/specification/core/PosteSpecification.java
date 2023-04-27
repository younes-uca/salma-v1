package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.PosteCriteria;
import ma.sir.hr.bean.core.Poste;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PosteSpecification extends  AbstractSpecification<PosteCriteria, Poste>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("titre", criteria.getTitre(),criteria.getTitreLike());
        addPredicate("discription", criteria.getDiscription(),criteria.getDiscriptionLike());
        addPredicate("dateAffectation", criteria.getDateAffectation(), criteria.getDateAffectationFrom(), criteria.getDateAffectationTo());
        addPredicateFk("departement","id", criteria.getDepartement()==null?null:criteria.getDepartement().getId());
        addPredicateFk("departement","id", criteria.getDepartements());
    }

    public PosteSpecification(PosteCriteria criteria) {
        super(criteria);
    }

    public PosteSpecification(PosteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

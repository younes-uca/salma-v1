package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.EmployeCriteria;
import ma.sir.hr.bean.core.Employe;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EmployeSpecification extends  AbstractSpecification<EmployeCriteria, Employe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("login", criteria.getLogin(),criteria.getLoginLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("dateDeNaissance", criteria.getDateDeNaissance(), criteria.getDateDeNaissanceFrom(), criteria.getDateDeNaissanceTo());
        addPredicate("lieuDeNaissance", criteria.getLieuDeNaissance(),criteria.getLieuDeNaissanceLike());
        addPredicate("adresse", criteria.getAdresse(),criteria.getAdresseLike());
        addPredicate("cin", criteria.getCin(),criteria.getCinLike());
        addPredicate("tel", criteria.getTel(),criteria.getTelLike());
        addPredicate("dateEmbauche", criteria.getDateEmbauche(), criteria.getDateEmbaucheFrom(), criteria.getDateEmbaucheTo());
        addPredicateInt("matricule", criteria.getMatricule(), criteria.getMatriculeMin(), criteria.getMatriculeMax());
        addPredicate("adressEmail", criteria.getAdressEmail(),criteria.getAdressEmailLike());
        addPredicate("compteBancaire", criteria.getCompteBancaire(),criteria.getCompteBancaireLike());
        addPredicateInt("nombreAbsence", criteria.getNombreAbsence(), criteria.getNombreAbsenceMin(), criteria.getNombreAbsenceMax());
        addPredicate("local", criteria.getLocal(),criteria.getLocalLike());
        addPredicateFk("sexe","id", criteria.getSexe()==null?null:criteria.getSexe().getId());
        addPredicateFk("sexe","id", criteria.getSexes());
        addPredicateFk("sexe","reference", criteria.getSexe()==null?null:criteria.getSexe().getReference());
        addPredicateFk("parcoursUniversitaire","id", criteria.getParcoursUniversitaire()==null?null:criteria.getParcoursUniversitaire().getId());
        addPredicateFk("parcoursUniversitaire","id", criteria.getParcoursUniversitaires());
        addPredicateFk("departement","id", criteria.getDepartement()==null?null:criteria.getDepartement().getId());
        addPredicateFk("departement","id", criteria.getDepartements());
        addPredicateFk("poste","id", criteria.getPoste()==null?null:criteria.getPoste().getId());
        addPredicateFk("poste","id", criteria.getPostes());
        addPredicateFk("notation","id", criteria.getNotation()==null?null:criteria.getNotation().getId());
        addPredicateFk("notation","id", criteria.getNotations());
        addPredicateFk("conges","id", criteria.getConges()==null?null:criteria.getConges().getId());
        addPredicateFk("conges","id", criteria.getCongess());
        addPredicateFk("echelle","id", criteria.getEchelle()==null?null:criteria.getEchelle().getId());
        addPredicateFk("echelle","id", criteria.getEchelles());
        addPredicateFk("echelle","reference", criteria.getEchelle()==null?null:criteria.getEchelle().getReference());
        addPredicateFk("echelon","id", criteria.getEchelon()==null?null:criteria.getEchelon().getId());
        addPredicateFk("echelon","id", criteria.getEchelons());
        addPredicateFk("echelon","reference", criteria.getEchelon()==null?null:criteria.getEchelon().getReference());
        addPredicateFk("grade","id", criteria.getGrade()==null?null:criteria.getGrade().getId());
        addPredicateFk("grade","id", criteria.getGrades());
        addPredicateFk("grade","code", criteria.getGrade()==null?null:criteria.getGrade().getCode());
    }

    public EmployeSpecification(EmployeCriteria criteria) {
        super(criteria);
    }

    public EmployeSpecification(EmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

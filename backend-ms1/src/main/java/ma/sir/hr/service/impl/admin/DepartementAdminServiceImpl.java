package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Departement;
import ma.sir.hr.bean.history.DepartementHistory;
import ma.sir.hr.dao.criteria.core.DepartementCriteria;
import ma.sir.hr.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.hr.dao.facade.core.DepartementDao;
import ma.sir.hr.dao.facade.history.DepartementHistoryDao;
import ma.sir.hr.dao.specification.core.DepartementSpecification;
import ma.sir.hr.service.facade.admin.DepartementAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.hr.bean.core.Poste;
import ma.sir.hr.bean.core.Employe;

import ma.sir.hr.service.facade.admin.EmployeAdminService ;
import ma.sir.hr.service.facade.admin.PosteAdminService ;


import java.util.List;
@Service
public class DepartementAdminServiceImpl extends AbstractServiceImpl<Departement,DepartementHistory, DepartementCriteria, DepartementHistoryCriteria, DepartementDao,
DepartementHistoryDao> implements DepartementAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Departement create(Departement t) {
        super.create(t);
        if (t.getPostes() != null) {
                t.getPostes().forEach(element-> {
                    element.setDepartement(t);
                    posteService.create(element);
            });
        }
        if (t.getEmployes() != null) {
                t.getEmployes().forEach(element-> {
                    element.setDepartement(t);
                    employeService.create(element);
            });
        }
        return t;
    }

    public Departement findWithAssociatedLists(Long id){
        Departement result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setPostes(posteService.findByDepartementId(id));
            result.setEmployes(employeService.findByDepartementId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        posteService.deleteByDepartementId(id);
        employeService.deleteByDepartementId(id);
    }


    public void updateWithAssociatedLists(Departement departement){
    if(departement !=null && departement.getId() != null){
            List<List<Poste>> resultPostes= posteService.getToBeSavedAndToBeDeleted(posteService.findByDepartementId(departement.getId()),departement.getPostes());
            posteService.delete(resultPostes.get(1));
            ListUtil.emptyIfNull(resultPostes.get(0)).forEach(e -> e.setDepartement(departement));
            posteService.update(resultPostes.get(0),true);
            List<List<Employe>> resultEmployes= employeService.getToBeSavedAndToBeDeleted(employeService.findByDepartementId(departement.getId()),departement.getEmployes());
            employeService.delete(resultEmployes.get(1));
            ListUtil.emptyIfNull(resultEmployes.get(0)).forEach(e -> e.setDepartement(departement));
            employeService.update(resultEmployes.get(0),true);
    }
    }


    public List<Departement> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }

    public void configure() {
        super.configure(Departement.class,DepartementHistory.class, DepartementHistoryCriteria.class, DepartementSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;
    @Autowired
    private PosteAdminService posteService ;
    public DepartementAdminServiceImpl(DepartementDao dao, DepartementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
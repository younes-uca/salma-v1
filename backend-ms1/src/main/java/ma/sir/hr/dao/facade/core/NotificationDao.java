package ma.sir.hr.dao.facade.core;

import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Notification;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface NotificationDao extends AbstractRepository<Notification,Long>  {


}

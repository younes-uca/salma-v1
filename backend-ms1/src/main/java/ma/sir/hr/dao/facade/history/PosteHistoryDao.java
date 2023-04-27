package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.PosteHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteHistoryDao extends AbstractHistoryRepository<PosteHistory,Long> {

}

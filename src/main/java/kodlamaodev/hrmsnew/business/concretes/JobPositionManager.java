package kodlamaodev.hrmsnew.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaodev.hrmsnew.business.abstracts.JobPositionService;
import kodlamaodev.hrmsnew.dataAccess.abstracts.JobPositionDao;
import kodlamaodev.hrmsnew.entities.concretes.JobPosition;

@Service    //isminde service geçmediği için bunu yazmak zorundayız.JobPositionManager
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return jobPositionDao.findAll();
		
		
	}
	
	

}

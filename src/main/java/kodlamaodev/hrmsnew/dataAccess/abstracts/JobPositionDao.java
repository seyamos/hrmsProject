package kodlamaodev.hrmsnew.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaodev.hrmsnew.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}

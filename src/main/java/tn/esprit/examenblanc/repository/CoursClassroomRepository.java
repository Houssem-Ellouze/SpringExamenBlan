package tn.esprit.examenblanc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entity.CoursClassroom;
@Repository
public interface CoursClassroomRepository extends JpaRepository<CoursClassroom, Integer> {

}

package repositories;

import entity.StudentEnrolledCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentEnrolledCourseRepository extends JpaRepository<StudentEnrolledCourse, String> {

    @Query("from StudentEnrolledCourse sc where sc.studentId = :studentId")
    public List<StudentEnrolledCourse> findAllByStudentId(String studentId);
}

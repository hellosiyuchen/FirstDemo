package controller;

import entity.Course;
import entity.Student;
import entity.StudentEnrolledCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.CourseRepository;
import repositories.StudentEnrolledCourseRepository;
import repositories.StudentRepository;

import java.util.List;

@RestController
public class AntraTestController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentEnrolledCourseRepository studentEnrolledCourseRepository;

  @GetMapping("/student/{studentId}")
    public Student findStudent(@PathVariable(name = "studentId") String studentId) {
        return studentRepository.findById(studentId).get();
    }

    @PutMapping("/course")
    public Course saveCourse(@RequestBody Course course) {
        return courseRepository.save(course);

    }

    @GetMapping("/courses/{id}")
    public List<StudentEnrolledCourse> findAllCourses(@PathVariable String id) {
        return studentEnrolledCourseRepository.findAllByStudentId(id);
    }
}

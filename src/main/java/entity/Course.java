package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @Column(name = "classId", unique = true)
    private String classId;

    @Column(name = "className")
    private String className;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classId")
    private Set<StudentEnrolledCourse> studentEnrolledCourses = new HashSet<>();
}

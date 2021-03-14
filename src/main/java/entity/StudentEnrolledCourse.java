package entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

public class StudentEnrolledCourse {
    @Id
    @Column(name = "id", unique = true)
    @NotNull
    private String className;

    @Column(name = "studentId")
    private String studentId;

    @Column(name = "classId")
    private String classId;

    @Column(name = "semester")
    private String semester;

    @Column(name = "grade")
    private double grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classId")
    private Course course;
}

package entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "studentId", unique = true)
    @NotNull
    private String studentId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "currentGPA")
    private double currentGPA;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "studentId")
    private Set<StudentEnrolledCourse> studentEnrolledCourses = new HashSet<>();

    public Student(String studentId, String firstname, String lastname, double currentGPA) {
        this.studentId = studentId;
        this.firstName = firstname;
        this.lastName = lastname;
        this.currentGPA = currentGPA;
    }

//    public String getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getFirstname() {
//        return firstName;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstName = firstname;
//    }
//
//    public String getLastname() {
//        return lastName;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastName = lastname;
//    }
//
//    public double getCurrentGPA() {
//        return currentGPA;
//    }
//
//    public void setCurrentGPA(double currentGPA) {
//        this.currentGPA = currentGPA;
//    }
}

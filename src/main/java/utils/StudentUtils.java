//package utils;
//
//import entity.Student;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class StudentUtils {
//    public static void main(String[] args) {
//
//        Student s1 = new Student("0824", "Siyu", "Chen", 3.8);
//
//        Student s2 = new Student("2356", "Long", "Li", 3.3);
//
//        List<Student> students = new ArrayList<Student>();
//
//        students.add(s1);
//
//        students.add(s2);
//
//        getHonorStudens(students);
//
//    }
//
//    public List<Student> getHonorStudens(List<Student> list) {
//        List<Student> result = new ArrayList<Student>();
//        for (Student student: list) {
//            if (student.getCurrentGPA() >= 3.5)
//                result.add(student);
//        }
//
//        return result;
//    }
//
//}
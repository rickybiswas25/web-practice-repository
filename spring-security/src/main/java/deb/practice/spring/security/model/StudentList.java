package deb.practice.spring.security.model;

import java.util.List;

/**
 * Created by Deb
 * Date : 13/07/2020.
 */
public class StudentList {
    private List<Student> students;

    public StudentList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}

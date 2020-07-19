package deb.practice.spring.security.controller;

import deb.practice.spring.security.model.Student;
import deb.practice.spring.security.model.StudentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Deb
 * Date : 13/07/2020.
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentList students;

    @Autowired
    public StudentController(StudentList students) {
        this.students = students;
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        this.students.addStudent(student);
        return student;
    }

    @PostMapping("/delete")
    public Student deleteStudent(@RequestBody Student student) {
        this.students.getStudents().remove(student);
        return student;
    }

    @GetMapping
    public StudentList getStudents() {
        return students;
    }
}

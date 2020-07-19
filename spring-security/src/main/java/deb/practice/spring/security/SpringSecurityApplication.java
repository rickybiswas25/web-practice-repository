package deb.practice.spring.security;

import deb.practice.spring.security.model.Student;
import deb.practice.spring.security.model.StudentList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deb
 * Date : 13/07/2020.
 */
@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

    @Bean
    public StudentList allUsers() {
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(new Student(1, "Mike"));
        allStudents.add(new Student(2, "John"));
        allStudents.add(new Student(3, "Sam"));
        return new StudentList(allStudents);
    }
}

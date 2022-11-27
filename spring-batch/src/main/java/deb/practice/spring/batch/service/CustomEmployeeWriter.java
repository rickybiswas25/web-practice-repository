package deb.practice.spring.batch.service;

import deb.practice.spring.batch.entity.Employee;
import deb.practice.spring.batch.repository.EmployeeRepository;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by Deb
 * Date : 11/27/2022
 */
public class CustomEmployeeWriter implements ItemWriter<Employee> {
    private final EmployeeRepository repo;

    public CustomEmployeeWriter(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public void write(List<? extends Employee> list) {
        list.forEach(repo::save);
    }
}

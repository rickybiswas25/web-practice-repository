package deb.practice.spring.batch.service;

import deb.practice.spring.batch.entity.Employee;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by Deb
 * Date : 11/27/2022
 */
public class CustomEmployeeProcessor implements ItemProcessor<Employee, Employee> {
    @Override
    public Employee process(Employee employee) {
        return employee;
    }
}

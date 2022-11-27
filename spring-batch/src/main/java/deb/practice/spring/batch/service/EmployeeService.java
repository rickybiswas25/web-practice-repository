package deb.practice.spring.batch.service;

import deb.practice.spring.batch.entity.Employee;

import java.util.List;

/**
 * Created by Deb
 * Date : 11/27/2022
 */
public interface EmployeeService {
    List<Employee> getEmployees();

}

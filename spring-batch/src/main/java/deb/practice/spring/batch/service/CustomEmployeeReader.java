package deb.practice.spring.batch.service;

import deb.practice.spring.batch.controller.SpringBatchController;
import deb.practice.spring.batch.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;


/**
 * Created by Deb
 * Date : 11/27/2022
 */
public class CustomEmployeeReader implements ItemReader<Employee> {
    private int index;
    private final EmployeeService service;

    public CustomEmployeeReader(EmployeeService service) {
        this.service = service;
    }

    @Override
    public Employee read() {
        return this.service.getEmployees().size() > this.index ? this.service.getEmployees().get(index++) : null;
    }
}

package deb.practice.spring.batch.service;

import com.google.common.collect.Lists;
import deb.practice.spring.batch.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Deb
 * Date : 11/27/2022
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getEmployees() {
        return Lists.newArrayList(
                new Employee(1, "Approrva", "a@gmail.com", 22),
                new Employee(2, "Bidesh", "b@gmail.com", 25),
                new Employee(3, "Chandan", "c@gmail.com", 28),
                new Employee(4, "Dinesh", "d@gmail.com", 23),
                new Employee(6, "Farahn", "f@gmail.com", 24),
                new Employee(7,"Ganesh", "g@gmail.com", 29),
                new Employee(8,"Hasan", "h@gmail.com", 20),
                new Employee(9,"Ishant", "i@gmail.com", 24),
                new Employee(10,"Jignesh", "j@gmail.com", 30),
                new Employee(11,"Komal", "k@gmail.com", 35),
                new Employee(12,"Lalit", "l@gmail.com", 36),
                new Employee(13,"Reshma", "r@gmail.com", 31),
                new Employee(14,"Manas", "m@gmail.com", 24),
                new Employee(15,"Menka", "me@gmail.com", 23),
                new Employee(16,"Mili", "mi@gmail.com", 22),
                new Employee(17,"Manish", "ma@gmail.com", 32),
                new Employee(18,"Reshma", "r@gmail.com", 33),
                new Employee(19,"Rishi", "ri@gmail.com", 27),
                new Employee(20,"Nipun", "ni@gmail.com", 29)
        );
    }
}

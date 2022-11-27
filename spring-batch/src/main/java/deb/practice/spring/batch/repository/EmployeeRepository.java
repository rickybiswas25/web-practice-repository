package deb.practice.spring.batch.repository;

import deb.practice.spring.batch.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Deb
 * Date : 11/27/2022
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}

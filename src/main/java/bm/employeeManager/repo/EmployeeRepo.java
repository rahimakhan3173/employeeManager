package bm.employeeManager.repo;

import java.util.Optional;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import bm.employeeManager.model.Employee;

public interface EmployeeRepo extends DataTablesRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}

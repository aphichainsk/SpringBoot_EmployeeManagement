package net.javaguides.ems_backend.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.ems_backend.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom query methods can be defined here if needed
    
}
package net.javaguides.ems_backend.Mapper;
import net.javaguides.ems_backend.DTO.EmployeeDto;
import net.javaguides.ems_backend.Entities.Employee;

public class EmployeeMapper {
  public static EmployeeDto mapToEmployeeDto(Employee employee){
    return new EmployeeDto(
      employee.getId(),
      employee.getFirstName(),
      employee.getLastName(),
      employee.getEmail()
    );
  }

  public static Employee mapToEmployee(EmployeeDto employeeDto){
    return new Employee(
      employeeDto.getId(),
      employeeDto.getFirstName(),
      employeeDto.getLastName(),
      employeeDto.getEmail()
    );
  }
}

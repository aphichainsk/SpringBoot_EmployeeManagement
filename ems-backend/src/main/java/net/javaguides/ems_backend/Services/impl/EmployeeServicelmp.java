package net.javaguides.ems_backend.Services.impl;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.ems_backend.DTO.EmployeeDto;
import net.javaguides.ems_backend.Entities.Employee;
import net.javaguides.ems_backend.Mapper.EmployeeMapper;
import net.javaguides.ems_backend.Repository.EmployeeRepository;
import net.javaguides.ems_backend.Services.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServicelmp implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        // Logic to create an employee
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);        
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        // Logic to get an employee by ID
        Employee employee = employeeRepository.findById(employeeId)
            .orElseThrow(() -> new RuntimeException("Employee not found with given id : "+ employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    
    // Build Get All Employees
    @Override
    public List<EmployeeDto> getAllEmployee() {
        List <Employee> employees = employeeRepository.findAll();

       return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
       .collect(Collectors.toList());
    }



   

    
}

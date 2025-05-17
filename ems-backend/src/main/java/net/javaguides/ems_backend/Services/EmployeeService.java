package net.javaguides.ems_backend.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.ems_backend.DTO.EmployeeDto;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployee(); 
        
  
}

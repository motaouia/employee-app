package org.medmota.employeeapp.service;

import java.util.List;
import java.util.Optional;

import org.medmota.employeeapp.data.models.Employee;
import org.medmota.employeeapp.data.payloads.request.EmployeeRequest;
import org.medmota.employeeapp.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

@Component
public interface IEmployeeService {
	
	MessageResponse createEmployee(EmployeeRequest employeeRequest);
	Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest);
	void deletEmployee(Integer employeeId);
	Employee getAsSingleEmployee(Integer employeeId);
	List<Employee> getAllEmployees();

}

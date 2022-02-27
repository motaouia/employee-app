package org.medmota.employeeapp.service;

import java.util.List;
import java.util.Optional;

import org.medmota.employeeapp.data.models.Employee;
import org.medmota.employeeapp.data.payloads.request.EmployeeRequest;
import org.medmota.employeeapp.data.payloads.response.MessageResponse;
import org.medmota.employeeapp.data.repository.EmployeeRepository;
import org.medmota.employeeapp.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public MessageResponse createEmployee(EmployeeRequest employeeRequest) {
		Employee employee = new Employee();
		
		employee.setFirstName(employeeRequest.getFirstName());
		employee.setLastName(employeeRequest.getLastName());
		employee.setPhoneNumber(employeeRequest.getPhoneNumber());
		employee.setEmail(employeeRequest.getEmail());
		employee.setSalary(employeeRequest.getSalary());
		employee.setDepartment(employeeRequest.getDepartment());
		
		employeeRepository.save(employee);
		
		return new MessageResponse("New Employee created successfully!!");
	}

	@Override
	public Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest) {
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		if(employee.isEmpty()) {
			throw new ResourceNotFoundException("Employee", "id", employeeId);
		}
		else {
			employee.get().setFirstName(employeeRequest.getFirstName());
			employee.get().setLastName(employeeRequest.getLastName());
			employee.get().setPhoneNumber(employeeRequest.getPhoneNumber());
			employee.get().setEmail(employeeRequest.getEmail());
			employee.get().setSalary(employeeRequest.getSalary());
			employee.get().setDepartment(employeeRequest.getDepartment());
			
			employeeRepository.save(employee.get());
			
			return employee;
		}
	}

	@Override
	public void deletEmployee(Integer employeeId) throws ResourceNotFoundException {
		if (employeeRepository.getById(employeeId).getId().equals(employeeId)){
            employeeRepository.deleteById(employeeId);
        }
        else throw new ResourceNotFoundException("Employee", "id", employeeId);
		

	}

	@Override
	public Employee getAsSingleEmployee(Integer employeeId) {
		return employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Empolyee", "id", employeeId));
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}

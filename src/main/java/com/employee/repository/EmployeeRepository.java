package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.employee.model.Employee;
import com.employee.model.Meetings;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
	public void addEmployees(Employee employee);

	public void updateEmployees(Employee employee);

	public List<Employee> listEmployees();

	public Employee getEmployeeById(int id);

	public void deleteEmployees(int employeeId);
}

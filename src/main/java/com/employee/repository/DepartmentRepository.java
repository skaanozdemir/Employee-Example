package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.employee.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
	public void addDepartment(Department department);

	public void updateDepartment(Department department);

	public List<Department> listDepartments();

	public Department getDepartmentById(int id);

	public void deleteDepartment(int departmentId);
}

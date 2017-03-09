package com.employee.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.employee.model.Department;
import com.employee.model.Employee;
import com.employee.model.Meetings;
import com.employee.repository.DepartmentRepository;
import com.employee.repository.EmployeeRepository;
import com.employee.repository.MeetingsRepository;

@Repository
public class EmployeeDAOImpl implements EmployeeRepository {

	private SessionFactory sessionFactory;

	@Override
	public void addEmployees(Employee employee) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(employee);
		System.out.println("Employees saved successfully");
	}

	@Override
	public void updateEmployees(Employee employee) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(employee);
		System.out.println("Employees updated successfully");

	}

	@Override
	public void deleteEmployees(int employeeId) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Meetings.class, new Integer(employeeId));
		if (employee != null) {
			session.delete(employee);
			System.out.println("Employee deleted successfully" + employee);
		}
	}

	public List<Employee> listEmployees() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> employeeList = session.createQuery("from Department").list();
		for (Employee d : employeeList) {
			System.out.println("Employee loaded successfully" + d);
		}

		return employeeList;

	}

	public Employee getEmployeeById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Employee.class, new Integer(id));
		System.out.println("Employee loaded successfully");
		return employee;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public <S extends Employee> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Employee> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Employee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}

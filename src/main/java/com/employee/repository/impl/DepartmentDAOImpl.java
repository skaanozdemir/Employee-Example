package com.employee.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.employee.model.Department;
import com.employee.repository.DepartmentRepository;

@Repository
public class DepartmentDAOImpl implements DepartmentRepository {

	private SessionFactory sessionFactory;

	@Override
	public void addDepartment(Department department) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(department);
		System.out.println("Department saved successfully");
	}

	@Override
	public void updateDepartment(Department department) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(department);
		System.out.println("Department updated successfully");

	}

	@Override
	public void deleteDepartment(int departmentId) {
		Session session = this.sessionFactory.getCurrentSession();
		Department department = (Department) session.load(Department.class, new Integer(departmentId));
		if (department != null) {
			session.delete(department);
			System.out.println("Department deleted successfully" + department);
		}
	}

	public List<Department> listDepartments() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Department> departmentList = session.createQuery("from Department").list();
		for (Department d : departmentList) {
			System.out.println("Department loaded successfully" + d);
		}

		return departmentList;

	}

	public Department getDepartmentById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Department department = (Department) session.load(Department.class, new Integer(id));
		System.out.println("Department loaded successfully");
		return department;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public <S extends Department> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Department> findAll(Iterable<Integer> ids) {
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
	public void delete(Department entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Department> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}

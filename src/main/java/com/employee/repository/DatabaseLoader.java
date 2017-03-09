package com.employee.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;

import com.employee.model.Department;
import com.employee.model.Employee;
import com.employee.model.Meetings;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository employeeRepository;
	private final DepartmentRepository departmentRepository;
	private final MeetingsRepository meetingsRepository;

	@Autowired
	public DatabaseLoader(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository,
			MeetingsRepository meetingsRepository) {
		this.employeeRepository = employeeRepository;
		this.departmentRepository = departmentRepository;
		this.meetingsRepository = meetingsRepository;
	}

	@Override
	public void run(String... strings) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jcg-JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Employee employee = new Employee();
		employee.setName("Kaan");
		employee.setSurName("Özdemir");
		employee.setSalary(6500.00);
		employeeRepository.addEmployees(employee);

		Department department = new Department();
		department.setDepartmentName("SATIŞ");
		department.setDescription("Ürün tavsiyesi");
		department.setEmployeeId(1);
		departmentRepository.addDepartment(department);

		Meetings meetings = new Meetings();
		meetings.setMeetingsName("PROJE TOPLANTI");
		meetings.setMeetingsDesc("YENİ ÜRÜN HAKKINDA BİLGİ");
		meetings.setDepartmentId(1);
		meetingsRepository.addMeetings(meetings);

	}
}

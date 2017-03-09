package com.employee.model;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name = "DEPARTMENT")
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3608517648385848698L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int departmentId;

	@Pattern(regexp = "([a-zA-Z]*(\\s?[a-zA-Z]+))*")
	@Column(name = "NAME", length = 45, nullable = false)
	private String departmentName;

	@Column(name = "DESCRIPTION", length = 50)
	private String description;

	@Column(name = "EMPLOYEE_ID", nullable = false)
	private Integer employeeId;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Department() {
	}

	public Department(String departmentName, String description, Integer employeeId) {
		this.departmentName = departmentName;
		this.description = description;
		this.employeeId = employeeId;
	}
}

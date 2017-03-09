package com.employee.model;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;

@Data
@Entity
@Table(name = "EMPLOYEES")
public class Employee implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3683616041554373234L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME", length = 45, nullable = false)
    private String name;

    @Column(name = "SUR_NAME", length = 45, nullable = false)
    private String surName;

    @Column(name = "SALARY", nullable = false)
    private Double salary;

    public Employee(String name, String surName, double salary) {
        this.setName(name);
        this.setSurName(surName);
        this.setSalary(salary);
    }

	public Employee() {
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

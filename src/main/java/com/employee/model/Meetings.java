package com.employee.model;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MEETINGS")
public class Meetings implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4097310951879633685L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME", length = 45, nullable = false)
    private String meetingsName;

    @Column(name = "DESCRIPTION", length = 45, nullable = false)
    private String meetingsDesc;

    @Column(name = "DEPARTMENT_ID", nullable = false)
    private Integer departmentId;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMeetingsName() {
		return meetingsName;
	}

	public void setMeetingsName(String meetingsName) {
		this.meetingsName = meetingsName;
	}

	public String getMeetingsDesc() {
		return meetingsDesc;
	}

	public void setMeetingsDesc(String meetingsDesc) {
		this.meetingsDesc = meetingsDesc;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Meetings() {
    }

    public Meetings(String meetingsName, String meetingsDesc, Integer departmentId) {
        this.meetingsName =meetingsName;
        this.meetingsDesc = meetingsDesc;
        this.departmentId = departmentId;
    }
}

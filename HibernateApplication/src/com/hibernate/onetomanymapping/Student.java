package com.hibernate.onetomanymapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	private int studntId;
	private String studentName;
	private College college;
	@Id
	@GeneratedValue
	public int getStudntId() {
		return studntId;
	}
	public void setStudntId(int studntId) {
		this.studntId = studntId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@ManyToOne
	@JoinColumn(name = "collegeId")
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
}

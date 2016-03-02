package com.hibernate.chapter1;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "stuentInfo11")
public class Student {

	private int student_id;
	private String student_name;
	
	private String student_password;
	private String student_Email;
	private boolean isPermanent;
	private Calendar student_joinDate;
	private Date student_loginTime;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="stuID")
	@TableGenerator(name="stuID", table="stupkid", pkColumnName="stukey", pkColumnValue = "stuvalue", allocationSize=1)
	@Column(name = "StudentId")
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	@Transient
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	@Column(nullable=false)
	public String getStudent_Email() {
		return student_Email;
	}
	public void setStudent_Email(String student_Email) {
		this.student_Email = student_Email;
	}
	@Basic
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	@Temporal(TemporalType.DATE)
	public Calendar getStudent_joinDate() {
		return student_joinDate;
	}
	public void setStudent_joinDate(Calendar student_joinDate) {
		this.student_joinDate = student_joinDate;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStudent_loginTime() {
		return student_loginTime;
	}
	public void setStudent_loginTime(Date student_loginTime) {
		this.student_loginTime = student_loginTime;
	}
}

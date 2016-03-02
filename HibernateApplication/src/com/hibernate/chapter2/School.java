package com.hibernate.chapter2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="school")
@SecondaryTable(name="school_details")
public class School {
	private int schoolID;
	private String schoolName;
	private String schooladdress;
	private boolean isPublic;
	private int rating;
	
	@Id
	@GeneratedValue
	public int getSchoolID() {
		return schoolID;
	}
	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Column(table="school_details")
	public String getSchooladdress() {
		return schooladdress;
	}
	public void setSchooladdress(String schooladdress) {
		this.schooladdress = schooladdress;
	}
	@Column(table="school_details")
	public boolean isPublic() {
		return isPublic;
	}
	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	@Column(table="school_details")
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	

}

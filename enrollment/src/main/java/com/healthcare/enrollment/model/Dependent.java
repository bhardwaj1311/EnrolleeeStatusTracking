package com.healthcare.enrollment.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_enrollee_dependents")
public class Dependent {
	
	private long id;
	private String firstname;
	private String middlename;
	private String lastname;
	private Date dob;
	private long phonenumber;
	private String email;
	private long enrollee_masterid;
	private Time creationdate;
	private Time modificationdate;
	private Boolean isactive;
	private String createdby;
	private String modifiedby;
	
	public Dependent() {
	}
	public Dependent(long id, String firstname, String middlename, String lastname, Date dob, long phonenumber,
			String email, long enrollee_masterid, Time creationdate, Time modificationdate, Boolean isactive,
			String createdby, String modifiedby) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.dob = dob;
		this.phonenumber = phonenumber;
		this.email = email;
		this.enrollee_masterid = enrollee_masterid;
		this.creationdate = creationdate;
		this.modificationdate = modificationdate;
		this.isactive = isactive;
		this.createdby = createdby;
		this.modifiedby = modifiedby;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getEnrollee_masterid() {
		return enrollee_masterid;
	}
	public void setEnrollee_masterid(long enrollee_masterid) {
		this.enrollee_masterid = enrollee_masterid;
	}
	public Time getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Time creationdate) {
		this.creationdate = creationdate;
	}
	public Time getModificationdate() {
		return modificationdate;
	}
	public void setModificationdate(Time modificationdate) {
		this.modificationdate = modificationdate;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

}

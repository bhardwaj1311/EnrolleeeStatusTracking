package com.healthcare.enrollment.model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_enrollee_master")
public class Enrollee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstname;
	private String middlename;
	private String lastname;
	private Date dob;
	private long phonenumber;
	private String email;
	private boolean activation_status;
	private long healthcare_planmaster_Id;
	private LocalDateTime creationdate;
	private LocalDateTime modificationdate;
	private Boolean isactive;
	private String createdby;
	private String modifiedby;
	
	public Enrollee() {
	}
	public Enrollee(long id, String firstname, String middlename, String lastname, Date dob, long phonenumber,
			String email, boolean activation_status, long healthcare_planmaster_Id, LocalDateTime creationdate, LocalDateTime modificationdate,
			Boolean isactive, String createdby, String modifiedby) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.dob = dob;
		this.phonenumber = phonenumber;
		this.email = email;
		this.activation_status = activation_status;
		this.healthcare_planmaster_Id = healthcare_planmaster_Id;
		this.creationdate = creationdate;
		this.modificationdate = modificationdate;
		this.isactive = isactive;
		this.createdby = createdby;
		this.modifiedby = modifiedby;
	}
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
	public boolean isActivation_status() {
		return activation_status;
	}
	public void setActivation_status(boolean activation_status) {
		this.activation_status = activation_status;
	}
	public long gethealthcare_planmaster_Id() {
		return healthcare_planmaster_Id;
	}
	public void sethealthcare_planmaster_Id(long healthcare_planmaster_Id) {
		this.healthcare_planmaster_Id = healthcare_planmaster_Id;
	}
	public LocalDateTime getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(LocalDateTime creationdate) {
		this.creationdate = creationdate;
	}
	public LocalDateTime getModificationdate() {
		return modificationdate;
	}
	public void setModificationdate(LocalDateTime modificationdate) {
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

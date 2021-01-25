package com.healthcare.enrollment.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="healthcare_plan_master")
public class Plan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String planname;
	private long plancode;
	private Time creationdate;
	private Time modificationdate;
	private Boolean isactive;
	private String createdby;
	private String modifiedby;
		
	public Plan() {
	}
	public Plan(long id, String planname, long plancode, Time creationdate, Time modificationdate, Boolean isactive,
			String createdby, String modifiedby) {
		super();
		this.id = id;
		this.planname = planname;
		this.plancode = plancode;
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
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	public long getPlancode() {
		return plancode;
	}
	public void setPlancode(long plancode) {
		this.plancode = plancode;
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

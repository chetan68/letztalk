package com.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Joboffer {

	private int Jobid;

	private String Jobdesc;

	private String Posteddate;

	private String Expirydate;

	public int getJobid() {
		return Jobid;
	}

	public void setJobid(int jobid) {
		Jobid = jobid;
	}

	public String getJobdesc() {
		return Jobdesc;
	}

	public void setJobdesc(String jobdesc) {
		Jobdesc = jobdesc;
	}

	public String getPosteddate() {
		return Posteddate;
	}

	public void setPosteddate(String posteddate) {
		Posteddate = posteddate;
	}

	public String getExpirydate() {
		return Expirydate;
	}

	public void setExpirydate(String expirydate) {
		Expirydate = expirydate;
	}

	public String getJobField() {
		return JobField;
	}

	public void setJobField(String jobField) {
		JobField = jobField;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getPackage() {
		return Package;
	}

	public void setPackage(String package1) {
		Package = package1;
	}

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	private String JobField;

	private String Designation;

	private String Package;

	private int Userid;

}

package com.dao;

import java.util.List;

import com.model.Joboffer;

public interface JobofferDao {

	public List<Joboffer> list();

	public Joboffer getjoboffers(int jobid);

	public int insertRow(Joboffer joboffers);
	
	public int  updateRow(Joboffer joboffers);

	public int deleteRow(int Jobid);

}

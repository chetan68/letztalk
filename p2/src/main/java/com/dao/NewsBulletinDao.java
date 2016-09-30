package com.dao;

import java.util.List;

import com.model.NewsBulletin;

public interface NewsBulletinDao{
	 
	
	public List<NewsBulletin> list();
	 
	public NewsBulletin getnewsbulletin(int  Newsid);
	
	public int insertRow(NewsBulletin newsbulletin);
	 
	public int updateRow(NewsBulletin newsbulletin);
	
	public int deleteRow(int Newsid);
	
}

package com.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class NewsBulletin {
	
	private int Newsid;
	
	private String Newsdesc;
	
	private String Newsdate;
	
	private int Userid;

	public int getNewsid() {
		return Newsid;
	}

	public void setNewsid(int newsid) {
		Newsid = newsid;
	}

	public String getNewsdesc() {
		return Newsdesc;
	}

	public void setNewsdesc(String newsdesc) {
		Newsdesc = newsdesc;
	}

	public String getNewsdate() {
		return Newsdate;
	}

	public void setNewsdate(String newsdate) {
		Newsdate = newsdate;
	}

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}
	

}

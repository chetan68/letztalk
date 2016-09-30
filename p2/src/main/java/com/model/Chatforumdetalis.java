package com.model;

import java.util.Date;

public class Chatforumdetalis {
	
	
	private int Chatforumid;
	
	private int Userid;
	
	private int  Msg;
	
	private Date Msgdatetime;

	public int getChatforumid() {
		return Chatforumid;
	}

	public void setChatforumid(int chatforumid) {
		Chatforumid = chatforumid;
	}

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public int getMsg() {
		return Msg;
	}

	public void setMsg(int msg) {
		Msg = msg;
	}

	public Date getMsgdatetime() {
		return Msgdatetime;
	}

	public void setMsgdatetime(Date msgdatetime) {
		Msgdatetime = msgdatetime;
	}
	
	

}

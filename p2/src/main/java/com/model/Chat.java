package com.model;

import java.util.Date;

public class Chat {
	private int Chatid;

	private int Userid;
	
	private int Chatwithid;
	
	private Date Msgdatetime;
	
	private String Msg;

	public int getChatid() {
		return Chatid;
	}

	public void setChatid(int chatid) {
		Chatid = chatid;
	}

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public int getChatwithid() {
		return Chatwithid;
	}

	public void setChatwithid(int chatwithid) {
		Chatwithid = chatwithid;
	}

	public Date getMsgdatetime() {
		return Msgdatetime;
	}

	public void setMsgdatetime(Date msgdatetime) {
		Msgdatetime = msgdatetime;
	}

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}
	
	
	
}

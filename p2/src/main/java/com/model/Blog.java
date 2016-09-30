package com.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Blog")
@Component
public class Blog {

	private int BlogId;

	private String BlogTitle;

	private String BlogDateTime;

	private String BlogContent;

	private int PostedById;

	private String BlogStatus;

	private String Comments;

	public int getBlogid() {
		return BlogId;
	}

	public void setBlogid(int blogid) {
		BlogId = blogid;
	}

	public String getBlogTitle() {
		return BlogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		BlogTitle = blogTitle;
	}

	

	public String getBlogDateTime() {
		return BlogDateTime;
	}

	public void setBlogDateTime(String blogDateTime) {
		BlogDateTime = blogDateTime;
	}

	public String getBlogContent() {
		return BlogContent;
	}

	public void setBlogContent(String blogContent) {
		BlogContent = blogContent;
	}

	public int getPostedById() {
		return PostedById;
	}

	public void setPostedById(int postedById) {
		PostedById = postedById;
	}

	public String getBlogStatus() {
		return BlogStatus;
	}

	public void setBlogStatus(String blogStatus) {
		BlogStatus = blogStatus;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

}

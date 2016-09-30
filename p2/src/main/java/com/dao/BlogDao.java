package com.dao;

import java.util.List;

import com.model.Blog;

public interface BlogDao {
public List<Blog> bloglist();
	
	public void saveOrUpdate(Blog blog);
	
	public void delete(int id);
	
	public Blog getblogById(int id);
	
	public boolean isBlogExist(Blog blog);
	
	public Blog getblogByblog(String blogtitle);

}

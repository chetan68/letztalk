package com.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.model.Users;

public class UsersDaoImpl implements UsersDao {

	@Autowired
	private SessionFactory sessionFactory;

	public UsersDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<Users> userslist() {

		@SuppressWarnings("unchecked")
		List<Users> userslist = (List<Users>) sessionFactory.getCurrentSession().createQuery("from Users").list();

		return null;
	}

	@Transactional
	public Users getUserById(int id) {

		String hql = "from Users where userId=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);

		@SuppressWarnings("unchecked")
		List<Users> listUsers = (List<Users>) query.list();
		if (listUsers != null && !listUsers.isEmpty()) {

			return listUsers.get(0);

		}

		else {
			return null;
		}

	}
	@Transactional
	public void saveOrUpdate(Users users) {

		sessionFactory.getCurrentSession().saveOrUpdate(users);

	}
	@Transactional
	public void delete(int id) {

		Users UsersToDelete = new Users();
		UsersToDelete.setUserid(id);
		sessionFactory.getCurrentSession().delete(UsersToDelete);

	}
	@Transactional
	public void addUsers(Users users) {
		

	}
	@Transactional
	public boolean isUserExist(Users users) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Users getUserByUserLoginName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}

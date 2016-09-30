package com.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.NewsBulletin;
import com.dao.NewsBulletinDao;

@Repository("NewsBulletindao")
public class NewsBulletinDaoImpl implements NewsBulletinDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<NewsBulletin> list() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<NewsBulletin> nlist = session.createQuery("from NewsBulletin").list();
		tx.commit();
		session.close();
		return nlist;

	}

	@Transactional
	public NewsBulletin getnewsbulletin(int Newsid) {
		Session session = sessionFactory.openSession();
		NewsBulletin newsbulletin = (NewsBulletin) session.load(NewsBulletin.class, Newsid);
		return newsbulletin;
	}

	@Transactional
	public int insertRow(NewsBulletin newsbulletin) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(newsbulletin);
		tx.commit();
		session.close();
		return 1;
	}

	@Transactional
	public int updateRow(NewsBulletin newsbulletin) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(newsbulletin);
		tx.commit();
		Serializable id = session.getIdentifier(newsbulletin);
		session.flush();
		session.close();
		return (Integer) id;
	}

	@Transactional
	public int deleteRow(int Newsid) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.createQuery("delete from NewsBulletin where id=" + Newsid).executeUpdate();
		tx.commit();
		session.flush();
		session.close();
		return (Integer) Newsid;

	}

}

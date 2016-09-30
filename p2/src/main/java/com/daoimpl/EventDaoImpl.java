package com.daoimpl;

import java.awt.Event;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EventDao;

@Repository("Eventdao")
public class EventDaoImpl implements EventDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Event> list() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Event> elist = session.createQuery("from Event").list();
		tx.commit();
		session.close();
		return elist;
	}

	@Transactional
	public Event getevent(int Eventid) {
		Session session = sessionFactory.openSession();
		Event event = (Event) session.load(Event.class, Eventid);
		return event;
	}

	@Transactional
	public int insertRow(Event event) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(event);
		tx.commit();
		session.close();
		return 1;
	}

	@Transactional
	public int updateRow(Event event) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(event);
		tx.commit();
		Serializable id = session.getIdentifier(event);
		session.flush();
		session.close();
		return (Integer) id;
	}

	@Transactional
	public int deleteRow(int Eventid) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.createQuery("delete from Event where id=" + Eventid).executeUpdate();
		tx.commit();
		session.flush();
		session.close();
		return (Integer) Eventid;
	}

}

package com.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.JobofferDao;
import com.model.Joboffer;

@Repository("Joboffersdao")
public class JobofferDaoImpl implements JobofferDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Joboffer> list() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Joboffer> jlist = session.createQuery("from Joboffers").list();
		tx.commit();
		session.close();
		return jlist;

	}

	@Transactional
	public Joboffer getjoboffers(int jobid) {
		Session session = sessionFactory.openSession();
		Joboffer joboffers = (Joboffer) session.load(Joboffer.class, jobid);
		return joboffers;
	}

	@Transactional
	public int insertRow(Joboffer joboffers) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(joboffers);
		tx.commit();
		session.close();
		return 1;
	}

	@Transactional
	public int updateRow(Joboffer joboffers) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(joboffers);
		tx.commit();
		Serializable id = session.getIdentifier(joboffers);
		session.flush();
		session.close();
		return (Integer) id;
	}

	@Transactional
	public int deleteRow(int Jobid) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.createQuery("delete from Joboffers where id=" + Jobid).executeUpdate();
		tx.commit();
		session.flush();
		session.close();
		return (Integer) Jobid;
	}

}

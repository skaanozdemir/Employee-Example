package com.employee.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.employee.model.Department;
import com.employee.model.Meetings;
import com.employee.repository.DepartmentRepository;
import com.employee.repository.MeetingsRepository;

@Repository
public class MeetingsDAOImpl implements MeetingsRepository {

	private SessionFactory sessionFactory;

	@Override
	public void addMeetings(Meetings meetings) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(meetings);
		System.out.println("Meetings saved successfully");
	}

	@Override
	public void updateMeetings(Meetings meetings) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(meetings);
		System.out.println("Meetings updated successfully");

	}

	@Override
	public void deleteMeetings(int meetingsId) {
		Session session = this.sessionFactory.getCurrentSession();
		Meetings meetings = (Meetings) session.load(Meetings.class, new Integer(meetingsId));
		if (meetings != null) {
			session.delete(meetings);
			System.out.println("Meetings deleted successfully" + meetings);
		}
	}

	public List<Meetings> listMeetings() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Meetings> meetingList = session.createQuery("from Department").list();
		for (Meetings d : meetingList) {
			System.out.println("Meetings loaded successfully" + d);
		}

		return meetingList;

	}

	public Meetings getMeetingById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Meetings meetings = (Meetings) session.load(Meetings.class, new Integer(id));
		System.out.println("Meeting loaded successfully");
		return meetings;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public <S extends Meetings> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Meetings> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meetings findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Meetings> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Meetings> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Meetings entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Meetings> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}

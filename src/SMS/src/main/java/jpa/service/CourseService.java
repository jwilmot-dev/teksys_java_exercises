package jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

//import jpa.dao.Course;
import jpa.dao.CourseDAO;
//import jpa.dao.List;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.mainrunner.SMSRunner;

public class CourseService implements CourseDAO{

	@Override
	public List<Course> getAllCourses() {
		Session session = SMSRunner.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		String queryString = "FROM Course";
		Query q = session.createQuery(queryString);
		List<Course> list = q.getResultList();
		t.commit();
		session.close();
		return list;
	}
	
	public Course getCourseById(int cId) {
		Session session = SMSRunner.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Course course = session.load(Course.class, cId);
		t.commit();
//		session.close();
		return course;
	}

}

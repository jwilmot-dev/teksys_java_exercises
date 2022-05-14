package jpa.service;

import java.util.List;

import jpa.dao.StudentDAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.mainrunner.SMSRunner;


public class StudentService implements StudentDAO{

	@Override
	public List<Student> getAllStudents() {
		Session session = SMSRunner.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		String queryString = "FROM Student";
		Query q = session.createQuery(queryString);
		List<Student> list = q.getResultList();
		t.commit();
		return list;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		Session session = SMSRunner.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Student student = session.load(Student.class, sEmail);
		t.commit();
		return student;
	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		Session session = SMSRunner.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		String queryString = "SELECT COUNT(email) FROM Student WHERE email = ?1 AND password = ?2";
		Query q = session.createQuery(queryString);
		q.setParameter(1, sEmail);
		q.setParameter(2, sPassword);
		long result = (long)q.uniqueResult();
		t.commit();
		if(result > 0) {return true;}
		else {return false;}
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		Session session = SMSRunner.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Student student = session.load(Student.class, sEmail);
		Course course = session.load(Course.class, cId);
		List<Course> list = student.getsCourses();
		list.add(course);
		student.setsCourses(list);
		session.save(student);
		t.commit();
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		Session session = SMSRunner.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Student student = session.load(Student.class, sEmail);
		List<Course> list = student.getsCourses();
		t.commit();
		return list;
	}

}

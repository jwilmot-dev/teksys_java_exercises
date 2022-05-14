package jpa.mainrunner;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.query.Query;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {
	
	private Scanner sin;
	private StringBuilder sb;

	private CourseService courseService;
	private StudentService studentService;
	private Student currentStudent;

	public SMSRunner() {
		sin = new Scanner(System.in);
		sb = new StringBuilder();
		courseService = new CourseService();
		studentService = new StudentService();
	}
	
	
	public static void main(String[] args) {
		
			
		// Check to see if Course table has any data in it
		// if not, it means tables have not been populated yet
		Session session = getSessionFactory().openSession();
		Query q = session.createQuery("SELECT 1 FROM Course");
		List result = q.getResultList();
		session.close();

		
		//if there is no data in the table, populate tables with data
		if(result.size()==0) {
			createTables();
		}
		
		SMSRunner sms = new SMSRunner();
		sms.run();	

		//testing email and password 
		//ljiroudek8@sitemeter.com
		//bXRoLUP
		getSessionFactory().close();
	}
	public static SessionFactory getSessionFactory() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		return factory;
	}
	
	private static void createTables() {
		Session session = getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setsEmail("hluckham0@google.ru");
		s1.setsName("Hazel Luckham");
		s1.setsPass("X1uZcoIh0dj");
		
		Student s2 = new Student();
		s2.setsEmail("sbowden1@yellowbook.com");
		s2.setsName("Sonnnie Bowden");
		s2.setsPass("SJc4aWSU");
		
		Student s3 = new Student();
		s3.setsEmail("qllorens2@howstuffworks.com");
		s3.setsName("Quillan Llorens");
		s3.setsPass("W6rJuxd");
		
		Student s4 = new Student();
		s4.setsEmail("cstartin3@flickr.com");
		s4.setsName("Clem Startin");
		s4.setsPass("XYHzJ1S");
		
		Student s5 = new Student();
		s5.setsEmail("tattwool4@biglobe.ne.jp");
		s5.setsName("Thornie Attwool");
		s5.setsPass("Hjt0SoVmuBz");
		
		Student s6 = new Student();
		s6.setsEmail("hguerre5@deviantart.com");
		s6.setsName("Harcourt Guerre");
		s6.setsPass("OzcxzD1PGs");
		
		Student s7 = new Student();
		s7.setsEmail("htaffley6@columbia.edu");
		s7.setsName("Holmes Taffley");
		s7.setsPass("xowtOQ");
		
		Student s8 = new Student();
		s8.setsEmail("aiannitti7@is.gd");
		s8.setsName("Alexandra Iannitti");
		s8.setsPass("TWP4hf5j");
		
		Student s9 = new Student();
		s9.setsEmail("ljiroudek8@sitemeter.com");
		s9.setsName("Laryssa Jiroudek");
		s9.setsPass("bXRoLUP");
		
		Student s10 = new Student();
		s10.setsEmail("cjaulme9@bing.com");
		s10.setsName("Cahra Jaulme");
		s10.setsPass("FnVklVgC6r6");
		
		Course c1 = new Course();
		c1.setcId(1);
		c1.setcName("English");
		c1.setcInstructorName("Anderea Scamaden");
		
		Course c2 = new Course();
		c2.setcId(2);
		c2.setcName("Mathematics");
		c2.setcInstructorName("Eustace Niemetz");
		
		Course c3 = new Course();
		c3.setcId(3);
		c3.setcName("Anatomy");
		c3.setcInstructorName("Reynolds Pastor");
		
		Course c4 = new Course();
		c4.setcId(4);
		c4.setcName("Organic Chemistry");
		c4.setcInstructorName("Odessa Belcher");
		
		Course c5 = new Course();
		c5.setcId(5);
		c5.setcName("Physics");
		c5.setcInstructorName("Dani Swallow");
		
		Course c6 = new Course();
		c6.setcId(6);
		c6.setcName("Digital Logic");
		c6.setcInstructorName("Glenden Reilingen");
		
		Course c7 = new Course();
		c7.setcId(7);
		c7.setcName("Object Oriented Programming");
		c7.setcInstructorName("Giselle Ardy");
		
		Course c8 = new Course();
		c8.setcId(8);
		c8.setcName("Data Structures");
		c8.setcInstructorName("Carolan Stoller");
		
		Course c9 = new Course();
		c9.setcId(9);
		c9.setcName("Politics");
		c9.setcInstructorName("Carmita De Maine");
		
		Course c10 = new Course();
		c10.setcId(10);
		c10.setcName("Art");
		c10.setcInstructorName("Kingsly Doxsey");
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		session.save(s6);
		session.save(s7);
		session.save(s8);
		session.save(s9);
		session.save(s10);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		session.save(c6);
		session.save(c7);
		session.save(c8);
		session.save(c9);
		session.save(c10);
		
		t.commit();
		session.close();
		System.out.println("Successfully created tables");
	}
	
	private void run() {
		// Login or quit
		
		// Added try/catch for bad inputs
		try {
			switch (menu1()) {
			case 1:
				if (studentLogin()) {
					
					//// added program while loop 
					boolean loopflag = true;
					while(loopflag == true) {
						loopflag = registerMenu();
					}
				}
				break;
			case 2:
			default:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			}
		} catch(InputMismatchException ime) {
			System.out.println("Sorry, that input was not a valid input. Goodbye!");
			System.exit(0);
		}
	}

	private int menu1() {
		sb.append("\nAre you a(n)\n\n1. Student\n2. quit\n\nPlease, Enter 1 or 2: ");
		System.out.print(sb.toString());
		sb.delete(0, sb.length());

		return sin.nextInt();
	}

	private boolean studentLogin() {
		boolean retValue = false;
		System.out.print("Enter your email address: ");
		String email = sin.next();
		System.out.print("Enter your password: ");
		String password = sin.next();

		if (studentService.validateStudent(email, password)) {
			currentStudent = studentService.getStudentByEmail(email);
			List<Course> courses = studentService.getStudentCourses(email);
			int count = 0;
			//////  added code for outputting My Courses /////////
			for (Course course : courses) {
				if(count == 0) {
					System.out.println();
					System.out.println("My Classes:");
					System.out.printf("%5s %10s %-35s %-25s\n", "#", " ", "Course Name", "Instructor Name");
				}
				System.out.printf("%5s %10s %-35s %-25s\n", course.getcId(), " ", course.getcName(), course.getcInstructorName());
				count++;
			}
			retValue = true;
		} else {
			System.out.println();
			System.out.println("Sorry, that login information was not correct. Goodbye!");
			System.exit(0);
		}
		return retValue;
	}

	private boolean registerMenu() {
		sb.append("\n1. Register a class\n2. Logout\nPlease Enter Selection: ");
		System.out.print(sb.toString());
		sb.delete(0, sb.length());
		boolean flag = true;
		int selection = sin.nextInt();
		
		switch (selection) {
			case 1:
				List<Course> allCourses = courseService.getAllCourses();
				List<Course> studentCourses = studentService.getStudentCourses(currentStudent.getsEmail());
				allCourses.removeAll(studentCourses);
				
				//////  added code for outputting My Courses /////////
				int count2=0;
				for (Course course : allCourses) {
					if(count2==0) {	
						System.out.println();
						System.out.println("All Courses:");
						System.out.printf("%5s %10s %-35s %-25s\n", "ID", " ", "Course", "Instructor");
					}
					System.out.printf("%5s %10s %-35s %-25s\n", course.getcId(), " ", course.getcName(), course.getcInstructorName());
					count2++;
				}
				System.out.println();
				System.out.print("To add a course to your list, enter the course ID number: ");
				
				// Added try/catch for bad inputs
				try {
				int number = sin.nextInt();
			
			
				//created method getCourseById in CourseService to match method here
				Course newCourse = courseService.getCourseById(number);
			

				if (newCourse != null) {
					Student temp = studentService.getStudentByEmail(currentStudent.getsEmail());
					List<Course> sc = temp.getsCourses();
					
					// added check if course selected is already in students course list
					boolean passCheck = true;
					for (Course course : sc) {
						if(course.getcId()==newCourse.getcId()) {
							passCheck = false;
							System.out.println();
							System.out.println("You are already registered for that course");
						}
					}
					if(passCheck == true) {
						//Add new course to Students course list
						studentService.registerStudentToCourse(currentStudent.getsEmail(), newCourse.getcId());
						Student temp2 = studentService.getStudentByEmail(currentStudent.getsEmail());
						List<Course> sc2 = temp2.getsCourses();
						
						////// added code for outputting Student's courses /////////
						int count1 = 0;
						for (Course course : sc2) {
							if(count1 == 0) {
								System.out.println();
								System.out.println("My Classes:");
								System.out.printf("%5s %10s %-35s %-25s\n", "#", " ", "Course Name", "Instructor Name");
							}
							System.out.printf("%5s %10s %-35s %-25s\n", course.getcId(), " ", course.getcName(), course.getcInstructorName());
							count1++;
						}
					}
				}

				
				} catch (Exception e) {
					
					System.out.println();
					System.out.println("That was not a valid course ID number.");
					sin.nextLine();
				}
				break;
			case 2:
				flag = false;
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			default:
				flag = false;
				System.out.println("Sorry, that was not a valid input. Goodbye!");
				System.exit(0);
		}
		
		return flag;
	}
}

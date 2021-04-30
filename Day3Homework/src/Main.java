
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Mustafa");
		instructor.setLastName("Demir");
		instructor.setPassword("9r7w9rı4");
		instructor.setEmail("mustafadmr@gmail.com");
		instructor.setCertificate("C++, C#, Java");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
		instructorManager.updateUserInfo(instructor);
		
		Course course1 = new Course();
		course1.setName("Java Yazılımcı Yetiştirme Kursu");
		
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Berke");
		student.setLastName("Karaman");
		student.setPassword("65830654");
		student.setEmail("bkrmn@gmail.com");
		student.setUniversity("Gedik Üniversitesi");
		student.setDepartment("Computer Science");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addUser(student);
		studentManager.updateUserInfo(student);
		
		instructorManager.addCourse(instructor, course1);
		studentManager.joinCourse(student, course1);
		studentManager.completeCourse(student, course1);
		instructorManager.updateCourse(instructor, course1);
	}

}


public class StudentManager extends UserManager {
	public void joinCourse(Student student, Course course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + 
				", " + course.getName() + " adlı kursa kayıt oldu.");
	}
	
	public void completeCourse(Student student, Course course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + 
				", " + course.getName() + " adlı kursu tamamladı.");
	}
	
}

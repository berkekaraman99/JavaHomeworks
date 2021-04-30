
public class InstructorManager extends UserManager {
	public void addCourse(Instructor instructor, Course course) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + 
				", " + course.getName() + " adlı bir kurs ekledi.");
	}
	public void updateCourse(Instructor instructor, Course course) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + 
				", " + course.getName() + " adlı kursu güncelledi.");
	}
}


public class Course {
	
	Course() {	//Constructor - 1
		System.out.println("Kurs eklendi.");
	}
	
	Course(int id, String name, String teacher) {	//Constructor - 2
		this();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}
	
	int id;
	String name;
	String teacher;
}

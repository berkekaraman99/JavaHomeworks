
public class Member {
	
	Member() {	//Constructor - 1
		System.out.println("Üye eklendi.");
	}
	
	Member(int id, String name, String surname, int birthOfYear) {	//Constructor - 2
		this();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthOfYear = birthOfYear;
	}
	
	int id;
	String name;
	String surname;
	int birthOfYear;
}

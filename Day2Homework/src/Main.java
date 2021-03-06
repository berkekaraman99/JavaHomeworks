
public class Main {

	public static void main(String[] args) {
		
		MemberManagement memberManagement = new MemberManagement();
		
		Member member1 = new Member();	//üye1 oluşturulur
		member1.id = 1;
		member1.name = "Berke";
		member1.surname = "Karaman";
		member1.birthOfYear = 1999;
		memberManagement.singUp();
		
		Member member2 = new Member(2,"Yusuf","Yazıcı",2000);	//üye2 oluşturulur
		
		Member[] members = {member1, member2};	//üyeler diziye eklenir
		
		Course course1 = new Course();	//course1 oluşturulur
		course1.id = 1;
		course1.name = "Yazılım Geliştirici Yetiştirme Kampı C# - Angular";
		course1.teacher = "Engin Demiroğ";
		
		Course course2 = new Course();	//course2 oluşturulur
		course2.id = 2;
		course2.name = "Yazılım Geliştirici Yetiştirme Kampı Java - React";
		course2.teacher = "Engin Demiroğ";
		
		//course3 oluşturulur
		Course course3 = new Course(3,"Programlamaya Giriş için Temel Kurs","Engin Demiroğ");
		
		Course[] courses ={course1, course2, course3};	//kurslar diziye eklenir
		CourseManagement courseManagement = new CourseManagement();	//course iş sınıfı oluşturulur
		
		for (Course course : courses) {	//kurslar foreach döngüsü ile sırayla yazdırılır
			System.out.println("\nKurs Adı: " + course.name);
			System.out.println("Kurs Eğitmeni: " + course.teacher);
		}
		System.out.println("----------------------------------");
		
		memberManagement.logIn(member1);
		courseManagement.joinCourse(course2);
		courseManagement.updateCourse();

	}

}

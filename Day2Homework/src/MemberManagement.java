
public class MemberManagement {
	void singUp() {		//Kayıt olma metodu
		System.out.println("Başarıyla kayıt oldunuz.");
	}
	
	void logIn(Member member) {		//Giriş yapma metodu
		System.out.println(member.name + " " + member.surname + " olarak giriş yapıldı.");
	}
}

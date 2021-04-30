
public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı eklendi.");
	}
	public void updateUserInfo(User user) {
		System.out.println(user.getId() + " no'lu kullanıcının bilgileri güncellendi.");
	}
	public void deleteUser(User user) {
		System.out.println(user.getId() + " no'lu kullanıcı silindi.");
	}
}

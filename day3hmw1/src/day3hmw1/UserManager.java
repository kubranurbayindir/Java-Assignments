package day3hmw1;

public class UserManager{

	public void add(User user) {
		System.out.print(user.getFirstName() + " ");
		System.out.println(user.getLastName() + " kaydedildi.");
		
	}
	
	public void con(User user) {
		user.control();
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

}

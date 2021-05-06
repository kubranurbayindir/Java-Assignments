package day3hmw1;

public class User {
	private String id; // field or attribute
	private String firstName; // field or attribute
	private String lastName; // field or attribute
	
	public User() {
		
	}
	public void control() {
		System.out.println("Sistem Çalýþýyor.");
	}
	
	public User(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

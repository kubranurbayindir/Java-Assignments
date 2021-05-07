package interfaces;

public class Customer {
	private int id; //özellik, attribut atýyoruz. 
	private String firstName;
	private String lastName;
	
	public Customer(){
		//ardýndan dýþardan bu alanlara eriþmek için parametresiz contructor ekliyoruz.
	}

	public Customer(int id, String firstName, String lastName) { //parametreli constructor ekliyoruz.
		super(); //inherit eden bir sýnýf varsa o sýnýfýn parametresiz consturctorunda da çalýþtýr.
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() { 
		return id;
	}

	public void setId(int id) {
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

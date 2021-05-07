package interfaces;

public class Customer {
	private int id; //�zellik, attribut at�yoruz. 
	private String firstName;
	private String lastName;
	
	public Customer(){
		//ard�ndan d��ardan bu alanlara eri�mek i�in parametresiz contructor ekliyoruz.
	}

	public Customer(int id, String firstName, String lastName) { //parametreli constructor ekliyoruz.
		super(); //inherit eden bir s�n�f varsa o s�n�f�n parametresiz consturctorunda da �al��t�r.
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

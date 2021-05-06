package day3hmw1;

public class Instructor extends User {
	private String giveCourses;
	private int salary;
	
	public Instructor() {
		
	}
	
	@Override
	public void control() {
		System.out.println("Eðitmen sistemde bulunuyor.");
	}

	public Instructor(String id, String firstName, String lastName, String giveCourses, int salary) {
		super(id, firstName, lastName);
		this.giveCourses = giveCourses;
		this.salary = salary;
	}


	public String getGiveCourses() {
		return giveCourses;
	}

	public void setGiveCourses(String giveCourses) {
		this.giveCourses = giveCourses;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getPromosion() {
		return salary + (salary / 100);
	}

}

package day3hmw1;

public class Student extends User{
	private String rules;
	private int grade;
	private String takeCourses;

	public Student() {
		
	}
	
	@Override
	public void control() {
		System.out.println("Öðrenci sistemde bulunuyor.");
	}

	
	public Student(String id, String firstName, String lastName, String rules, int grade, String takeCourses) {
		super(id, firstName, lastName);
		this.rules = rules;
		this.grade = grade;
		this.takeCourses = takeCourses;
	}

	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getTakeCourses() {
		return takeCourses;
	}
	public void setTakeCourses(String takeCourses) {
		this.takeCourses = takeCourses;
	}
	

}

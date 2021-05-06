package day3hmw1;

public class Main {

	public static void main(String[] args) {
		Student kubra = new Student();
		kubra.setFirstName("Kübra Nur");	
		kubra.setLastName("Bayýndýr");
		
		Instructor engin = new Instructor();
		engin.setFirstName("Engin");
		engin.setLastName("Demrioð");
		engin.setGiveCourses("React + JAVA, Matlab, R, C#");
		engin.setSalary(20000);
		
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(new User[] {kubra, engin});
		
		UserManager userControl = new UserManager();
		userControl.con(new Student());
		userControl.con(new Instructor());
		
		StudentManager studentman = new StudentManager();
		studentman.List();
		studentman.control();
		
		InstructorManager ýnstructorman = new InstructorManager();
		ýnstructorman.List();
		ýnstructorman.control();
		
		System.out.println(engin.getFirstName() + " " + engin.getLastName() + " " + "eðitmeninin yýl sonu maaþý : " + engin.getPromosion());
		
	}

}

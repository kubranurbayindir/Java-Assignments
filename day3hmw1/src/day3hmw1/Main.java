package day3hmw1;

public class Main {

	public static void main(String[] args) {
		Student kubra = new Student();
		kubra.setFirstName("K�bra Nur");	
		kubra.setLastName("Bay�nd�r");
		
		Instructor engin = new Instructor();
		engin.setFirstName("Engin");
		engin.setLastName("Demrio�");
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
		
		InstructorManager �nstructorman = new InstructorManager();
		�nstructorman.List();
		�nstructorman.control();
		
		System.out.println(engin.getFirstName() + " " + engin.getLastName() + " " + "e�itmeninin y�l sonu maa�� : " + engin.getPromosion());
		
	}

}

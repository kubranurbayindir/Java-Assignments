package day2hmw1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kodlama.io sitesine Ho�geldiniz. Kurslar�m�z:"); //�zellik tutucu class 1
		System.out.println("----------");
		Course course1 =new Course(1, "Yaz�l�m Geli�tirici Kamp� Java + React", "Engin Demiro�") ;
		Course course2 =new Course(2, "Yaz�l�m Geli�tirici Kamp� C# + Angular", "Engin Demiro�") ;
		Course course3 =new Course(3, "Programlamaya Giri� Temel Kurs", "Engin Demiro�") ;
		
		Course[] courses = {course1, course2, course3};
		for(Course course: courses) {
			System.out.println(course.name);
		}
		
		System.out.println("Dahil Oldu�unuz Programlama Kurslar�:"); //method tutucu class 1
		System.out.println("----------");
		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(course1);
		courseManager.addToCart(course2);
		courseManager.addToCart(course3);
		
		System.out.println("Kategoriler"); //�zellik tutucu class 2
		System.out.println("----------");
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Programlar";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "E�itmenler";

		Category[] categories = {category1, category2};
		for (Category category: categories) {
			System.out.println(category.name);
		}
		System.out.println("Kategoriyi se�:"); //method tutucu class 2
		System.out.println("----------");
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.selectCategory(category1);
		categoryManager.selectCategory(category2);
		

	}

}

package oopIntro;

public class Product {
	
	public Product() { //parametresiz yapýcý blog 
		System.out.println("Ben Çalýþýyorum");
	}

	public Product(int id, String name, Double unitPrice, String detail) { //parametreli yapýcý blog
		this(); // classýn parametresiz olanýný da çalýþtýr anlamýndadýr. 
		this.id = id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;	
	}
	int id;
	String name;
	double unitPrice;
	String detail;
	
}

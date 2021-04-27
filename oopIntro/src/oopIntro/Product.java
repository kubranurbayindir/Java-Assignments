package oopIntro;

public class Product {
	
	public Product() { //parametresiz yap�c� blog 
		System.out.println("Ben �al���yorum");
	}

	public Product(int id, String name, Double unitPrice, String detail) { //parametreli yap�c� blog
		this(); // class�n parametresiz olan�n� da �al��t�r anlam�ndad�r. 
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

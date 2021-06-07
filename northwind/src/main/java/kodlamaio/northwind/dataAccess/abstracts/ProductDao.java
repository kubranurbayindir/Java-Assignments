package kodlamaio.northwind.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{ // interface interfac i extends eder. -sonra entityi primary key i veriyoruz. 
	
	Product getByProductName(String productName); //getBy or findBy
	  
	// Product getByProductNameAndCategoryId(String productName, int categoryId); //bir tane and operasyonu olan where koşulunu çalıştırıyor.
	
	//List<Product> getByProductNameOrCategory(String productName, int categoryId); // or koşulu ile  ürün veya cat.id.si listeliyoruz.

//jpa reposriory ile otomatik çalışıyor.
//adlandırma kurallarına dikkat et.
	
//	 List<Product> getByCategoryIn(List<Integer> categories);
	 
	 // select * from products where catgory_id in(1,2,3,4)
	 
//	 List<Product> getByProductNameContains(String productName); //ürün isminde ... geçiyorsa.
	 
	// List<Product> getByProductNameStartsWith(String productName);
	
	//  @Query("From Product where productName=:productName and category.categoryId=:categoryId")
	//  List<Product> getByNameAndCategory(String productName, int categoryId);
	  
	 
	  

}

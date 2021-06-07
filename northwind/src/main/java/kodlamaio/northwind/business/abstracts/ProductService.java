package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResults;
import kodlamaio.northwind.core.utilities.results.Results;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	
	DataResults<List<Product>> getAll(); //data dönecek
    Results add(Product product); //işlmin sonucunu tutacak olan sistemi bağlıyoruz....
   
    DataResults<Product> getByProductName(String productName);
	 
   // DataResults<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	  
   // DataResults<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
	  
   // DataResults<List<Product>> getByCategoryIn(List<Integer> categories);
	  
   // DataResults<List<Product>> getByProductNameContains(String productName);
	  
   // DataResults<List<Product>> getByProductNameStartsWith(String productName);

   // DataResults<List<Product>> getByNameAndCategory(String productName, int categoryId);
    
    
	

}

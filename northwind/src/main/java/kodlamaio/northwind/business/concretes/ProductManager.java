package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//bean demekk javada class demek, productaonun sahip olacağı instance ları spring buluyror ve misal hibernate classını arkaplanda çalıştırmış oluyor.
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResults;
import kodlamaio.northwind.core.utilities.results.Results;
import kodlamaio.northwind.core.utilities.results.SuccessDataResults;
import kodlamaio.northwind.core.utilities.results.SuccessResults;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

//productmanagerada service adlı anatosyın veriyoruz. yani bu class service görevi göreceğini tanıtıyoruz. 
@Service
public class ProductManager implements ProductService{

	private ProductDao productDao; //2. produc dao yu çağırırız.
	//arkaplanda daonu n interface i çalıştırıyor ama classı yokclassı spring boot otomatik injection yapıyor.  bunun için autowired tanımlıyoruz. 
	
	@Autowired  //bir bağımlılık oluştuturu ve tek bir instance iile gideriz. 
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResults<List<Product>> getAll() {
		return new SuccessDataResults<List<Product>>(this.productDao.findAll(), "Data Listelendi."); //önce data. sonra mesajı yaz doğru olduğu koşulda çalışacak.
			
	}//sırada dao ya erişmemiz lazım. 

	@Override
	public Results add(Product product) {
		this.productDao.save(product);		
		return new SuccessResults("Ürün eklendi.");
	}

}

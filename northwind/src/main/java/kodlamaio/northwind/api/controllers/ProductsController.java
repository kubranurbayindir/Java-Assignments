package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products") //birden fazla controller olursa bunu tanımlıyoruz.
public class ProductsController { //backendle iletişimde olmasını sağlayacak. kontrolleri istekleri karşılıyor. sistemimizle dış dünyanın iletişimini sağlıyor. 
	
	private ProductService productService;
	
	@Autowired //Girt bana productservice bul classını çözümle. projeyi tarıyor productservice kullanan yerleri saptıyor ilişki kuruyor. ardından otomatik new leme ile arkaplanda productmanager i newleyip prduct dao yu içine yerleştrşyor. 
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall") //veri isteği durumularında bunu tanımlıyoruz. 
	public List<Product> getAll(){ //method desteğini bu kontroller vasıtasıyla veriyoruz. 
		return this.productService.getAll();
	}
}


// kodlamaio/api/products süsteme bu yol ile bir istekte gelirse productmanager bunun kontrolünü sağlasın diyorzu. 
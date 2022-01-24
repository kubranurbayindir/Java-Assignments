package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//test ortamý. 
		//entity hariç new lenen bi nesne varsa sýkýntý net çýkar -altýn kural.
	
		//toDo: spring IoC ile bu nesnenin newlemesine gerek kalmayacak. 
		ProductService productService = new ProductManager(new AbcProductDao(),
				new JLoggerManagerAdapter() );//hata oldu sisteme baþka birinin itemini eklersek adaptasyon yapmalýyýz. 
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
	
	}

}

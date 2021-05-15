package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//test ortam�. 
		//entity hari� new lenen bi nesne varsa s�k�nt� net ��kar -alt�n kural.
	
		//toDo: spring IoC ile bu nesnenin newlemesine gerek kalmayacak. 
		ProductService productService = new ProductManager(new AbcProductDao(),
				new JLoggerManagerAdapter() );//hata oldu sisteme ba�ka birinin itemini eklersek adaptasyon yapmal�y�z. 
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
	
	}

}

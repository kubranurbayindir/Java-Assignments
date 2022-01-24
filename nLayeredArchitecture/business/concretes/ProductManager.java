package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	private ProductDao productDao; //7. manager böylece hibernate vertiabanýyla iletiþimde olmaz sdece dataacces katmanýyla iletiþme geçebilir. 
	private LoggerService loggerService;
	
	//8.cons ile enjekte et.
	
		public ProductManager(ProductDao productDao, LoggerService loggerService) {// 9. ilerde baþka bir db ile etkileþime geçebilriz hibernate i siebilirz, hibrnate ile herhangi bi baðýmlýlýk yok
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}
		public ProductDao getProductDao() {
			return productDao;
		}


		public void setProductDao(ProductDao productDao) {
			this.productDao = productDao;
		}

	@Override
	public void add(Product product) {
		//1. iþ kodlarýmý yazýyorum
		
		if(product.getCategoryId()==1) {
			System.out.println("Bu katogoriye ürün kabul edilmiyor.");
			return; //2. bu kodu bitirir.
		}
		
        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi : " + product.getName());
        
		//3. kategorisi 2 , 16 ürünlere gelince yukarýdaki kodu es geçer veritabanýna girmesi gerekir.
		//5. HibernateProductDao dao = new HibernateProductDao();
		//6. dao.add(product); //bu kod olmaz, alternatif bi servici buraya dahil edemeyiz. 
		//4. bunun için dependinces enjection yapacaðýz. void add in üstüne
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	private ProductDao productDao; //7. manager b�ylece hibernate vertiaban�yla ileti�imde olmaz sdece dataacces katman�yla ileti�me ge�ebilir. 
	private LoggerService loggerService;
	
	//8.cons ile enjekte et.
	
		public ProductManager(ProductDao productDao, LoggerService loggerService) {// 9. ilerde ba�ka bir db ile etkile�ime ge�ebilriz hibernate i siebilirz, hibrnate ile herhangi bi ba��ml�l�k yok
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
		//1. i� kodlar�m� yaz�yorum
		
		if(product.getCategoryId()==1) {
			System.out.println("Bu katogoriye �r�n kabul edilmiyor.");
			return; //2. bu kodu bitirir.
		}
		
        this.productDao.add(product);
        this.loggerService.logToSystem("�r�n eklendi : " + product.getName());
        
		//3. kategorisi 2 , 16 �r�nlere gelince yukar�daki kodu es ge�er veritaban�na girmesi gerekir.
		//5. HibernateProductDao dao = new HibernateProductDao();
		//6. dao.add(product); //bu kod olmaz, alternatif bi servici buraya dahil edemeyiz. 
		//4. bunun i�in dependinces enjection yapaca��z. void add in �st�ne
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

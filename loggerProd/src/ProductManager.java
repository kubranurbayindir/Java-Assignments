
public class ProductManager implements ProductService{
	
	private ProductDao productDao;

	
	public ProductManager() {
		super();
	}

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void save(Product product) {
		System.out.println("Veritabanına " + product.getName() + " isimli ürün kaydedildi.");
	
	}
	
	@Override
	public void add(Logger logger) {
		logger.log();
		
	}
	
	public void addMultiple(Logger[] loggers) {
		for (Logger logger : loggers) {
			add(logger);
		}
	}
	

}

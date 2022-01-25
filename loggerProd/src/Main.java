
public class Main {

	public static void main(String[] args) {
		

		ProductManager productManager = new ProductManager();
		Product p1 = new Product(1, "Elma");
		productManager.save(p1);

		System.out.println();
		productManager.add(new FileLogger());
		productManager.add(new DbLogger());
		
		System.out.println();
		Logger logger = new Logger();
		logger.log();
		
		System.out.println();
		Logger[] loggers = {new FileLogger(), new DbLogger()};
		productManager.addMultiple(loggers);
		
	}

}

package interfaces;

public class CustomerManager {
	// loosly - thightly coupled
	private Logger[] loggers; //ba��ml� oldu�umuz de�i�keni yaz�yoruz. 
	//�oklu birden fazla loglama istersek arraye ba�vur.
	
	public CustomerManager(Logger[] loggers) { //parametreesiz con yok
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
//		for(Logger logger : loggers) { kendini tekrarlayan fonksiyonlar� bi kenara al�yoruz ve yukardaki methodu �a��r�ypruz.
//			logger.log(customer.getFirstName());
//		}
		
//		this.logger.log(customer.getFirstName());
//		DatabaseLogger databaseLogger = new DatabaseLogger(); // thightly couppled
//		databaseLogger.log(customer.getFirstName() + " veritaban�na logland�.");
		
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : " + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getLastName());
		
//		for(Logger logger : loggers) {
//		logger.log(customer.getFirstName());
//		}

//		this.logger.log(customer.getFirstName());
		
//		DatabaseLogger databaseLogger = new DatabaseLogger();
//		databaseLogger.log(customer.getFirstName() + " veritaban�na logland�.");
	
	}
}

package interfaces;

public class CustomerManager {
	// loosly - thightly coupled
	private Logger[] loggers; //baðýmlý olduðumuz deðiþkeni yazýyoruz. 
	//çoklu birden fazla loglama istersek arraye baþvur.
	
	public CustomerManager(Logger[] loggers) { //parametreesiz con yok
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
//		for(Logger logger : loggers) { kendini tekrarlayan fonksiyonlarý bi kenara alýyoruz ve yukardaki methodu çaðýrýypruz.
//			logger.log(customer.getFirstName());
//		}
		
//		this.logger.log(customer.getFirstName());
//		DatabaseLogger databaseLogger = new DatabaseLogger(); // thightly couppled
//		databaseLogger.log(customer.getFirstName() + " veritabanýna loglandý.");
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : " + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getLastName());
		
//		for(Logger logger : loggers) {
//		logger.log(customer.getFirstName());
//		}

//		this.logger.log(customer.getFirstName());
		
//		DatabaseLogger databaseLogger = new DatabaseLogger();
//		databaseLogger.log(customer.getFirstName() + " veritabanýna loglandý.");
	
	}
}

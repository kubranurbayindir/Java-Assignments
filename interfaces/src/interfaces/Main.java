package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new DatabaseLogger() };
		
		CustomerManager customerManager = new CustomerManager(loggers); // cs sýnýfýna baðýmlýlýðýn smsdir or filedýr or databs...
		Customer kubra = new Customer(1, "Kübra Nur", "Bayýndýr");
		customerManager.add(kubra);
	}

}

package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new DatabaseLogger() };
		
		CustomerManager customerManager = new CustomerManager(loggers); // cs s�n�f�na ba��ml�l���n smsdir or filed�r or databs...
		Customer kubra = new Customer(1, "K�bra Nur", "Bay�nd�r");
		customerManager.add(kubra);
	}

}

package nLayeredDemo.jLogger;

public class JLoggerManager {
	public void log(String message) {
		System.out.println("J Logger ile loglandı." + message);
		
	}//sisteme dışardan yazılan bir paket olarak bunu düşünürsek bunu sisteme ekliyecez bu paketi
	//mikroservice mimarileride bu mantıkla sisteme enjekte edilir. 


}

package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		// buraya normalde log kodunu yazmak lazým ama bu log kodu jlogger dan gelecek. 
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
	}
}

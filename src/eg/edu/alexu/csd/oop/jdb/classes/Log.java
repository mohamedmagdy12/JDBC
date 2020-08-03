package eg.edu.alexu.csd.oop.jdb.classes;

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
public class Log {
	
	private Logger logger;
	private FileHandler fileHandler;
	
	public Log() {
		File file = new File("log.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			fileHandler = new FileHandler("log.txt",true);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger = Logger.getLogger("sample");
		logger.addHandler(fileHandler);
		logger.setLevel(Level.INFO);
		SimpleFormatter formatter = new SimpleFormatter();
		fileHandler.setFormatter(formatter);
		
	}
	
	public Logger getLogger() {
		return this.logger;
	}
}

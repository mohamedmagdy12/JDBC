package eg.edu.alexu.csd.oop.jdb;

import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;

public interface Driver {
	
	
	public boolean acceptsURL(String url) throws SQLException;
	
	public Connection connect(String url, Properties info) throws SQLException;
	
	 	
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException;
}

package eg.edu.alexu.csd.oop.jdb.classes;

import java.io.File;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;


import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.logging.Logger;


public class SQLDriver implements Driver {
	
	private Log log = new Log();

	@Override
	public java.sql.Connection connect(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		if(!acceptsURL(url)) {
			log.getLogger().warning("Invalid url");
			return null;
		}else {
			File file = (File) info.get("path");
			String path = file.getAbsolutePath();
			Connection connect = new SQLConnection(path);
			log.getLogger().info("Connection returned successfully");
			return connect;
			
		}

	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		if(url.equals("jdbc:xmldb://localhost")) {
			log.getLogger().info("Url accepted");
			return true;
		}else {
			log.getLogger().warning("Invalid url");
			return false;
		}
		
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		DriverPropertyInfo[] array = new DriverPropertyInfo[info.size()];
		int i =0;
		for(Entry it : info.entrySet()) {
			array[i++] = (DriverPropertyInfo) it.getValue();
		}
		return array;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}
	
}

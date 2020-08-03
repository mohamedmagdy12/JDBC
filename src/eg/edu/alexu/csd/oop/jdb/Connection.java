package eg.edu.alexu.csd.oop.jdb;

import java.sql.SQLException;


public interface Connection {
	public Statement createStatement() throws SQLException;
	public void close() throws SQLException;
}

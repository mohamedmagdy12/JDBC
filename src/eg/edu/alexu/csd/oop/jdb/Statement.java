package eg.edu.alexu.csd.oop.jdb;

import java.sql.SQLException;



public interface Statement {
	public void addBatch(String sql) throws SQLException;
	public void clearBatch() throws SQLException;
	public void close() throws SQLException;
	public boolean execute(String sql) throws SQLException;
	public int[] executeBatch() throws SQLException;
	public Resultset executeQuery(String sql) throws SQLException;
	public int executeUpdate(String sql) throws SQLException;
	public Connection getConnection() throws SQLException;
	public int getQueryTimeout() throws SQLException;
	public void setQueryTimeout(int seconds) throws SQLException;
}

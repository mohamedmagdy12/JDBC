package eg.edu.alexu.csd.oop.jdb;

import java.sql.SQLException;



public interface Resultset {
	public boolean absolute(int row) throws SQLException;
	public void afterLast() throws SQLException;
	public void beforeFirst() throws SQLException;
	public void close() throws SQLException;
	public int findColumn(String columnLabel) throws SQLException;
	public boolean first() throws SQLException;
	public int getInt(int columnIndex) throws SQLException;
	public long getInt(String columnLabel) throws SQLException;
	public ResultSetMetaData getMetaData() throws SQLException;
	public Object getObject(int columnIndex) throws SQLException;
	public Statement getStatement() throws SQLException;
	public String getString(int columnIndex) throws SQLException;
	public String getString(String columnLabel) throws SQLException;
	public boolean isAfterLast() throws SQLException;
	public boolean isBeforeFirst() throws SQLException;
	public boolean isClosed() throws SQLException;
	public boolean isFirst() throws SQLException;
	public boolean isLast() throws SQLException;
	public boolean last() throws SQLException;
	public boolean next() throws SQLException;
	public boolean previous() throws SQLException;
}

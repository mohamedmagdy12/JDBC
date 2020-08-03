package eg.edu.alexu.csd.oop.jdb;

import java.sql.SQLException;

public interface ResultSetMetaData {
	public int getColumnCount() throws SQLException;
	public String getColumnLabel(int column) throws SQLException;
	public String getColumnName(int column) throws SQLException;
	public int getColumnType(int column) throws SQLException;
	public String getTableName(int column) throws SQLException;
}

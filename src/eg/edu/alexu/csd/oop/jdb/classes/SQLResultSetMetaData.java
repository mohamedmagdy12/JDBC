package eg.edu.alexu.csd.oop.jdb.classes;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import eg.edu.alexu.csd.oop.db.Database;
import eg.edu.alexu.csd.oop.db.classes.XML;


public class SQLResultSetMetaData implements ResultSetMetaData {
	private String tableName;
	private Log log=new Log();
	private Database db;
	private ArrayList<String> columns;
	
	private XML xml = new XML();
	
	public SQLResultSetMetaData(String tableName, Database db) {
		this.tableName=tableName;
		this.db = db;
		columns=db.getColumns();
	}
	
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public int getColumnCount() throws SQLException {
		// TODO Auto-generated method stub
		log.getLogger().info("number of columns returned successfully!");
		return columns.size();
	}

	@Override
	public boolean isAutoIncrement(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public boolean isCaseSensitive(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public boolean isSearchable(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public boolean isCurrency(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public int isNullable(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public boolean isSigned(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public int getColumnDisplaySize(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public String getColumnLabel(int column) throws SQLException {
		// TODO Auto-generated method stub
		String columnName=columns.get(column);
		log.getLogger().info("column label returned successfully!");
		return columnName;
	}

	@Override
	public String getColumnName(int column) throws SQLException {
		// TODO Auto-generated method stub
		String columnName=columns.get(column);
		log.getLogger().info("column name returned successfully!");
		return columnName;
	}

	@Override
	public String getSchemaName(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public int getPrecision(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public int getScale(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public String getTableName(int column) throws SQLException {
		// TODO Auto-generated method stub
		log.getLogger().info("table name returned successfully!");
		return tableName;
	}

	@Override
	public String getCatalogName(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public int getColumnType(int column) throws SQLException {
		// TODO Auto-generated method stub
		String columnName=columns.get(column);
		HashMap<String,String> xsdMap=new HashMap<>();
		xsdMap=xml.readXSD(tableName);
		String xsdType = null;
		for(Entry<String,String> entry:xsdMap.entrySet()) {
			if(entry.getKey().equalsIgnoreCase(columnName)) {
				xsdType=entry.getValue();
			}
		}
		
		String[] arr=xsdType.split(":");
		String type=arr[1];
		if(type.equals("varchar")){
			log.getLogger().info("column type returned successfully!");
		return 12;
		}
		else{
			log.getLogger().info("column type returned successfully!");
		return 4;
		}
	}

	@Override
	public String getColumnTypeName(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public boolean isReadOnly(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public boolean isWritable(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public boolean isDefinitelyWritable(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public String getColumnClassName(int column) throws SQLException {
		// TODO Auto-generated method stub
		throw new java.lang.UnsupportedOperationException();
	}

}

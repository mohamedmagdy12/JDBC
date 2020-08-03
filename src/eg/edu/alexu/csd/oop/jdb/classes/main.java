package eg.edu.alexu.csd.oop.jdb.classes;

import java.io.File;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:xmldb://localhost";
		String input = "";
		Driver driver = new SQLDriver();
		Properties info = new Properties();
		
		File dbDir = new File("sample");
		info.put("path",dbDir.getAbsoluteFile());
		Connection connection;
		
		Scanner scan = new Scanner(System.in);
		Statement statement;
		
		try {
			connection = driver.connect(url, info);
			statement = connection.createStatement();
			System.out.println("Enter a query to execute");
			System.out.println("1 to add queries to the batch");
			System.out.println("2 to terminate");
			System.out.println("3 to execute batch");
			System.out.println("-1 to exit.");
			while(!input.equals("-1")) {
				input = scan.nextLine();
				if(!input.equals("-1")) {
					if(input.equals("1")) {
						input = scan.nextLine();
						while(!input.equals("2")) {
							statement.addBatch(input);
							input = scan.nextLine();
						}
					}else if(input.equals("3")) {
						statement.executeBatch();
					}else {
						statement.execute(input);
					}
				}
			}
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

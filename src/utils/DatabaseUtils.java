package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtils {
	//url database
	static final String DB_URL = "jdbc:mysql://localhost/rumah_sakit_kelompok_e";
	String user = "root";
	String password = "basdat2020";
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	public void connect() {
		try {
			connection = DriverManager.getConnection(DB_URL, user, password);
		} catch (Exception e) {
			System.out.println("Terjadi error " + e.getMessage());
		}
	}
	
	public void disconnect() {
		try {
			connection.close();
			statement.close();
			resultSet.close();
		}catch (Exception e){
			System.out.println("Terjadi error : " +e.getMessage());
		}
	}
	
	public ResultSet readData(String query) {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			return resultSet;
		} catch (SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return resultSet;
	}
	
	public void executeQuery(String query) {
		try {
			statement = connection.createStatement();
			
			statement.executeUpdate(query);
			
		} catch (SQLException ex) {
			System.out.println("Terjadi error : " + ex.getMessage());
		}
	}
}

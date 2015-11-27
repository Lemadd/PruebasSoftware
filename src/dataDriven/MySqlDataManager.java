package dataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import util.Constants;

public class MySqlDataManager {
	
	Connection conn = null;
	
	public String [][] getMySqlTable(String table) throws ClassNotFoundException {
		try {
		String[][] tableArray;
		Class.forName(Constants.DB_DRIVER);
		
			conn = DriverManager.getConnection(Constants.DB_URL+ 
					Constants.DB_NAME, Constants.DB_USER, Constants.DB_PWD);
			Statement stmt = conn.createStatement();
			String sql = "SELECT * from " + table;
			
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsMetaData = rs.getMetaData();
			
			int colCount = rsMetaData.getColumnCount();
			int rowCount = 0;
			
			while (rs.next()) {
				rowCount++;
			}
			
			tableArray = new String[rowCount][colCount];
			rs.beforeFirst();
			
			for (int r = 0; r < rowCount; r++) {
				rs.next();
				for (int c = 0; c < colCount; c++)
					tableArray[r][c] = rs.getString(c+1);
			}
			
			stmt.close();
			conn.close();
			
			return tableArray;
					
		} catch (SQLException e) {
			System.err.println("Error mysql" + e.getMessage());
			return null;
		}
		
		
	}
 	
}

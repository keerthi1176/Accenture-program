package tns.comjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcNew {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
	Class.forName("org.postgresql.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","postgres","Keerthi@123");
		
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery("SELECT*from cars");
		while (rs.next())
		{
			System.out.println(rs.getString(1)+ "\t" +rs.getString(2) +"\t"+rs.getInt(3));
			
		}
		

	}

}

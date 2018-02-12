package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prestmtex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement stmt=null;
		String qry="insert into anusha.student values(?,?,?)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			stmt=conn.prepareStatement(qry);
			stmt.setInt(1,1);
			stmt.setString(2,"anu");
			stmt.setString(3, "anuu");
			stmt.executeUpdate();
			stmt.setInt(1,2);
			stmt.setString(2,"ram");
			stmt.setString(3, "ramya");
			stmt.executeUpdate();
			stmt.setInt(1,1);
			stmt.setString(2,"madhu");
			stmt.setString(3, "madhavi");
			stmt.executeUpdate();
			
			
			
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(stmt!=null)
			{
				try
				{
				stmt.close();
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			}
		
		
			if(conn!=null)
			{
				try
				{
				conn.close();
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			}
		}
	
		


	}

}

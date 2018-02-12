package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Firstinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement stmt=null;
		String qry="insert into anusha.student values(1,'anu','anusha')";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			stmt=conn.prepareStatement(qry);
			int i=stmt.executeUpdate();
			System.out.println(i);
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

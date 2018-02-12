package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Resultsetexxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from student";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=conn.prepareStatement(qry);
			rs=pstmt.executeQuery();
			if(rs!=null)
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String uname=rs.getString(3);
				System.out.println(id+" "+name+" "+uname);
			}
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
			}
}

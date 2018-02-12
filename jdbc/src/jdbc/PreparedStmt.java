package jdbc;
import java.sql.*;

public class PreparedStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.jdbc.Driver");  
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mounika","root","root");  
		
		CallableStatement stmt= con.prepareCall("{call empdetails()}") ;
		
		ResultSet rs=stmt.executeQuery();
		
		while(rs.next()){
			
			System.out.println(rs.getInt(1)+":"  + rs.getString(2));
		}
		
		System.out.println("executed");
		
		con.close();

	}

		catch(Exception e){
			System.out.println(e);
		}
}
}
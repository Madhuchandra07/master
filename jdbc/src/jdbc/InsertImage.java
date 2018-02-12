package jdbc;

import java.sql.*;
import java.io.*;

public class InsertImage {

	public static void main(String[] args) throws Exception {
		
     Class.forName("com.mysql.jdbc.Driver");  
		
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mounika","root","root");
 
     File file=new File("D:\\image1.png");
     
     FileInputStream fis=new FileInputStream(file);
     
     con.setAutoCommit(false);
     
     String qry="insert into imagetable(?,?)";
    
     PreparedStatement ps=con.prepareStatement(qry);
     
     ps.setInt(1, 001);
     
     ps.setBinaryStream(2,fis,(int)file.length());

    
     ps.executeUpdate();
     
     System.out.println("image inserted");
     con.close();

	}

}

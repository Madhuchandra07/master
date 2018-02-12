package collection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Demo1111 {

	public static void main(String[] args) {
		
		 Date date = Calendar.getInstance().getTime();  
         DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
         String strDate = dateFormat.format(date);  
         System.out.println("Converted String: " + strDate); 
		 
		 
		 //System.out.println(date);
	       
	
	}
	

}

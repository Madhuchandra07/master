package programms;

import java.util.*;

public class CountEachChar {
	
	public static void characterCount(String inputString)
    {

	 HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		char ch[]=inputString.toCharArray();
		
		for(char c:ch){
			
			if(hm.containsKey(c)){
				
				hm.put(c, hm.get(c)+1);
			}
			
			else{
				hm.put(c,1);
			}
		}
		 System.out.println(hm);
	}

	
	
	public static void main(String[] args) {
		
		
		characterCount("Iam mounika");
		
}

}
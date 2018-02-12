package stringpro;

public class String1 {
	
 static	String S;
	
 static void m1(){
		
	S="abc";
	
	System.out.println(S);
	}
	
 static void m2()
	{
		
		S="def";
		
		System.out.println(S);
	}
	
 static void m3(){
		
		System.out.println(S);
	}

	public static void main(String[] args) {
		
//		String1 S1=new String1();
//		S1.m1();
//		S1.m2();
//		S1.m3();
//		
//		System.out.println(S1.S);
		m1();
		m2();
		m3();
		System.out.println(S);
		
		

	}

}

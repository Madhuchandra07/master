package oops;

class parent{
	
	public void m1(){
		System.out.println("hello");
	}
}




public class MethosOveridingdemo extends  parent{
	
	public void m1(int i){
		System.out.println("java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	parent p= new MethosOveridingdemo();
	p.m1();
		
		
	}

}

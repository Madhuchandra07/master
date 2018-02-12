package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestJUnit {
	
	String S1="Hello JUnit";
	
	HelloWorld hello=new HelloWorld(S1);
	
	
	@Test
	public void Testprintresult(){
		
		String S="Hello";
		assertEquals(S,hello.printresult());
	}



}

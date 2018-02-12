package programms;

public class SumOfDigits {

	public static void sum(int num1)
	
	{
		
		int num2=num1;
		int sum=0;
		
		while(num2!=0){
			
			
			int lastdigit=num2%10;
			
			sum=sum+lastdigit;
			
			num2=num2/10;
			
			
			
		}
		System.out.println("sum of digits of given num is:"+num1+"="+sum);
		
	}
	
	
	public static void main(String[] args) {
		
		sum(12345);

	}

}

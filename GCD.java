
import java.util.Scanner;

public class GCD {

	//MAIN ALGORITHM
	public static int GCD (int num1, int num2)
	
  {
			while (num1 != num2) {		
				if(num1 > num2)
	               num1 = num1 - num2;
	            else
	               num2 =num2 - num1;	
			}
		
			return 	num2;	
			
	}
	
	//COUNTER
	public static int gcdIterations (int num1, int num2)
	{
			int count = 0;
			
			while (num1 != num2) {		
				if(num1 > num2)
	               num1 = num1 - num2;
	            else
	               num2 =num2 - num1;
				
				count++;
			}
		return count++;			
			
	}
		
	public static void main(String[] args) {
		
		//USER INPUTS FOR FUNCTIONS
			Scanner var1 = new Scanner (System.in);
			System.out.printf("Please enter the first number: ");
			int number1 = var1.nextInt();

			Scanner var2 = new Scanner (System.in);
			System.out.printf("Please enter the second number: ");
			int number2 = var2.nextInt();
	
		//PRINT STATEMENTS
		if (GCD(number1, number2) < 1) {
		    System.out.printf("There are no common divisors for " + number1 + " and " + number2 );
	       }
	        else {
	            System.out.printf("The GCD of " + number1 + " and " + number2 + " is: %d " , GCD(number1, number2)); 
	       	}	

		
		System.out.printf('\n' + "This loop was executed " + gcdIterations(number1, number2) + " time(s)! ");

		//close scanners
		var1.close();	
		var2.close();
	
	
}
	
}

package myDeliverable;
import java.util.Scanner;


public class UInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner inputCheck = new Scanner(System.in);
		System.out.println("Please enter a number.");
		
		
		int userInt = inputCheck.nextInt();
		
		
//		1) Write Fibonanacci series between the user entered start and end values
		
		System.out.println("---Fibonacci Series---");
		int n1 = 0, n2 = 1;
		int n3 = userInt;
		System.out.println(n1);
		System.out.println(n2);
		
		
		
		for(int i=2;i < userInt; ++i) {
			n3=n1+n2;
			System.out.println("" + n3);
			n1=n2;
			n2=n3;
			continue;
		}
		
		
		
		System.out.printf("Armstrong Check\n");
		int originalNumber, remainder, result = 0, n = 0;
		
		originalNumber = userInt;
		
		for(;originalNumber !=0; originalNumber/=10, ++n);
				
		originalNumber = userInt;
		
		for(;originalNumber !=0; originalNumber/=10) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
		}
		
		if(result == userInt)
			System.out.printf( "%d is an Armstrong number.", userInt);
		else
			System.out.println(userInt + " is not an Armstrong number.");
		
//		3) Write a program to see if a user entered string is a palindrome or not
		
		String userInput = inputCheck.next();
		

	}

}

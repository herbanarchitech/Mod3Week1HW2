
package myDeliverable;
import java.util.Scanner;


public class UInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a number.");
		
		
		int uInt = userInput.nextInt(); // used to accept the integer input from the keyboard
		
//		 this will be used to enter the beginning and ending for the fibbinoacci sequence
		
		System.out.println("fibonacci Series");
		int integerone= 0, integertwo = 1;
		int n3 = uInt;
		System.out.println(integerone);
		System.out.println(integerone);
		
		
		
		for(int i=2;i < uInt; ++i) {
			n3=integerone+integertwo;
			System.out.println("" + n3);
			integerone=integertwo;
			integertwo=n3;
			continue;
		}
		
		
		
		System.out.printf("Armstrong Check\n");
		int originalINT, remainder, result = 0, n = 0;
		
		originalINT = uInt;
		
		for(;originalINT !=0; originalINT/=10, ++n);
				
		originalINT = uInt;
		
		for(;originalINT !=0; originalINT/=10) {
			remainder = originalINT % 10;
			result += Math.pow(remainder, n);
		}
		userInput.close();

		if(result == uInt)
			System.out.printf( "%d is an Armstrong number.", uInt);
		else
			System.out.printf(" %d is not an Armstrong number.", uInt);
		
//		
		
	}

}

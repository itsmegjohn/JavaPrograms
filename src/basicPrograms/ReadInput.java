//Java Program to demonstrate working of Scanner class
package basicPrograms;

import java.util.Scanner;

public class ReadInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter string input: ");
		String str = s.nextLine();
		System.out.println("The entered string is: "+str);
		
		System.out.println("Enter integer input: ");
		int num = s.nextInt();
		System.out.println("The entered number is: "+num);
		
		System.out.println("Enter float input:" );
		float f = s.nextFloat();
		System.out.println("The entered float input is: "+f);
		
		s.close();
	}
}

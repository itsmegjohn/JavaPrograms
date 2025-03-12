package basicPrograms;

import java.util.Scanner;

public class SwapNumbers {
	
	static void swapNumbers(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("Value of n1 is: "+n1+ " and value of n2 is: "+n2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number(n1): ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number(n2): ");
		int n2 = sc.nextInt();
		
		swapNumbers(n1,n2);
	
	}
}

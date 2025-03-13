//Java program to check whether a number is even or odd
package basicPrograms;

import java.util.Scanner;

public class OddOrEven {
	
	public static void evenOrNot(int n) {
		if(n%2 == 0) {
			System.out.println("The number is even");
		}else if(n%2 == 0) {
			System.out.println("The number is zero.");
		}else{
			System.out.println("The number is odd");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: "); 
		int num = sc.nextInt();
		evenOrNot(num);
				
	}
}

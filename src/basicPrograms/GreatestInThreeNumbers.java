//Java program to find largest Among 3 Numbers
package basicPrograms;

import java.util.Scanner;

public class GreatestInThreeNumbers {
	
	public static void CompareThreeNumbers(int n1, int n2, int n3) {
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("The largest of three is "+n1);
		}else if(n2 >= n1 && n2 >= n3) {
			System.out.println("The largest of three is "+n2);
		}else{
			System.out.println("The largest of three is "+n3);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter third number:");
		int num3 = sc.nextInt();
		
		CompareThreeNumbers(num1,num2,num3);
		
	}
}

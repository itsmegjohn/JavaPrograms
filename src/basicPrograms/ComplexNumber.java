//Java program to add two complex numbers
package basicPrograms;

import java.util.Scanner;

public class ComplexNumber {
	int real, image;
	
	public ComplexNumber(int r, int i) {
		this.real = r;
		this.image = i;
	}
	
	public void showC() {
		System.out.println(this.real + " +i" +this.image);
	}
	
	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
		return new ComplexNumber(n1.real + n2.real,n1.image + n2.image);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real part of first complex number: ");
		int real1 = sc.nextInt();
		System.out.println("Enter imaginary part of first complex number: ");
		int image1 = sc.nextInt();
		System.out.println("Enter real part of second complex number: ");
		int real2 = sc.nextInt();
		System.out.println("Enter imaginary part of second complex number: ");
		int image2 = sc.nextInt();
		
		ComplexNumber c1 = new ComplexNumber(real1,image1);
		ComplexNumber c2 = new ComplexNumber(real2,image2);
		ComplexNumber result = add(c1,c2);
		result.showC();
	}
}

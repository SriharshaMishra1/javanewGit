package Basic;
/*
 * 
 * @Sriharsha
 * 
 */

import java.util.Scanner;

public class Conditional_Operator {
	
	public static void main(String[] args) {
		
		Scanner obj =new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter 1st value");
		a=obj.nextInt();
		
		System.out.println("Enter 2nd value");
		b=obj.nextInt();
		
	c=(a>b)?a:b;
	System.out.println("gratter value is "+c);
		
	}

}

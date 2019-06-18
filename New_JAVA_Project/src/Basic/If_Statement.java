package Basic;

import java.util.*;
public class If_Statement {

	
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		int Sal,Bonous;
		
		System.out.println("Enter your Salary");
		Sal=obj.nextInt();
		
		if(Sal>=25000)
		{
			Bonous=(Sal*20)/100;
			Sal=Sal+Bonous;
		}
		else {
			Bonous=(Sal*10)/100;
			Sal=Sal+Bonous;
		}
		System.out.println("Your salary is "+Sal);
	}
	
}

package Scanner;

import java.util.Scanner;

public class Fclass {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Salary");
		int Salary=scan.nextInt();
		if(Salary>50000)
		{
			System.out.println("you are eligible for PF");
			Salary=Salary+6000;
			System.out.println("your available balace is  :"+Salary);
		}
		else
		{
			System.out.println("not eligible for PF pls consern with finance dept.");
			Salary=Salary+2000;
			System.out.println("you are credited  :"+Salary);
		}
	}
}

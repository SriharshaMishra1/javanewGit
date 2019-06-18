package Scanner;

import java.util.Scanner;

public class If_Elseif_else {

	public static void main(String[] args) {
		/*Scanner scan =new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}*/
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("fizzbuzz");
			}
			else if(i%3==0){
				System.out.println("fizz");
			}
			else if(i%5==0)
			{
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
}

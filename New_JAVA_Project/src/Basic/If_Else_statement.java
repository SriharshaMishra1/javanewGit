package Basic;


import java.util.Scanner;
public class If_Else_statement {
	public static void main(String[] args) {
		
		Scanner obj =new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter 1st value");
		a=obj.nextInt();
		
		System.out.println("Enter 2nd value");
		b=obj.nextInt();
		
		System.out.println("Enter 3rd value");
		c=obj.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Gratter value is a "+a);
			}
			else
			{
				System.out.println("Gratter value is c  "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("Gratter value is b "+b);
			}
			else
				{
				System.out.println("Gratter value is c "+ c);
				}
		}
	}
}
	
	
	
	
	



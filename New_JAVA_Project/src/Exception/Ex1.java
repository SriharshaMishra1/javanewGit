package Exception;

public class Ex1 {
	
	
	int m1()
	{
		try {
		System.out.println(10/0);
		return 10;
	        }
		
		catch(ArithmeticException AE)
		{
			System.out.println("can Handled");
		}
		
		finally
		{
			System.out.println("finally method");
		}
		return 30;
	}
	public static void main(String[] args) {
		Ex1 c=new Ex1();
		int v=c.m1();
		System.out.println(v);
	}
}
	
	


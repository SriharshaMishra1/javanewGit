package Basic;

public class Variable_Assignment2 {

	int a=5;
	double d=10.5;
	
	static int i=20;
	static float f=30.3f;
	
	void m1()
	{
		System.out.println(a);
		System.out.println(d);
		 Variable_Assignment2 t1=new Variable_Assignment2();
		 System.out.println(t1.i);
		 System.out.println(t1.f);
	}
	
	static void m2()
	{
		 Variable_Assignment2 t2=new Variable_Assignment2();
		 System.out.println(t2.a);
		 System.out.println(t2.d);
		 System.out.println(Variable_Assignment2.f);
		 System.out.println(Variable_Assignment2.i);
	}
	
	public static void main(String[] args) {
		Variable_Assignment2 t3=new Variable_Assignment2();
		t3.m1();
		System.out.println(".............");
		Variable_Assignment2.m2();
	}
	
	
}

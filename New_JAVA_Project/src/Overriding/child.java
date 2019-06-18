package Overriding;

public class child extends DirectMethod {

	void m1()
	{
		System.out.println("child class m1");
	}
	//direct method
	void m2()
	{
		System.out.println("direct method");
	}
	
	
	public static void main(String[] args) {
		/*DirectMethod p=new child();
		child c=(child) p;*/
		
		DirectMethod p=(DirectMethod) new child();
		child c=(child) p;
		c.m1();
		c.m2();
	}
	
}

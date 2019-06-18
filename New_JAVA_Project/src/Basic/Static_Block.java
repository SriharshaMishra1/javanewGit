/**
 * 
 */
package Basic;

/**
 * @author sriharsha
 *
 */
public class Static_Block {
	int i;
	int j;
	static int b;
	static
	{
		System.out.println("static block-1");	
		b=555;
		System.out.println("b value is "+b);
	}
	static
	{
		System.out.println("static block-2");
	}
	{
		System.out.println("1st instance block");
		i=999;
		System.out.println("i value is "+i);
	}
	{
		System.out.println("2nd instance block");
	}
	Static_Block()
	{
		System.out.println("0-th const");
	}
	Static_Block(int a)
	{
		System.out.println("1-arg const");
	}
	
	void m1()
	{
		i=107;
		System.out.println("i value is changed "+ i);
	}
	
	public static void main(String[] args) {
		System.out.println(" main method");
		
		//new Static_Block();//call to zero th cons
		//new Static_Block(10);//call to 1-arg cons
		Static_Block t=new Static_Block();
		t.m1();
	}

	
}

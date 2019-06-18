/**
 * 
 */
package Basic;

/**
 * @author sriharsha
 *
 */
public class Variable_Assignment {

	int i=100;
	int j=200;
	
	static void m1()
	{
		Variable_Assignment t1=new Variable_Assignment();
	System.out.println(t1.i);
	System.out.println(t1.j);
	}
	
	static void m2()
	{
		Variable_Assignment t2=new Variable_Assignment();
		System.out.println(t2.i);
		System.out.println(t2.j);
	}
	public static void main(String[] args) {
		
		Variable_Assignment.m1();
		Variable_Assignment.m2();
		
		
	}
}

package Interface;

public interface IT1 {
	void m1();
	void m2();
	void m3();	
}
abstract class IT1_Sample1 implements IT1
{
	 public  void m1() {System.out.println("m1 method");}
}
abstract class Test1 extends IT1_Sample1
{
	 public void m2() {System.out.println("m2 method"); }
}
  
 
  
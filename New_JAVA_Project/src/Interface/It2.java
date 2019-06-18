package Interface;

public interface It2 {

	String m10(int a,int b);
	int m11(char ch,String str);
	void m12(int a);	
}
    abstract class Test10 implements It2
   {
    public 	String m10(int a,int b) {
    	System.out.println("int,int method");
		return "deepu" ;
    }
 
 
  }

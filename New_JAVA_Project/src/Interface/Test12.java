package Interface;
class Test12 extends Test11
  {
	 public void m12(int a) {
		 System.out.println("int mtd");	 
	  }
	 public static void main(String[] args) {
		 Test12   t3=new Test12  ();
		t3.m10(7, 7);
		t3.m12(3);
		t3.m11('a',"sri");
	}
  }
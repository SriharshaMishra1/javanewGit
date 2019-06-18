package Abstraction;

class child extends Test  {
	void m1() {System.out.println("parent m1 imp");}
	void m2() {System.out.println("parent m2 imp");}
	void m3() {System.out.println("parent m3 imp");}
	
	public static void main(String[] args) {
		child t=new child();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		Test p=new child();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		
	}
}

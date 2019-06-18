package Array;

public class Test5 {

	int empid;
	String empname;
	public Test5(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	public static void main(String[] args) {
		Test5[] t=new Test5[5];
		Test5 t5=new Test5(111, "sriharsha");
		Test5 t6=new Test5(222, "srihara");
		Test5 t7=new Test5(333, "sridhar");
		t[0]=t5;
		t[2]=t7;
	for(Object o :t)
	{
		if(o instanceof Test5)
		{
			Test5 c=(Test5)o;
			System.out.println(c.empid+" "+c.empname);	
		}
		
		if(o==null)
		{
			System.out.println(o);
		}
		System.out.println("...............");
		for(int i=0;i<t.length;i++)
		{
			//System.out.println(t[i]);
			if(t[i]==null)
			{
				System.out.println(i);
			}
		}
		
	}
		
	}
}

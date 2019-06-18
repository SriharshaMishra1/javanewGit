package Basic;

public class Tcs_Emp_Variable {

	int id;//instance variable
	String name;
	static String comp="Tcs";	

	
	public static void main(String[] args) {  //static method
		
		Tcs_Emp_Variable obj1=new Tcs_Emp_Variable();
		Tcs_Emp_Variable obj2=new Tcs_Emp_Variable();
		Tcs_Emp_Variable obj3=new Tcs_Emp_Variable();
		
		obj1.id=101;
		obj2.id=102;
		obj3.id=103;
		
		obj1.name="rohit";
		obj2.name="rohon";
		obj3.name="millan";
		
		System.out.println("Company Name is= "+Tcs_Emp_Variable.comp);
		System.out.println(".........................");
		System.out.println("Emp1 id is = "+obj1.id);
		System.out.println("Emp2 id is = "+obj2.id);
		System.out.println("Emp3 id is = "+obj3.id);
		System.out.println("........................");
		System.out.println("Emp1 name is = "+obj1.id);
		System.out.println("Emp2 name is = "+obj2.id);
		System.out.println("Emp3 name is = "+obj3.id);
	}
}

package Basic;

public class InstanceVariable_and_LocalVariable {

	String FirstName;           //instance variable
	String LastName;
    String nickname="deepu";
	int age;
	int BankAccNo;
	int salary;
	static int companycode=20409;
	
    public  InstanceVariable_and_LocalVariable(String lastnm)
	{
		this.LastName=lastnm;
		System.out.println("The last name of the employeer is "+LastName);				
	}
    
    public void Salary_Emp()
    {
    	int salary=60000;
    	int tax=10000;
    	salary=salary-tax;
    	System.out.println("New salary is "+salary);
	
    }
        
        
public static void main(String[] args) {
		
		InstanceVariable_and_LocalVariable	obj=new InstanceVariable_and_LocalVariable("Mishra");
	 	obj.FirstName="Sriharsha";
		System.out.println("FirstName is "+obj.FirstName);
		obj.age=25;//nonstatic
		System.out.println("Age is "+obj.age);//nonstatic
	System.out.println("Companycode is "+InstanceVariable_and_LocalVariable.companycode);//static
	System.out.println("nick is " +obj.nickname);
		obj.Salary_Emp();
	}
	
	
}

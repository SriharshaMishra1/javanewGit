package Com.dss.declaration;

public class InterfaceDemo {
public static void main(String[] args) {
	Bank hdfc=new HDFCBank();
	hdfc.deposit();
	hdfc.withdraw();
	System.out.println(hdfc.roi());
	//Bank icici=new ICICIBank ();
	
}

}
class HDFCBank implements Bank
{

	@Override
	public void deposit() {
		System.out.println("Hdfc deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Hdfc withdraw");
		
	}

	@Override
	public void Calculate_Interface() {
	
		System.out.println("Hdfc Ci");
	}

	@Override
	public
	 int roi() {
		System.out.println("Hdfc roi is =");
		return 12;
	}
	
}
class ICICIBank implements Bank
{
	@Override
	public void deposit() {
		System.out.println("Icici deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Icici withdraw");
		
	}

	@Override
	public void Calculate_Interface() {
		System.out.println("Icici ci");
		
	}
	@Override
	public int roi() {
		System.out.println("Icici roi is "+ this);
		return 14;
	}	

}
package String_Class;

public class ValueOf {
	
	public static void main(String[] args) {
		String str="java Developers deepu lipu";
		System.out.println(str.length());
		/*String[] mul=str.split(" ");
		for(int i=0;i<=mul.length-1;i++)
		{
			System.out.println(mul[i]);
		}
		*/
		String[] mul=str.split(" ");
		for(int i=mul.length-1;i>=0;i--) {
			
			System.out.println(mul[i]);
		}
	/*char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>0;i--)
		{
			System.out.println(ch[i]);
		}
	}
	*/	
	}
	
}
package Overriding;

public class reverse {

	
	public static void main(String[] args) {
		
		String str="good";
		System.out.println(str);
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
	
}

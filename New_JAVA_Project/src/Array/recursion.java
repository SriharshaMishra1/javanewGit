package Array;

public class recursion {
	 static String reverse=" ";//globally
	public static void main(String[] args) {
		recursion recurse=new recursion();
		recurse.reverseString("java");
	}

	public void reverseString(String string) {
		
	   for(int i=0;i<string.length();i++)
	   {
		   System.out.println(reverse=reverse+string.charAt(i));
	   }
		
	}
/*	static String rev=" ";
	static int i=0;
	public static void main(String[] args) {
		String str="java";
		recurce(str);
		System.out.println(rev);
	}
	private static void recurce(String s) {
		
		if(i<s.length())
		{
			rev=s.charAt(i)+rev;
			i++;
			recurce(s);
		}
		
	}*/
}

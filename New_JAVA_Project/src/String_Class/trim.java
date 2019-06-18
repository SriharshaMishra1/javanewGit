package String_Class;

public class trim {

	public static void main(String[] args) {
		
	/*	String str="   javaDeveloper";
		System.out.println(str.length());
		System.out.println(str.trim());*/
		//split
		/*String str="java Developer Sriharsha";
		System.out.println(str.length());
		System.out.println(str.trim());
		String[] mul=str.split(" ");
		
		for(int i=0;i<=mul.length-1;i++) {
			System.out.println(mul[i]);
		}
		System.out.println("......new.....");
		for(int i=mul.length-1;i>=0;i--) {
			System.out.println(mul[i]);
		}*/
		//toCharArray
		/*String str="java Developer Sriharsha";
		System.out.println(str);
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]);
		}*/
		
		/*String str="Good Friend is Needed";
		System.out.println(str);
		String[] mul=str.split("");
		for(int i=mul.length-1;i>=0;i--)
		{
			System.out.print(mul[i]);
		}*/
		
		/*String str="Good Friend is Needed";
		System.out.println(str);
		String[] mul=str.split(" ");
		for(int i=0;i<=mul.length-1;i++)
		{
			//System.out.println(mul[i]);
			StringBuffer buff=new StringBuffer(mul[i]);
			System.out.println(buff.reverse());;
			
		}
		*/
	/*	
		String str="MadaM";
		System.out.println(str);
		//StringBuffer buff=new StringBuffer(str);
		//buff.reverse();
		String str1=str.toString();
		System.out.println(str1);
		if(str.equals(str1))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not");
		}
		*/
		/*String str="Good Frind Is Needed";
		System.out.println(str.replace(" ", ""));
		String str2=str.replace(" ", "");
		String vowel= "aeiou";
	   String[] ch=str2.split("");
		for(int i=0;i<ch.length-1;i++)
		{
			//System.out.print(ch[i]);
			if(vowel.contains(ch[i]))
			{
				System.out.println(ch[i]+="vowel");
			}
			else
			{
				System.out.println(ch[i]+="consonent");
			}
		}*/
	
		int[] i= {10,20,30,40};
		/*System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[3]);*/
		int t=i.length;
		int g=i.length-1;
		System.out.println(t);
		System.out.println(g);
		/*for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}*/
		
		
		
		
		
		
	}
	
}

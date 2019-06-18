package String_Class ;


public class String_Class1 {
	public static void main(String[] args) {
		
		String str1="Good Friend Is Needed";
		String[] str2=str1.split(" ");
		for(int i=0;i<=str2.length-1;i++)
		{
			System.out.println(str2[i]);
			StringBuffer buff=new StringBuffer(str2[i]);
			buff.reverse();
			//System.out.print(buff+" ");
		}
	}
	

}

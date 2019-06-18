package Array;

public class Test1 {
	
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=50)
			{
				System.out.println("gratter value is "+a[i]);
			}
			
			if(a[i]<50)
			{
				System.out.println("smaller values are "+a[i]+" ");
			}
			
			
		}
		
	System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
	}

}

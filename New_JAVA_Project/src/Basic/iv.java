package Basic;

public class iv {
	
	int x=10;
	public static void main(String[] args) {
		
		iv t=new iv();
        System.out.println(t.x);
        System.out.println("..............");
        
        int r=t.lv();
	}  
        public int lv() {
        	
        	System.out.println("vvvvvvv");
         System.out.println(x);
		return x;
        }

	}



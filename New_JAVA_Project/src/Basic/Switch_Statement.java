/**
 * 
 */
package Basic;

/**
 * @author sriharsha
 *
 */
import java.util.*;

public class Switch_Statement {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int mode=0;
		System.out.println("Enter traffic rule no");
		mode=obj.nextInt();
		
		switch(mode)
		{
		case 0 :
			System.out.println("RED Zone");
			break;
		case 1:
			System.out.println("Green Zone");
			break;
		case 2:
			System.out.println("Yellow Zone");
			break;
			default:
				System.out.println("walk those have no vehicle");
				
	}

	}
}

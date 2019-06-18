package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("rama");
		list.add("shyam");
		list.add("dama");
		list.add("gopal");
		
	System.out.println(list.size());
	Collections.swap(list, 1, 3);
	
	System.out.println(list);
	ArrayList<String> list1=new ArrayList<String>(list.subList(1, 3));
	System.out.println(list1);
	
	
	}
}

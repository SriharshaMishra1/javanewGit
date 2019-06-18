package Collection;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Collection {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("mava");
		list.add("java");
		list.add("somu");
		list.add("rama");
		list.add("somu");
		list.add("mava");
		list.add("java");
		list.add("mava");
		System.out.println(list.size());
		
		
		//new LinkedHashMap<>();
		for(int i=0;i<=list.size()-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=list.size()-1;j++)
			{
				if(list.get(i).equals(list.get(i)))
				{
					count++;
				}	
			}
			if(count>1&&!list.contains(list.get(i)))
			{
				list.add(list.get(i));
			}
		}
		
		System.out.println(list);
		
	}
}

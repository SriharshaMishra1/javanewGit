package Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

/*public class StringtoArrayList {
    public static void main(String args[]){
        String str = "99,42,55,81,79,64,22";
        String str1[] = str.split(",");
        
        List list = new ArrayList();
        list = Arrays.asList(str1);
        for(Object s: list){
            System.out.println(s);
        }
    }
}*/
/*public class StrToInt {

	 public static void main(String args[]) {
	  String str = "123";
	  int i = Integer.parseInt(str);
	  System.out.println(str + 50); //12350 because its concatenate to value.
	  System.out.println(i + 50); //173 because +(plus) is binary plus operator. 
	 }

	}*/
/*public class LargestSmallest 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };

		int min = a[0]; //  assume first elements as smallest number
		int max = a[0]; //  assume first elements as largest number

		for (int i = 1; i < a.length; i++)  // iterate for loop from arrays 1st index (second element)
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
	}

}*/
/*public class JavaFlip {
public static void main(String[] args) { 
if (Math.random() < 0.5){
System.out.println("Heads");
}else{
System.out.println("Tails");
}
}
}*/
import java.util.ArrayList; 
import java.util.Collections; 

/*public class Test { 

public static void main(String[] args) { 

int[] myArray={1,3,4,2,12,10,8,7,6,5,9,14} ; 
ArrayList<Integer>evenList = new ArrayList<Integer>(); 
ArrayList<Integer>oddList = new ArrayList<Integer>(); 

for(int i=0;i<myArray.length;i++){ 
if(myArray[i]%2==0){ 
evenList.add(myArray[i]); 
}else{ 
oddList.add(myArray[i]); 
} 
} 
Collections.sort(evenList); 
Collections.sort(oddList); 
for(int even : evenList) 
System.out.print(even+","); 
for(int odd : oddList) 
System.out.print(odd+","); 

} 

} */
/*public class FinalReverseWithoutUsingStringMethods {
          public static void main(String[] args) {         
                   String str = "Automation";
                   StringBuilder str2 = new StringBuilder();
                   str2.append(str);
                   str2 = str2.reverse(); // used string builder to reverse
                   System.out.println(str2);

          }

 

}*/
public class ReverseSplit {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        String str;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your String");

        str = in.nextLine();

        String[] token = str.split("");    //used split method to print in reverse order

        for(int i=token.length-1; i>=0; i--)

        {

            System.out.print(token[i] + "");

        }
    }

}



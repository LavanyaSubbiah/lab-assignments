/**
 * 
 * date 23/10/2020
 * @author Lavanya Subbiah
 *desc sort in alphabetical order
 */
import java.util.*;
public class SortingStrings {
   static int number=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of elements");
     number=sc.nextInt();
     System.out.println("Enter the number of array elements:");
     String[] array=new String[number];
     for(int i=0;i<number;i++)
     {
    	 array[i]=sc.next();
     }
     sortStrings(array);
	}

	private static void sortStrings(String[] array) {
		// TODO Auto-generated method stub
		Arrays.sort(array);
		String[] resultArray=new String[number];
		if(number%2==0)
		{
			for(int i=0;i<number/2;i++)
			{
				String str=array[i].toUpperCase(); //convert first half of array to uppercase
			  	resultArray[i]=str;
			}
			for(int i=(number/2);i<number;i++)
			{
				String str=array[i].toLowerCase();// convert second half of array to lowercase
				resultArray[i]=str;
			}
		}
		else
		{
			for(int i=0;i<(number/2)+1;i++) {
				String str=array[i].toUpperCase();// convert first half of array to uppercase
				resultArray[i]=str;
			}
			for(int i=(number/2)+1;i<number;i++)
			{
				String str=array[i].toLowerCase();// convert second half of array to lowercase
				resultArray[i]=str;
			}
		}
		System.out.println("The result array is :");
		for(int i=0;i<number;i++) {
		System.out.println(resultArray[i]);
		}
		
	}

}

/**
 * 
 * @author Lavanya Subbiah
 *date 23/10/2020
 *desc reverse the numbers in the array and returns the resulting array in sorted order
 *
 *
 */
import java.util.*;
public class ReverseSorting {
	 static int number=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of elements");
		    number=sc.nextInt();
		    System.out.println("Enter number of elements in an array");
		    int[] array=new int[number];
		    for(int i=0;i<number;i++)
		    {
		    	array[i]=sc.nextInt();
		    }
		    getSorted(array);
			}
	private static void getSorted(int[] array) {
		// TODO Auto-generated method stub
		String rev="";
		int[] reverseArray=new int[number];
		for(int i=0;i<number;i++)
		{
			String str=Integer.toString(array[i]);
			StringBuilder sb=new StringBuilder(str);
			rev=sb.reverse().toString();
			reverseArray[i]=Integer.parseInt(rev);
			
		}
		Arrays.sort(reverseArray);
		System.out.println("The reversed and sorted elements are : ");
		for(int i=0;i<number;i++)
		{
			System.out.println(reverseArray[i]);
		}
	}
	

}

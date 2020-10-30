/**
 * 
 * @author Lavanya Subbiah
 * date 23/10/2020
 * desc which accepts an integer array and removes all the duplicates in the array
 *
 */
import java.util.*;
public class RemoveDuplicates {
static int number=0;
private static void modifyArray(int[] array) {
		Set<Integer> tree_Set=new TreeSet<>();
		int count=0,flag=0;
		for(int i=0;i<number;i++)
		{
		   tree_Set.add(array[i]);//remove the duplicate elements
		}
		int[] removeDup=new int[number];
		for(Integer value :tree_Set)
		{
		removeDup[count++]=value;
		}
		System.out.println("The Result is : ");
		for(int i=count;i>=0;i--)  //prints the duplicate elements in reverse order
		{
			if(removeDup[i]==0) {
				flag++;
			}else
			{
			System.out.println(removeDup[i]);
			}
		}
		
	}
	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number of elements");
          number=sc.nextInt();
          System.out.println("Enter the total number of elements in an array");
          int[] array=new int[number];
          for(int i=0;i<number;i++)
          {
        	  array[i]=sc.nextInt();
          }
          modifyArray(array);
         sc.close();
          
          
	}
	

}

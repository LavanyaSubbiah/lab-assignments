/**
 * 
 * @author Lavanya Subbiah
 *date 23/10/2020
 *desc second smallest element
 */
import java.util.*;
public class SecondSmallest {
private static int getSecondSmallest(int[] array) {
		Arrays.sort(array);// sorts the array 
		int res=array[1];// gives the second largest elements in array
		return array[1];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int Number=sc.nextInt();
		System.out.println("Enter number of elements in an array");
		int[] array=new int[Number];
		for(int i=0;i<Number;i++) {
			array[i]=sc.nextInt();
		}
		int result=getSecondSmallest(array);
		System.out.println("The second smallest element is "+result);
                                      sc.close();
	}

	
}

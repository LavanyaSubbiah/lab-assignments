/**
 * 
 * @author Lavanya Subbiah
 *date 23/10/2020
 *desc second smallest element
 */
import java.util.*;
public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

	private static int getSecondSmallest(int[] array) {
		// TODO Auto-generated method stub
		Arrays.sort(array);// sorts the array 
		int res=array[1];// gives the second largest elements in array
		return array[1];
	}

}

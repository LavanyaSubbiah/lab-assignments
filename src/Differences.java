/**
 * 
 * @author Lavanya Subbiah
 *date 20/10/2020
 *desc difference between the sum of the squares and the square
 */
import java.util.*;
public class Differences {
static int value=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
value=sc.nextInt();
int result=calculateDifferences(value);
System.out.println("The differences is "+result);
	}
	private static int calculateDifferences(int value2) {
		// TODO Auto-generated method stub
		int sum=0,squaresum=0;
		for(int i=1;i<=value;i++)
		{
			sum=sum+i;
			
			squaresum=squaresum+(i*i);
			
		}
		sum=sum*sum;
		int diff=sum-squaresum;
	
		
		return diff;
	}

}

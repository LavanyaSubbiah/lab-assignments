/**
 * 
 * @author Lavanya Subbiah
 * date 20/10/2020
 * desc DivisibleBy
 *
 */
import java.util.*;
public class DivisibleBy {
    static int value=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		value=sc.nextInt();
		int result=CalculateSum(value);
		System.out.println("The sum is "+result);

	}
	private static int CalculateSum(int value2) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=value;i++) {
		if((i%3==0)&&(i%5==0))
		{
			sum=sum+i;
		}
		}
		return sum;
	}

}

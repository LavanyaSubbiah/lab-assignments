/**
 * 
 * @author Lavanya Subbiah
 * date 22/10/2020
 * desc SumOfCubes
 *
 */
import java.util.*;
public class SumOfCubes {
  
	 static int value;
	 static int result=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        value=sc.nextInt();
      result=calculateSum(value);
      System.out.println("The result is "+result);
	}
	private static int calculateSum(int value2) {
		// TODO Auto-generated method stub
		while(value>0) {
			int temp=value%10;
			result=result+(temp*temp*temp);
			value=value/10;
		}
		
		
		return result;
	}
	

}

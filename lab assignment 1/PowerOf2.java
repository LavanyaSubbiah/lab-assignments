/**
 * 
 * @author Lavanya Subbiah
 *date 22/10/2020
 *desc Power of 2 or not
 *
 */
import java.util.*;
public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int value=sc.nextInt();
		boolean result=powerOf2(value);
		System.out.println(result);

	}

	private static boolean powerOf2(int value) {
		// TODO Auto-generated method stub
		while(value!=1)
	    {
	        if(value%2!=0)
	            return false;
	        value=value/2;
	    }
		return true;
	}

}

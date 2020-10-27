/**
 * 
 * @author Lavanya Subbiah
 * date 22/10/2020
 * desc recursivefibanooci
 *
 */
import java.util.*;
public class Recursivefibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int value=sc.nextInt();
int result=fibanocci(value);
System.out.println(result);
	}

	private static int fibanocci(int value) {
		// TODO Auto-generated method stub
		if(value<=1) {
			return value;
		}
		return fibanocci(value-1)+fibanocci(value-2);
	}

}

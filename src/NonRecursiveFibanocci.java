/**
 * 
 * @author Lavanya Subbiah
 * date   22/10/2020
 * desc   NonRecursiveFibanocci
 *
 */
import java.util.*;
public class NonRecursiveFibanocci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		int value1=1,value2=1,sum=0;
		for(int i=1;i<=value;i++){
			System.out.println(value1 + " ");
	sum=value1+value2;
	value1=value2;
		value2=sum;

	}
	}}

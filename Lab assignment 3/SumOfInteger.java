/**
 * 
 * @author Lavanya Subbiah
 *date 25/10/2020
 *desc reads a line of integers and then displays each integer and the sum of all integers
 */
import java.util.*;
public class SumOfInteger {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String number=sc.nextLine();
	checkNextString(number);
	}
    private static void checkNextString(String number) {
		StringTokenizer st=new StringTokenizer(number);// adds string into stringtokenizer
		int sum=0,num=0;
		System.out.println("The numbers are :");
		while(st.hasMoreElements()) {//checks for next elements
			String str=st.nextToken();
			num=Integer.parseInt(str);
			System.out.println(num);//prints the number
			sum=sum+num;
		}
		System.out.println("The sum is : "+sum);// prints the sum of the numbers
	}

}

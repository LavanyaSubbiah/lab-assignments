/**
 * 
 * @author Lavanya Subbiah
 *date 25/10/2020
 *desc newly formed number is equal to the difference between two consecutive digits in the original number. 
 */
import java.util.*;
public class NewlyFormedNumber {
               private static String modifyNumber(int number) {
		String str=Integer.toString(number);
	    char[] array=str.toCharArray();
	    int len=array.length;
	    String newStr="";
	    int num=0;
	    for(int i=0;i<len-1;i++) {
	    	num=array[i+1]-array[i];//calculates the consecutive difference
	    	if(num<0)
	    	{
	    		num=-(num);
	    	}
	    	String s=Integer.toString(num);//converts into string
	    	newStr=newStr+s;
	    }
	    num=array[len-1]-array[0];// find difference between first and last digit
	    if(num<0) {
	    	num=-(num);
	    }
	    String s=Integer.toString(num);
	    newStr=newStr+s;
		return newStr;// returns string
	}

	public static void main(String[] args) {
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the Number");
                   int number=sc.nextInt();
                   String difference = modifyNumber(number);
                   System.out.println("The difference is "+difference);//prints the difference
                   sc.close();
      }
}

/**
 * 
 * @author Lavanya Subbiah
 *date 22/10/2020
 *desc IncreasingNumber
 */
import java.util.*;
public class IncreasingNumbers {

	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub   
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	num = sc.nextInt();
	boolean result=checknumber(num);
	 if(result==true){
		 System.out.println("true");
	 }
	 else{
		 System.out.println("false");
	 }
	 }
	

	private static boolean checknumber(int num) {
		// TODO Auto-generated method stub	       
	       int currentDigit = num % 10;
	       num = num/10;
	        int flag=0;
	       while(num!=0){
	           if(currentDigit <= num % 10){
	               flag = 1;
	               break;
	           }
	           currentDigit=num%10;
	           num=num/10;
	}
	       if(flag==1) {
	    	   return false;
	       }else
	    	   return true;
	}
}

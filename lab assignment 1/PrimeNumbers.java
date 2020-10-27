/**
 * 
 * @author Lavanya Subbiah
 * date 22/10/2020
 * desc PrimeNumbers
 *
 */
import java.util.*;
public class PrimeNumbers {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int count=0;
		 String primeNumbers="";
		 System.out.println("Enter the value");
		 int value=sc.nextInt();
		 for (int i = 1; i <= value; i++)         
	       { 		  	  
	          for(int num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		count++;
		     }
		  }
		  if (count ==0)
		  {
			  primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
		 System.out.println(primeNumbers);
	}

}

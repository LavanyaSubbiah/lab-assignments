/**
 * Author Lavanya subbiah 
 * date 1/10/2020
 * desc Calculating age of a person above 15
 */
package age;
import java.util.*;
public class Main {

	private static void verifyException(int age) {
		/**
		 * creating a try block to check age above 15
		 */
		try {
			if(age<=15) {
				throw new AgeException("Age should be above 15");
			}
			else {
				System.out.println("!!!!The age entered is "+age);
			}
		}
		/**
		 * creating a catch block to throw the exception
		 */
		catch(AgeException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the age");
       /**
        * Entering the age of a person
        */
       int age=sc.nextInt();
       /**
        * creating a method verifyException to calculate the age
        */
       verifyException(age);
       sc.close();
	}

}

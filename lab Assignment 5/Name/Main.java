/**
 * Author Lavanya subbiah 
 * date 1/10/2020
 * desc checking that first name and last name is not blank
 */
package Name;
import java.util.*;
public class Main {
	private static void verifyNameisFull(String firstName, String lastName) {
		// TODO Auto-generated method stub
		/**
		 * creating try block to check first name and last name is not blank
		 */
		try {
			if(firstName.length()==0 && lastName.length()==0) {
				throw new NameException("The first name and last name should not be blank");
			}
			else {
				System.out.println("The Full name is "+firstName+" "+lastName);
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /**
         * Entering the first name of an employee
         */
        System.out.println("Enter the first Name");
        String firstName=sc.next();
        /**
         * Entering the last name of an employee
         */
        System.out.println("Enter the last name");
        String lastName=sc.next();
        /**
         * verifying the first name and last name is not blank
         */
        verifyNameisFull(firstName,lastName);
        sc.close();
	}


}

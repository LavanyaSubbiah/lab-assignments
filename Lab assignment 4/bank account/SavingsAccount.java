/**
 * Author Lavanya Subbiah
 * date 29/10/2020
 * desc creating saving account class for smith with minimum balance 500
 */
package LabAssignment4;


public class SavingsAccount extends Account{
	/**
	 * declaring minimum balance is 500
	 */
           private final float minimumBalance=500;
           /**
            * parameterised constructor
            * @param balance
            * @param accHolder
            */
           public SavingsAccount(long accNum, double balance, Person accHolder) {
			
        	   super(accNum,balance,accHolder);
		}
		/**
            * overriding the withdraw method
            */
          // @override
           public  void withdraw(double amount) {
        	   double balAmount=getBalance()-amount;
        	   if(balAmount>=minimumBalance) {
        		   System.out.println("The withdraw amount is "+amount);
        		   System.out.println("The current balance after withdrawal from Smith's account is " + balAmount);
        	   }else {
        
        		   System.out.println("Withdraw is not possible ,you have reached the minimum balance");
        	   }
        	   
           }
}

/**
 * Author Lavanya Subbiah
 * date 29/10/2020
 * desc creating current account class for kathy account
 */
package LabAssignment4;

public class CurrentAccount extends Account{
	/**
	 * declaring overdraft limit is 1000
	 */
	private final float overDraftLimit=1000;
	/**
	 * parameterised constructor
	 * @param balance
	 * @param accHolder
	 */
    public CurrentAccount(long accNum,double balance,Person accHolder) {
    	super(balance,accHolder);
    }
    //@override
    /**
     * overridding the withdraw method
     */
    public void withdraw(double amount) {
    	if(amount<=overDraftLimit+getBalance())
    	{
    		double balAmount=getBalance()-amount+overDraftLimit;
    		System.out.println("The withdrawal amount is "+amount);
    		System.out.println("The current balance after withdrawal from Kathy's account is " + balAmount);
    		}
    	else {
    		System.out.println("withdrawal is not possible , your overdraftlimit is reached");
    	}
    	}

}

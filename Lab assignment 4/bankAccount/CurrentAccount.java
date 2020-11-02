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
    public CurrentAccount(double balance,Person accHolder) {
    	super(balance,accHolder);
    }
    //@override
    /**
     * overridding the withdraw method
     */
    public void withdraw(double amount) {
    	super.withdraw(amount);
    	double balAmount=getBalance()-amount+overDraftLimit;
    	if(balAmount+overDraftLimit<=0)
    	{
    		System.out.println("The withdrawal amount is "+amount);
    		}
    	else {
    		setBalance(balAmount);
    		System.out.println("withdrawal is not possible , your overdraftlimit is reached");
    	}
    	}

}

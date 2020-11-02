/**
 * author Lavanya Subbiah 
 * date 29/10/2020
 * desc account class contains account Number , balance and account holder
 */
package LabAssignment4;

public class Account {
	/**
	 * declaring the variables
	 */
	private long accNum;
	private double balance;
	private Person accHolder;
	
	/**
	 * parameterised constructor
	 * @param balance
	 * @param accHolder
	 */
	public Account(long accNum,double balance,Person accHolder) {
		this.balance=balance;
		this.accHolder=accHolder;
		this.accNum=accNum;
	}
	/**
	 * getters and setters
	 * @return
	 */
    public long getAccNum() {
	  return accNum;
	}
    public void setAccNum(long accNum) {
	this.accNum=accNum;
    }
    public double getBalance(){
    	return balance;
    }
    public void setBalance(double balance) {
    	this.balance=balance;
    }
    public Person getAccHolder() {
    	return accHolder;
    }
    public void setAccHolder(Person accHolder) {
    	this.accHolder=accHolder;
    }

    /**
     * creating a method ddeposit
     * @param amount
     */
	public void deposit(double amount) {
		balance=balance+amount;
		
	}
	/**
	 * creating a method withdraw
	 * @param amount
	 */
	public void withdraw(double amount) {
		balance=balance-amount;
		
	}
	

}

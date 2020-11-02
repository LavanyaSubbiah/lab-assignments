/**
 * author Lavanya Subbiah
 * date 29/10/2020
 * desc creating a main class
 */
package LabAssignment4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Person personSmithObj=new Person("smith",18);
        /**
         * creating account for smith with initial balance 2000.0
         */
        Account accSmithObj=new Account(2000.0,personSmithObj);
        Person personKathyObj=new Person("kathy",34);
        /**
         * creating account for kathy with initial balance 3000.0
         */
        Account accKathyObj=new Account(3000.0,personKathyObj);
        /**
         * deposit 2000 in smith account
         */
        accSmithObj.deposit(2000);
        /**
         * withdraw 2000 from kathy account
         */
        accKathyObj.withdraw(2000);
        /**
         * prints the balance amount in smith and kathy account
         */
		System.out.println("The balance amount in smith's bank account is "+accSmithObj.getBalance());
		System.out.println("The balance amount in kathy's bank account is "+accKathyObj.getBalance());
		/**
		 * creating smith saving account 
		 */
		SavingsAccount saveAccountObj=new SavingsAccount(accSmithObj.getAccNum(),accSmithObj.getBalance(),personSmithObj);
		saveAccountObj.withdraw(2000.0);
		/**
		 * creating current account for kathy
		 */
		CurrentAccount currentAccountObj=new CurrentAccount(accKathyObj.getAccNum(),accKathyObj.getBalance(),personKathyObj);
		currentAccountObj.withdraw(2000.0);
		
		sc.close();
	}

}

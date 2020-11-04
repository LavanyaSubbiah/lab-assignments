/**
 * Author Lavanya subbiah 
 * date 1/10/2020
 * desc creating main class to calculate salary above 3000
 */
package com.cg.eis.exception;
import java.util.*;
public class Main {

	private static void calculateSalary(float salary) {
		// TODO Auto-generated method stub
		try {
			if(salary<3000) {
				throw new SalaryException("Salary should be above 3000");
			}
			else {
				System.out.println("The salary of the employee is "+salary);
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee empexcep=new Employee();
		/**
		 * Entering the salary of an Employee
		 */
		System.out.println("Enter the salary");
		float salary=sc.nextFloat();
		empexcep.setSalary(salary);
		/**
		 * checking the salary is above 3000
		 */
		calculateSalary(empexcep.getSalary());
		sc.close();

	
	}


}

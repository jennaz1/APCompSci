/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

/*Create a new Employee.
     a. Name "Dwight Schrute" 
     b. ID is 1987
     c. Salary is $4416.66
4. Create a new Employee. 
     a. Name "Jim Halpert"
     b. ID is 2474
     c. Salary is $4416.66
5. Create a new Employee. 
     a. Name "Pam Beesly"
     b. ID is 2011
     c. Salary is $2250
6. Create a new Employee of your choice.
7. Give raises to all employees cause it was a great year this year. You choose who gets what (You're the manager)
8. Print all Employees and their salaries and annual salaries.
*/

class starter {
	public static void main(String args[]) {
		
		
		Employee michael = new Employee();
		System.out.println(michael.getFirstName()+" annual salary: "+michael.getAnnualSalary());
		michael.employeeToString();
		Employee dwight = new Employee(1987,"Dwight","Shrute",4416.66);
		Employee jim = new Employee(2474,"Jim","Halpert",4416.66);
		Employee pam= new Employee(2011,"Pam","Beesly",2250);
		Employee bob=new Employee(1111,"Bob","Builder",1);
		jim.raiseSalary(3);
		dwight.raiseSalary(5);
		pam.raiseSalary(4);
		bob.raiseSalary(99);
		System.out.println(jim.getFirstName()+" annual salary: "+jim.getAnnualSalary());
		jim.employeeToString();
		System.out.println(dwight.getFirstName()+" annual salary: "+dwight.getAnnualSalary());
		dwight.employeeToString();
		System.out.println(pam.getFirstName()+" annual salary: "+pam.getAnnualSalary());
		pam.employeeToString();
		System.out.println(bob.getFirstName()+" annual salary: "+bob.getAnnualSalary());
		bob.employeeToString();
		
	}
}

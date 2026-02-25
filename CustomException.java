package fidelity.programs;

import java.util.Scanner;

class SalaryException extends Exception {
	public SalaryException(String msg) {
		super(msg);
	}
}

public class CustomException {
	public static void salaryCheck(int salary) throws SalaryException{ 
		if(salary < 2100) {
			throw new SalaryException("You need to work hard");
		}
		else if (salary >= 2100 && salary <= 5000) {
			throw new SalaryException("You salary is somehow good");
		}
		else if (salary >= 5100 && salary <= 9000) {
			throw new SalaryException("Salary is very good");
		}
		else {
			System.out.println("Salary is excellent");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		int salary = sc.nextInt();
		
		try {
			salaryCheck(salary);
		}
		catch (SalaryException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}

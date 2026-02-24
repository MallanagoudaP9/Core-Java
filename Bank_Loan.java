
/*
Bank Loan Approval Logic
Write a method:  String loanDecision(int age, int salary, int creditScore)

Rules using nested if–else:
 If age ≥ 21
    If salary ≥ 25000
         If creditScore ≥ 700  print Approved
         Else print Rejected – Low credit score
    Else print Rejected – Low salary
 Else print Rejected – Under age
*/
package fidelity.programs;

public class Loan_Approval {
	public static void loanDecision(int age, int salary, int creditScore) {
		if(age >= 21) {
			if(salary >= 25000) {
				if(creditScore >= 700) {
					System.out.println("Approved");
				}
				else {
					System.out.println("Rejected - Low credit score");
				}
			}
			else {
				System.out.println("Rejected - Low salary");
			}
		}
		else {
			System.out.println("Rejected - Under age");
			}
		}
	public static void main(String[] args) {
		loanDecision(23, 45000, 800);
	}

}

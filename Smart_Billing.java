/*
Smart Billing Slab (no nested if allowed)
Write a method:   double calculateBill(double amount, boolean isFirstOrder)

Rules (use only if – else, no nested if):
- If amount < 500 give no discount
- If amount ≥ 500 and < 1500  give 5% discount
- If amount ≥ 1500 give 10% discount
- If it is first order, give extra 2% discount on the final amount

You must combine conditions correctly without using nested if.
/*

  package fidelity.programs;

public class Smart_Billing {

	public static double calculateBill(double amount, boolean isFirstOrder) {
		double finalAmount;
		
		if(amount < 500) {
			finalAmount = amount;
		}
		else if(amount >= 500 && amount < 1500) {
			finalAmount = amount - (amount * 0.05);
		}
		else {
			finalAmount = amount - (amount * 0.10);
		}
		
		if(isFirstOrder) {
			finalAmount = finalAmount - (finalAmount *0.02);
		}
		return finalAmount;
	}
	
	public static void main(String[] args) {
		System.out.println(calculateBill(700,true));

	}

}

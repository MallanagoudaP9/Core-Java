package fidelity.programs;

public class Product_Discount {

	public static double getFinalAmount(double amount, boolean isMember) {
		if(amount >= 1000) {
			if(isMember) {
				return amount - (amount * 0.20);
			}
			else {
				return amount - (amount * 0.10);
			}
		}
		else {
			return amount;
		}
	}
	
public static void main(String[] args) {
  System.out.println(getFinalAmount(1500, true));

}
}

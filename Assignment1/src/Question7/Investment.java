package Question7;

import java.util.Scanner;

public class Investment {
	static double finalSalary = 0.0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter initial Amount ");
		double initialAmount = sc.nextDouble();
		Investment i = new Investment();
		i.returnPlus(initialAmount);

	}

	public void returnPlus(double initialAmount) {
		for (int i = 1; i <= 20; i++) {
			if (i == 1) {
				initialAmount = initialAmount + initialAmount * 0.05;
			} else {
				initialAmount = initialAmount + initialAmount * 0.02;
			}
		}

		System.out.println("After 20 years the total amount is " + initialAmount);
	}
}

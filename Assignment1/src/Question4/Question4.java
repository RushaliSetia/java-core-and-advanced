package Question4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int accountNo, i, sum = 0;
		System.out.println("enter the account number");
		Scanner s = new Scanner(System.in);
		accountNo = s.nextInt();
		int temp = accountNo;
		int arr[] = new int[9];

		for (i = 0; i <= 8; i++) {
			arr[i] = temp % 10;
			temp = temp / 10;
		}

		for (i = 0; i <= 8; i++) {
			if (i == 6)
				continue;

			else
				sum = sum + arr[i];

		}

		if (sum % 10 == arr[6])
			System.out.println("okay");
		else
			System.out.println("not okay");

	}

}
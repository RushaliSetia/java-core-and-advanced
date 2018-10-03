package Question6;

import java.util.Scanner;

public class ClientCode {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ClientCode c = new ClientCode();
		c.performActions();
	}

	public void performActions() {
		UserString us = new UserString();
		System.out.println("Choose options from below");
		System.out.println("0.Exit\n 1.Revese String\n 2.Copy String\n 3.Concate String\n 4.Count\n");

		while (true) {
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				us.reverseString();
				break;
			case 2:
				us.copyString();
				break;
			case 3:
				us.concateString();
				break;
			case 4:
				us.count();
				break;
			default:
				System.out.println("Sorry wrong input");
			}
		}
	}
}

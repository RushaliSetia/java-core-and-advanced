package Question8;

import java.util.Scanner;

public class UseChildren {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	   UseChildren uc=new UseChildren();
		uc.addFunnctionality();	   
  }

	public void addFunnctionality() {
		System.out.println("Enter name for male child");
		String nameMale = sc.nextLine();
		
		System.out.println("Enter name for female child");
		String nameFemale = sc.nextLine();

		Male m = new Male(nameMale);
		Female f = new Female(nameFemale);
		identify(m);
		identify(f);
	}

	public void identify(Child c) {
		if (c instanceof Male) {
			Male m = (Male) c;
			m.display();
		} else {
			Female f = (Female) c;
			f.display();
		}
	}
}

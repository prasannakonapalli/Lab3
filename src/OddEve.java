import java.util.Scanner;

public class OddEve {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String con = "";
		int num = 0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter user name :");

		// scr.nextLine();
		String name = scr.nextLine();

		try {
			do {

				System.out.println("Enter a number between 1 and 100: ");

				num = scr.nextInt();

				if (num >= 1 && num < 100)

				{
					if (num % 2 != 0) {
						System.out.println(num + " and Odd");
					} else if (num % 2 == 0 && (num >= 2 && num <= 25)) {
						System.out.println("Even and less than 25");
					} else if (num % 2 == 0 && (num >= 26 && num <= 60)) {
						System.out.println("Even");
					} else if (num % 2 == 0 && num > 60) {
						System.out.println(num + " and Even");
					} else if (num % 2 != 0 && num > 60) {
						System.out.println(num + " Odd and over 60");
					}

				} else {
					throw new Exception();
				}

				System.out.println("Would you Like to Continue (y/n)?");
				con = scr.next();

				if (con.equalsIgnoreCase("n")) {
					break;
				}

			} while (con.equalsIgnoreCase("y") || con.equalsIgnoreCase("n"));
		} catch (Exception e) {
			System.out.println("******************************************");
			System.out.println("Enter a positive integers between 1 and 100");
		}
		scr.close();
		System.out.println("Bye!");

	}


}

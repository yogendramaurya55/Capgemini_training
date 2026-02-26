package main;

import java.util.Scanner;

import func_classes.GameService;
import func_classes.User;

public class DigitalcomProcess {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		User currUser = null;
		boolean isLoggedIn = false;

		while (true) {

			System.out.println("1 : Register the user");
			System.out.println("2 : Login");
			System.out.println("3 : View all games");
			System.out.println("4 : Search by author name");
			System.out.println("5 : Exit");

			int input = sc.nextInt();

			switch (input) {

			case 1: {

				System.out.println("Enter the userid");
				String userid = sc.next();

				System.out.println("Enter the password");
				String password = sc.next();

				User.addUser(userid, password);

				System.out.println("User registered successfully");
				break;
			}

			case 2: {

				System.out.println("Enter the userid");
				String userid = sc.next();

				System.out.println("Enter the password");
				String password = sc.next();

				currUser = new User(userid, password);

				if (currUser.IsAuthenticated(userid, password)) {
					isLoggedIn = true;
					System.out.println("Login successful");
				} else {
					isLoggedIn = false;
					System.out.println("Invalid user");
				}

				break;
			}

			case 3: {

				if (isLoggedIn) {

					GameService gs = new GameService();
					System.out.println(gs.viewAll());

				} else {

					System.out.println("Unauthorized access");
				}

				break;
			}

			case 4: {

				if (isLoggedIn) {

					System.out.println("Enter the author");
					String author = sc.next();

					GameService gs = new GameService();
					System.out.println(gs.authorSearch(author));

				} else {

					System.out.println("Unauthorized access");
				}

				break;
			}

			case 5: {
				System.out.println("Exited");
				sc.close();
				System.exit(0);
				break;
			}

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
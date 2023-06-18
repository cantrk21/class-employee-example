package classornegi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("*********welcome to the application**********");
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter a no : ");
		int no = scanner.nextInt();
		scanner.nextLine();

		System.out.println("enter a name : ");
		String name = scanner.nextLine();

		System.out.println("enter a surname : ");
		String surname = scanner.nextLine();

		System.out.println("enter a experience : ");
		int experience = scanner.nextInt();
		scanner.nextLine();

		System.out.println("enter a wage : ");
		double wage = scanner.nextDouble();
		scanner.nextLine();

		Calisan calisan = new Calisan(no, name, surname, experience, wage);

		String islemler = "1-Show employee information\n" + "2-Make Increase\n" + "3-format\n"+"4-exit";
		System.out.println("********************************");
		System.out.println(islemler);
		

		System.out.println("make a choice : ");
		int choice = scanner.nextInt();
		do {

			scanner.nextLine();

			switch (choice) {
			case 1:
				calisan.showEmployeeInformation();
				break;
			case 2:
				System.out.println("enter the increase value :");
				int zamDegeri = scanner.nextInt();
				calisan.makeIncrease(zamDegeri);
				scanner.nextLine();
				break;
			case 3:
				System.out.println(" enter the name of the person who will format: ");
				String kisi = scanner.nextLine();
				System.out.println(" write down the operating system :");
				String isletimSistemi = scanner.nextLine();
				calisan.format(isletimSistemi, kisi);
				break;
			case 4:
				System.out.println("you out of the program");
			default:
				System.out.println("please make a selection at the specified interval !!!");
				break;
			}
		} while (choice != 4);

	}
}

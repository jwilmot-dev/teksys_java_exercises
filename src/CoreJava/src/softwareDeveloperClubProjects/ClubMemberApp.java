package softwareDeveloperClubProjects;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClubMemberApp {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		SoftwareDeveloperClub sdc = new SoftwareDeveloperClub();
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		while(flag ==true) {
			menu();
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				sdc.displayMemberInfo();
				break;
			case 2:
				scan.nextLine();
				System.out.println("Enter name of member to remove: ");
				String temp = scan.nextLine();
				sdc.removeMember(temp);
				break;
			case 3:
				scan.nextLine();
				System.out.println("Add name of new member: ");
				String temp_name = scan.nextLine();
				System.out.println("Add city of new member: ");
				String temp_city = scan.nextLine();
				System.out.println("Add state of new member: ");
				String temp_state = scan.nextLine();
				System.out.println("Add favorite programming language of new member: ");
				String temp_language = scan.nextLine();
				sdc.addMember(temp_name, temp_city, temp_state, temp_language);
				break;
			case 4:
				flag = false;
			}
		}
	}
	public static void menu() {
		System.out.println();
		System.out.println("Select form the following menu:");
		System.out.println("1: Display Members");
		System.out.println("2: Remove Member");
		System.out.println("3: Add Member");
		System.out.println("4: Quit");
	}

}

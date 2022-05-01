package softwareDeveloperClubProjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SoftwareDeveloperClub{
	
	List<Object> objList = new ArrayList<Object>();
	
	SoftwareDeveloperClub() throws FileNotFoundException{
		
		File file = new File("members.txt");
		Scanner input = new Scanner(file);
		input.nextLine();
		while(input.hasNextLine()) {
			String row = input.nextLine();
			String[] arr = row.split("\\*\\*");
			ClubMember cm = new ClubMember();
			cm.setName(arr[0]);
			cm.setCity(arr[1]);
			cm.setState(arr[2]);
			cm.setLanguage(arr[3]);
			objList.add(cm);
		}	
	}
	
	public void displayMemberInfo() {
		for(Object o : objList) {
			((ClubMember) o).displayMemberInfo();		
		}
	}
	
	public void removeMember(String r_name) {
		int index = 0;
		for(Object o: objList) {
			if (((ClubMember) o).getName().equals(r_name)) {
				index = objList.indexOf(o);
			}
		}
		objList.remove(index);
	}
	public void addMember(String name, String city, String state, String language) {
		ClubMember temp = new ClubMember();
		temp.setName(name);
		temp.setCity(city);
		temp.setState(state);
		temp.setLanguage(language);
		objList.add(temp);
	}

}

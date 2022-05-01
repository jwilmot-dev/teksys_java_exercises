package softwareDeveloperClubProjects;

public class ClubMember{
	
	String name;
	String city;
	String state;
	String language;
	
	ClubMember(){}
	ClubMember(String name, String city, String state, String language){
		this.name = name;
		this.city = city;
		this.state = state;
		this.language = language;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public void displayMemberInfo() {
		System.out.println("Member Name: " + name);
		System.out.println("Location: " + city + ", " + state);
		System.out.println("Favorite Language: " + language);
		System.out.println();
	}

}

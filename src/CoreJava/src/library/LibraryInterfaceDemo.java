package library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test Case #1
		KidUser ku1 = new KidUser();
		ku1.setAge(10);
		
		KidUser ku2 = new KidUser();
		ku2.setAge(18);
		
		ku1.registerAccount();
		ku2.registerAccount();
		
		ku1.setBookType("Kids");
		ku2.setBookType("Fiction");
		
		ku1.requestBook();
		ku2.requestBook();
		
		
		
		//Test Case #2
		AdultUser au1 = new AdultUser();
		au1.setAge(5);
		
		AdultUser au2 = new AdultUser();
		au2.setAge(23);
		
		au1.registerAccount();
		au2.registerAccount();
		
		au1.setBookType("Kids");
		au2.setBookType("Fiction");
		
		au1.requestBook();
		au2.requestBook();
		

	}

}

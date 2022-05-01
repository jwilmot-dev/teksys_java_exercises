package managerAndTrainee;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr1 = new Manager(126534, "Peter", "Chennai India", "237844", 65000);
		mgr1.calculateSalary();
		
		Trainee trn1 = new Trainee(29846, "Jack", "Mumbai India", "442085", 45000);
		trn1.calculateSalary();
		
		mgr1.calculateTransportAllowance();
		trn1.calculateTransportAllowance();
		
	}

}

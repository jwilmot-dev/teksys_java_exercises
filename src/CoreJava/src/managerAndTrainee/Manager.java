package managerAndTrainee;

public class Manager extends Employee{
	
	Manager(){}
	Manager(long id, String name, String address, String phone, double salary){
		super(id, name, address, phone);
		this.basicSalary = salary;
	}
	@Override
	void calculateTransportAllowance(){
		double transportAllowance = basicSalary*15/100;
		System.out.print("Transport Allowance: $"); 
		System.out.printf("%,.2f", transportAllowance);
		System.out.println();
	}
}

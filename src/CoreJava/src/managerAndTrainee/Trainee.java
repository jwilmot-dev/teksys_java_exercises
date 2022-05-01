package managerAndTrainee;

public class Trainee extends Employee{
	
	Trainee(){}
	Trainee(long id, String name, String address, String phone, double salary){
		super(id, name, address, phone);
		this.basicSalary = salary;
		
	}

}

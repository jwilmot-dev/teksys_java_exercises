package managerAndTrainee;

public class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	String employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	Employee(){}
	Employee(long id, String name, String address, String phone){
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	void calculateSalary(){
		
		double salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*hra/100);
		System.out.print("$");
		System.out.printf("%,.2f", salary);
		System.out.println();
	}
	void calculateTransportAllowance(){
		double transportAllowance = basicSalary*10/100;
		System.out.print("Transport Allowance: $"); 
		System.out.printf("%,.2f", transportAllowance);
		System.out.println();
	}

}

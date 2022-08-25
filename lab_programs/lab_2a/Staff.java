package lab_2_program;

interface Staff_Op extends Person {
	
	void calculate_salary();
}

public class Staff implements Staff_Op{
	String company,empid,designation;
	
	Staff(){
		company = "Benz";
		empid = "E_001";
		designation = "Manager";
	}

	@Override
	public void calculate_salary() {
		// TODO Auto-generated method stub
		System.out.println("Salary is 2000 Rs");
	}
}

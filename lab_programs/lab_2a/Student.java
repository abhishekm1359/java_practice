package lab_2_program;

interface Student_Op {
	void calculate_fees();
}

public class Student implements Student_Op {

	String usn , branch;
	
	Student(){
		usn = "1rv21mc001";
		branch = "MCA";
	}

	@Override
	public void calculate_fees() {
		System.out.println("Fees is 50000");
		
	}
}

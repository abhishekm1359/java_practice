package lab_2_program;

public class Test implements Student_Op , Staff_Op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1  = new Test();
		t1.calculate_fees();
		t1.calculate_salary();
	}

	@Override
	public void calculate_salary() {
		// TODO Auto-generated method stub
		System.out.println("Employee Salary");
	}

	@Override
	public void calculate_fees() {
		// TODO Auto-generated method stub
		System.out.println("Student Fees");
	}

}

package lab_practice;
import java.util.*;
public class Lab1_this {
	
	String name,address,phone_no,email_id,branch;
	double tfees,ad_fees,tution_fees,b_fees,tot_fees, ttt_fees;
	
	public void student_details(String name2 , String add, String phone_no2, String email_id2, String branch2) {
		this.name = name2;
		this.address = add;
		this.phone_no = phone_no2;
		this.email_id = email_id2;
		this.branch = branch2;
	}
	
	public double fees(double tfees2, double ad_fees2, double tution_fees2, double b_fees2 , String branch2 ) {
		this.tfees = tfees2;
		this.ad_fees = ad_fees2;
		this.tution_fees = tution_fees2;
		this.b_fees = b_fees2;
		tot_fees = tfees+ad_fees+tution_fees;
		if(branch.equalsIgnoreCase("BE")) {
			System.out.println("Input taken");
			ttt_fees = tot_fees+b_fees;
		}
		return ttt_fees;
	}
	
	public void display() {
		System.out.println("Name is : "+name);
		System.out.println("Branch is : "+branch);
		System.out.println("Basic Fees is : "+tot_fees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1_this lab1 = new Lab1_this();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Details\n\n");
		System.out.println("Enter Student Name : ");
		String name = s.next();
		System.out.println("Enter Student Address : ");
		String address = s.next();
		System.out.println("Enter Student Phone Number :");
		String phone_no = s.next();
		System.out.println("Enter Student Email ID :");
		String email_id = s.next();
		System.out.println("Enter Student Branch :");
		String branch = s.next();
		
		lab1.student_details(name, address, phone_no, email_id, branch);
//		Taking fees details
		
		System.out.println("\nEnter Fees Details\n\n");
		System.out.println("Enter Standard Fees :");
		double tfees = s.nextDouble();
		System.out.println("Enter Additional Fees :");
		double adfees = s.nextDouble();
		System.out.println("Enter Tution Fees :");
		double tution_fees = s.nextDouble();
		System.out.println("Enter Branch Fees :");
		double b_fees = s.nextDouble();
		
		double tfee = lab1.fees(tfees, adfees, tution_fees, b_fees, branch);
		
		lab1.display();
		System.out.println("Total Fees is : "+tfee);
		
	}

}

package lab_practice;
import java.util.*;
public class Lab1b_overloading {
	
	String name,address, usn ,emailid, branch;
	double tution_fees, branch_fees , ad_fees , tfees ,ttfees, tttfees;
	static String college , c_address, c_phoneno;
	
	static {
		college = "RVCE";
		c_address = "Kengeri Bangalore";
		c_phoneno = "7898458651";
	}
	
	Lab1b_overloading(String name2 , String address2, String usn2, String emailid2 , String branch2){
		this.name = name2;
		this.address = address2;
		this.usn = usn2;
		this.emailid = emailid2;
		this.branch = branch2;
	}
	
	Lab1b_overloading(String name2 , String address2, String usn2 , String branch2){
		this.name = name2;
		this.address = address2;
		this.usn = usn2;
		this.emailid = ""+name+"@rvce.edu.in";
		this.branch = branch2;
	}
	
	public double fee(String branch2) {
		this.tution_fees = 25000;
		this.branch_fees = 25000;
		this.ad_fees = 10000;
		tfees = tution_fees + ad_fees;
		if(branch.equalsIgnoreCase("BE")) {
			tfees =tfees+ branch_fees;
		}else {
			tfees =tfees+ branch_fees-250;
		}
		return tfees;
		
	}
	
	public void display() {
		System.out.println("Student Name is : "+name);
		System.out.println("Student USN is : "+usn);
		System.out.println("Student Basic Fees is : "+tfees);
		System.out.println("Student Branch is : "+branch);
		System.out.println("Student Email Id is :"+emailid);
	}
	
	public void display(String branch) {
		double feecal = this.fee(branch);
		System.out.println("Student branch is "+branch+" and its fees is "+feecal);
	}
	
	public void display(int no_of_fields) {
		if(no_of_fields==3) {
			System.out.println("Student Name is :"+name);
			System.out.println("Student USN is :"+usn);
			System.out.println("Student address is :"+address);
		}else {
			System.out.println("Student Name is : "+name);
			System.out.println("Student USN is : "+usn);
			System.out.println("Student Basic Fees is : "+tfees);
			System.out.println("Student Branch is : "+branch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1b_overloading lab1b;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Student Details");
			System.out.println("Enter Student Name : ");
			String name = sc.next();
			System.out.println("Enter Student USN : ");
			String usn = sc.next();
			System.out.println("Enter Student Address : ");
			String address = sc.next();
			System.out.println("Enter Student Branch : ");
			String branch = sc.next();
			System.out.println("Would you like to enter email_id (1/2): ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter Student Email Id: ");
				String emailid = sc.next();
				lab1b = new Lab1b_overloading(name , address , usn , emailid , branch);
			}else {
				lab1b = new Lab1b_overloading(name , address , usn , branch);
			}
			
			System.out.println("Select any Display Option");
			System.out.println("1.Dispaly all details\n2.Display Branch Details\n3.Display Minimum Details");
			int choice1 = sc.nextInt();
			
			if(choice1==1) {
				lab1b.display();			
			}else if (choice1 == 2){
				lab1b.display(branch);
			}else {
				System.out.println("Enter number of fields from 3 to 5");
				int num = sc.nextInt();
				lab1b.display(num);
			}
			
			System.out.println("Enter your choice\n1.Continue\n2.Exit");
			int choice2 = sc.nextInt();
			if(choice2==2) {
				break;
			}
		}
		
		sc.close();
	}

}

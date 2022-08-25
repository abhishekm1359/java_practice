package lab_3_program;
import java.sql.*;
import java.util.*;

public class lab3a {

	 Connection con;
	 Statement st;
	
	public void getConnection() throws Exception{
		try {
			System.out.println("Database");
			String url = "jdbc:mysql://127.0.0.1:3306/newdb";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url , "root" , "12345678");
			System.out.println("Database connected");
			st = con.createStatement();

		}
		catch (Exception e){
			System.out.println("Database tutorial");
			System.out.println(e);
		}
	}
	
	public void insert(String USN , String Name , String DOB , String Address) throws SQLException {
		String query = "create table student(usn varchar(20) , name varchar(20) , dob varchar(20) , address varchar(30)) ";
		st.executeUpdate(query);
		String query1 = "insert into student values ('"+USN+"','"+Name+"','"+DOB+"','"+Address+"')";
		int q=st.executeUpdate(query1);
		System.out.println("Number of rows affected is "+q);
	}
	
	public  void update(String USN , String newadd) throws SQLException {
		String query = "update student SET address = '"+newadd+"' where usn='"+USN+"'";
		int q=st.executeUpdate(query);
		System.out.println("Number of rows updated is "+q);
	}
	
	public void display() throws Exception{
		String query = "select * from student";
		ResultSet R = st.executeQuery(query);
		while(R.next()) {
			System.out.println(R.getString(1));
			System.out.println(R.getString(2));
			System.out.println(R.getString(3));
			System.out.println(R.getString(4));
		
		}
	}
	
	public  void delete() throws SQLException {
		String query = "drop table student";
		int q=st.executeUpdate(query);
		System.out.println("Number of rows updated is "+q);
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		lab3a lab = new lab3a();
		lab.getConnection();
		
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice\n1.Insert\n2.Update\n3.Display\n4.Delete");
		int ch = sc.nextInt();
		
		if(ch==1) {
			String USN,Name,DOB,Address;
			System.out.println("Enter USN : ");
			USN = sc.next();
			System.out.println("Enter Name : ");
			Name = sc.next();
			System.out.println("Enter DOB : ");
			DOB = sc.next();
			System.out.println("Enter Address : ");
			Address = sc.next();
			lab.insert(USN,Name,DOB,Address);
		}
		if(ch==2) {
			String newadd,USN;
			System.out.println("Update Address");
			System.out.println("Enter new address : ");
			newadd = sc.next();
			System.out.println("Enter new USN : ");
			USN = sc.next();
			lab.update(USN, newadd);
		}
		if(ch==3) {
			lab.display();
		}
		if(ch==4) {
			lab.delete();
		}
		
	}
		
		
	}

}

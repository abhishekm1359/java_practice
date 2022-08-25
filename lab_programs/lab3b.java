package lab_3_program;
import java.sql.*;
import java.util.*;

public class lab3b {

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
	
	public void create_table (String table_name) {
		try {
			String query = "create table student(usn varchar(20) , name varchar(20) , dob varchar(20) , address varchar(30)) ";
			int i = st.executeUpdate(query);
			System.out.println(i+"Table Created");
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void insert(String USN , String Name , String DOB , String Address) throws SQLException {
		try {	
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setString(1, USN);
			ps.setString(2, Name);
			ps.setString(3, DOB);
			ps.setString(4, Address);
			int q=ps.executeUpdate();
			System.out.println("Number of rows affected is "+q);
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public  void update(String USN , String newadd) throws SQLException {
		PreparedStatement ps = con.prepareStatement("update student SET address = ? where usn=?");
		ps.setString(1, newadd);
		ps.setString(2, USN);
		int q=ps.executeUpdate();
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
	
	public  void delete(String USN) throws SQLException {
		PreparedStatement ps = con.prepareStatement("delete from student where usn=?");
		ps.setString(1, USN);
		int q=ps.executeUpdate();
		System.out.println("Number of rows updated is "+q);
	}
	
	public  void drop() throws SQLException {
		String query = "drop table student";
		int q=st.executeUpdate(query);
		System.out.println("Number of rows updated is "+q);
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		lab3b lab = new lab3b();
		lab.getConnection();
		
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice\n1.Create Table\n2.Insert\n3.Update\n4.Display\n5.Delete\n6.Drop Table");
		int ch = sc.nextInt();
		
		if(ch==1) {
			String table_name;
			System.out.println("Enter Table name to create :");
			table_name = sc.next();
			lab.create_table(table_name);
		}
		
		if(ch==2) {
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
		if(ch==3) {
			String newadd,USN;
			System.out.println("Update Address");
			System.out.println("Enter new address : ");
			newadd = sc.next();
			System.out.println("Enter new USN : ");
			USN = sc.next();
			lab.update(USN, newadd);
		}
		if(ch==4) {
			lab.display();
		}
		if(ch==5) {
			String USN;
			System.out.println("Enter USN to delete :");
			USN=sc.next();
			lab.delete(USN);
		}
		if(ch==6) {
			lab.drop();
		}
		
	}
		
		
	}

}

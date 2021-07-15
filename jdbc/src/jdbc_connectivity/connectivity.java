package jdbc_connectivity;
 import java.util.*;
 import java.sql.*;
public class connectivity {

	public static void main(String[] args) {
		try {
		Scanner s1=new Scanner(System.in);
		Scanner s2 =new Scanner(System.in);
		String name,role ,dept;
		int id,salary,pf,tax;
		System.out.println("enter the name");
		 name=s1.nextLine();
		 System.out.println("enter the role number");
		  role=s1.nextLine();
		  System.out.println("enter the dept");
		   dept=s1.nextLine();
		   System.out.println("enter the id");
		     id=s2.nextInt();
		     System.out.println("enter the salary");
		       salary=s2.nextInt();
		       System.out.println("enter the pf");
		       pf=s2.nextInt();
		       System.out.println("enter the tax amount");
		        tax=s2.nextInt();
		         Class.forName("com.mysql.jdbc.Driver");
		 Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/salary", "root", "");
 PreparedStatement  ps=con.prepareStatement("insert into salary values(?,?,?,?,?,?,?) ");
 			ps.setString(1,name);
           ps.setString(2, role);
           ps.setString(3,dept);
           ps.setInt(4,id);
           ps.setInt(5, salary);
           ps.setInt(6, pf);
           ps.setInt(7, tax);
           ps.executeUpdate();
           System.out.println("data saved.......");
		}
		catch(Exception e)
		{
			System.out.println("data  not saved"+e);
			System.out.println("rest of code");
			
		}

	}

}

package time_sheet;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class timesheet {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			
		
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter name");
		   String name=sc.nextLine();
		 System.out.println("enter role");
		   String role=sc.nextLine();
		 System.out.println("company name");
		  System.out.println("address");
	  		String addr=sc.nextLine();
	  	 
		   String company=sc.nextLine();
		 System.out.println("Anaual CTC");
		     int ctc=sc.nextInt();
		 System.out.println("Take Home");
		     int thome=sc.nextInt();
		  System.out.println("year increment");
		      int increment=sc.nextInt();
		      System.out.println("enter pincode");
	  			int pincode=sc.nextInt(); 
		 
	
		
		  	
		  			
		  		 Class.forName("com.mysql.jdbc.Driver");
  	 java.sql.Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/TCS","root"," ");
		  	 		PreparedStatement ps =con.prepareStatement("insert into timesheet values(?.?,?,?,?,?,?,?)");
		  	 	ps.setString(1,name);
		  	 	ps.setString(2,role);
		  	 	ps.setString(3,company);
		  	 	ps.setString(4,addr);
			 	ps.setInt(5,ctc);
			 	ps.setInt(6,thome);
			 	ps.setInt(7,increment);
			 
			 	ps.setInt(8,pincode);
			 	
			 	ps.executeUpdate();
			 	System.out.println("data saved.....");
		  		 		
		}
		catch(Exception e)
		{
			System.out.println("not  saved...");
		}
		  		
		 

	}

}
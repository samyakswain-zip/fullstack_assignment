import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			try
			{
				//load driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//creating connection
				String url="jdbc:mysql://localhost:3306/yash";
				String user="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,user,pass);
				
				//creating query
				String q="insert into employee(empID,name) values(?,?)";
				PreparedStatement ps=con.prepareStatement(q); 
				
				//using buffer reader to insert into the table via user input
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter EmpID");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter Name");
				String name=br.readLine();
				
							
				//setting values
				ps.setInt(1, id);
				ps.setString(2,name);
				ps.executeUpdate();
				System.out.println("Inserted Successfully");
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}

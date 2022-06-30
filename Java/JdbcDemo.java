import java.sql.*;

class FirstJdbcDemo
{
	public static void main(String[] args)
	{
		try
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create connection
			String url="jdbc:mysql://localhost:3306/yash";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(user);
			if(con!=null)
			{
				System.out.println("Connection is successful");
			}
			else
			{
				System.out.println("Connection is not successful");
			}
			//step 3 : create query
			String q="select * from employee;";
			Statement st=con.createStatement();
			ResultSet set=st.executeQuery(q);
			//step 4 process the data
			while(set.next())
			{
				int id=set.getInt("empID"); //(1)
				String name=set.getString("name"); //(2)
				System.out.println("id:"+id);
				System.out.println("name:"+name);
			}
			
			//step 5 : close the connection
			
			con.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
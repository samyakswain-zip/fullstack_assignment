import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/yash";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			
			PreparedStatement ps=con.prepareStatement("insert into ImageStore(Name,Image) values(?,?)");
			ps.setString(1, "river");
			
			InputStream in = new FileInputStream("D:\\river.jpg");
			
			ps.setBlob(2,in);
			ps.executeUpdate();
			
			System.out.println("Image inserted......");
			con.close(); 
		}			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

	}

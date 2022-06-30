import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 

public class TextStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/yash";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			
			PreparedStatement ps=con.prepareStatement("insert into TextStore(Name,Article) values(?,?)");
			ps.setString(1, "Samyak");
			
			
			FileReader in = new FileReader("D:\\MyArticle.txt");
			
			ps.setClob(2,in);
			ps.executeUpdate();
			
			System.out.println("Text inserted......");
			con.close(); 
		}			
			catch(Exception e)
			{
				e.printStackTrace();
			}			
		}

	}



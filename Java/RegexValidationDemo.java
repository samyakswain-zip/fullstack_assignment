import java.util.*;
import java.util.regex.Pattern;

public class RegexValidationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the phone number");
		String str = sc.nextLine();
		
		boolean b=Pattern.matches("\\d(10)$", str);
		
		if(b==true)
		{
			System.out.println("Valid Number");
		}
		else
		{
			System.out.println("Invalid Number");
		}
		
		//Email
		
		System.out.println("Enter the email:");
		String email=sc.nextLine();
		
        boolean b1=Pattern.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", email);
		
		if(b1==true)
		{
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Invalid Email");
		}
		
		//URL
		
		System.out.println("Enter the url: ");
		String url=sc.nextLine();
		
        boolean b2=Pattern.matches("((http|https)://)(www.)?"
        		+ "[a-zA-z0-9@:%._\\+~#?&//=]"
        		+ "{2,256}\\.[a-z]"
        		+ "{2,6}\\b([-a-zA=z0-9@:%"
        		+ "._\\+~#?&//=]*", url);
		
		if(b2==true)
		{
			System.out.println("Valid Url");
		}
		else
		{
			System.out.println("Invalid Url");
		}

	}

}

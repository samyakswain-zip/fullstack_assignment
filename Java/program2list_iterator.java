import java.util.ArrayList;
import java.util.ListIterator;
public class program2list_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	    
	    ArrayList<String> al = new ArrayList<>();
	    al.add("Samyak");
	    al.add("Swain");
	    al.add("Yash Technologies");
	    
	    ListIterator li=al.listIterator();
	    li.next();
	    li.next();
	    while(li.hasPrevious())
	    {
	    	System.out.println(li.previous());
	    }
	    li.set("Technologies");
	    {
	    	System.out.println(al);
	    }
	    

	}

}

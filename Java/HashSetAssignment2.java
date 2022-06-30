import java.util.HashSet;
import java.util.Iterator;

public class HashSetAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Samyak");
		set.add("Arjun");
		set.add("Prince");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}

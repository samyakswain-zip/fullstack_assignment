import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<>();
		
		map.put("Samyak", "Swain");
		map.put("Prince", "Yadav");
		map.put("Micheal", "Jordan");
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> me =itr.next();
			
			if(me.getKey().equals("Prince"));
			System.out.println("Key Prince Exists");
			break;
		}
		
	}
	

	set = map.entrySet();
	itr = set.iterator();
	
	while(itr.hasNext()) {
		Map.Entry<String, String> me =itr.next();
		
		if(me.getKey().equals("Samyak"));
		System.out.println("Key Samyak Exists");
		break;
	}
	
}
	

set = map.entrySet();
itr = set.iterator();

while(itr.hasNext()) {
	Map.Entry<String, String> me =itr.next();
	
	if(me.getKey().equals("Samyak"));
	System.out.println("Key Samyak Exists");
	break;
}

}


}

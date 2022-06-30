import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map=new HashMap<>();
		map.put(11, "Yash");
		map.put(12, "Technologies");
		map.put(20, "Samyak");
		
		for(Map.Entry m:map.entrySet())//entrySet returns Set containing all keys and values
		    System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());
		
//		Set s=map.entrySet();//Convert to Set t transverse
//		Iterator i=s.iterator();
//		while(i.hasNext())
//		{
//			Map.Entry entry=(Map.Entry)i.next();//value separation
//			System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
//		}
		

	}

}

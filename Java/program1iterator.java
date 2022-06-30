import java.util.ArrayList;
import java.util.Iterator;
class program1iterator {
public static void main(String[] args){

    
    ArrayList<String> al = new ArrayList<>();
    al.add("Samyak");
    al.add("Swain");
    al.add("Yash Technologies");
    
    Iterator i=al.iterator();
    while(i.hasNext())
    {
    	System.out.println(i.next());
    }
    for(String j:al)
    {
    	System.out.println("FOR EACH:"+ j);
    }
    System.out.println("Get Element index 1"+al.get(1));
    al.set(2,"Yash");
    for(String j:al)
    {
    	System.out.println("FOR EACH:"+j);
    }
  }
}
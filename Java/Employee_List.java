import java.util.Iterator;
import java.util.Vector;


public class Employee_List 
{
	
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee_List(int id,String name,String address,Double salary) 
	    {
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector list=new Vector();
		
		list.add(new Employee_List(101, "Samyak","Odisha",40000.0));
		list.add(new Employee_List(102, "Sandeep","Bihar",45000.0));
		list.add(new Employee_List(103, "Prince","Jharkhand",40500.0));
		list.add(new Employee_List(104, "Suvendu","kolkata",50000.0));
		
		Iterator<Employee_List> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		

	}

}

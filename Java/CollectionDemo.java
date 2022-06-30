import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> pq =new PriorityQueue<>();
		pq.add(200);
		pq.add(300);
		pq.add(400);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		pq.remove();
		
		System.out.println(pq);
		Queue<Integer> li= new LinkedList<>();
		li.add(1000);
		li.add(2000);
		li.add(3000);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		

	}

}

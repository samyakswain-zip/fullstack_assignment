
public class ThreadNameDemo extends Thread {

	public void run()
	{

	Thread.currentThread().setName("Run");
	System.out.println("Run: "+Thread.currentThread().getName());
	}
	

 public static void main(String[] args) { 
	System.out.println(Thread.currentThread().getName());//main 
	ThreadNameDemo t1=new ThreadNameDemo();
	System.out.println(t1.isAlive());
	t1.setName("T1 Thread");
	t1.start();
	System.out.println(t1.isAlive());
	System.out.println(Thread.currentThread().isAlive());
	ThreadNameDemo t2=new ThreadNameDemo();
	t2.setName("T2 Thread");
	t2.start();
}
} 

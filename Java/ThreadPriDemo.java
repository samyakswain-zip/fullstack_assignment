
public class ThreadPriDemo extends Thread{
	
	public void run()

	{

	System.out.println("In run Method");
	System.out.println(Thread.currentThread().getPriority ());//7

	} 
	



//public static void main(String[] args) {
//
//System.out.println(Thread.currentThread().getPriority());//5 Thread.current Thread().setPriority (MIN_PRIORITY); //(10) System.out.println(Thread.currentThread().getPriority ());//1 ThreadPriDemo tp=new ThreadPriDemo();
//
//tp.setPriority (20); //
//
//tp.start(); 
//
//}}
	
}
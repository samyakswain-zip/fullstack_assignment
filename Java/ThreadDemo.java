 
public class ThreadDemo extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread Started");

	}
	public static void main(String[] args) {
		//ThreadDemo t=new ThreadDemo();
		ThreadDemo t1= new ThreadDemo();
		//Thread t=new Thread(new ThreadDemo());
		Thread t= new Thread(t1);
		t.start();
	}

}
//start is used to create a thread and make it runnable , this new thread begins inside the run() method



public class ThreadInterDemo extends Thread {

	public void run()
	{
		System.out.println(Thread.interrupted()); // true
		for(int i=1;i<=3;i++)
		{
			try {
			System.out.println(i);
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ThreadInterDemo tid = new ThreadInterDemo();
		tid.start();
		tid.interrupt();

	}

}

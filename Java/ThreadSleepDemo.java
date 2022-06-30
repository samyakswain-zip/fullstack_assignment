
public class ThreadSleepDemo extends Thread {
	
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try {
//					Thread.sleep(-1);//interrupted exception
				System.out.println(Thread.currentThread().getName());
					
				}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		ThreadSleepDemo ts=new ThreadSleepDemo();
		ts.start();
		ts.setName("Yash Technologies");
		ts.setPriority(10);
		
		try {
			for(int i=1;i<=3;i++)
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

package Program;

public class Demo2 extends Thread
{
	public void run()
	{
		System.out.println("Number printing activity started");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println("Number printing activity completed");
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
}

package Program;

//using runnable interface
import java.util.Scanner;

class ThreadRunDemo1 implements Runnable
{

	public void run()
	{
		System.out.println("Banking activity Started");
		Scanner scan=new Scanner(System.in);  //user to ask some infomation
		System.out.println("Enter the Account number");
		int an=scan.nextInt();	//user enter scan it
		System.out.println("Enter the Password");
		int pwd=scan.nextInt();	// whatever user enter -scan it
		System.out.println("Collect your money");
		System.out.println("Banking activity completed");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ThreadRunDemo2 implements Runnable
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

class ThreadRunDemo3 implements Runnable
{
	public void run()       //why run method means we have to override methods-demo1,2,3
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Addition activity Started");
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		System.out.println("Enter the second number");
		int b=scan.nextInt();
		int c= a+b;
		System.out.println(c);
		System.out.println("Addition activity completed");	
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class ThreadRunDemo 
{
	public static void main(String[] args) 
	{
		ThreadRunDemo1 d1 =new ThreadRunDemo1();
		ThreadRunDemo2 d2 =new ThreadRunDemo2();
		ThreadRunDemo3 d3 =new ThreadRunDemo3();
		Thread t1=new Thread(d1);   //obj refernce in your class to pass
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		t1.start();
		t2.start();
		t3.start();
	}
}



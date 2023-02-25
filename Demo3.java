package Program;

import java.util.Scanner;

public class Demo3 extends Thread
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

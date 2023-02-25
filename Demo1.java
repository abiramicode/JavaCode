package Program;

import java.util.Scanner;

public class Demo1 extends Thread{
	
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

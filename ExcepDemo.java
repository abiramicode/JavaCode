package Program;

import java.util.Scanner;

class Demo 
{
		public void alpha()
		{
			System.out.println("Connection2 is Established");
			Scanner scan=new Scanner(System.in);
			try
			{
				System.out.println("Enter the Numerator: ");
				int a=scan.nextInt();
				System.out.println("Enter the Denaminator: ");
				int b=scan.nextInt();
				int c=a/b;
				System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println("Exception caught inside alpha()");	
			}
			System.out.println("Connection2 is Terminated");
		}
	}
class ExcepDemo
	{
		public static void main(String[] args)
		{
			System.out.println("Connection1 is established");
			Demo d1=new Demo();
			d1.alpha();
			System.out.println("Connection1 is terminated");

		}
	}


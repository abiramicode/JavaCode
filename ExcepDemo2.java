package Program;

import java.util.Scanner;

class Demod
{
		public void alpha() throws Exception
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
				throw e;
			}
			finally
			{
				System.out.println("Connection2 is Terminated");
			}
		}
	}
class ExcepDemo2
	{
		public static void main(String[] args)
		{
			System.out.println("Connection1 is established");
			try 
			{
			Demod d1=new Demod();
			d1.alpha();
			}
			catch(Exception e)
			{
				System.out.println("Exception caught inside main()");	
			}
			System.out.println("Connection1 is terminated");

		}
	}


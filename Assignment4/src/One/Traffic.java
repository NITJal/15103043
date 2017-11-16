package One;
class Green extends Thread
{
	public void run()
	{
		System.out.println("Green");
	}
}
class Yellow extends Thread
{
	public void run()
	{
		System.out.println("Yellow");
	}
}
class Red extends Thread
{
	public void run()
	{
		System.out.println("Red");
	}
}
class Fl extends Thread
{
	public void run()
	{
		
			System.out.println("F_Y");			
	}
}
public class Traffic {
	public static void main(String args[])
	{
		Green g = new Green();
		g.start();
		//wait for 60s
		try
		{
			Thread.sleep(60*1000);
		}
		catch(Exception a)
		{		}
		Yellow f = new Yellow();
		f.start();
		//wait for 50s
		try
		{
			Thread.sleep(50*1000);
		}
		catch(Exception a)
		{	}
		Fl[] fl = new Fl[10];
		for(int i =0;i <10;i++)
		{
			fl[i] = new Fl();
			fl[i].start();
			try
			{
				Thread.sleep(2*1000);
			}
			catch(Exception a)
			{}
		}
		Red r = new Red();
		r.start();
		try
		{
			Thread.sleep(60*1000);
		}
		catch(Exception a)
		{}
		//System.out.println("Completed\n");
	}
}

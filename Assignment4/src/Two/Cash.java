package Two;

 class Customer{  
    int amt =5000;  
      
    synchronized void withdraw(int amount)
    {  
    	System.out.println("Withdrawing...");  
      
    	if(this.amt < amount){  
    			System.out.println("Waiting...");  
    			try
    			{
    				wait();
    			}
    			catch(Exception e){}  
    	}  
    	this.amt -= amount;  
    	System.out.println("Balance " + this.amt);
    	System.out.println("Withdraw completed...");  
    }  
      
    synchronized void deposit(int amount)
    {  
    	System.out.println("depositing...");  
    	this.amt += amount;  
    	System.out.println("Balance " + this.amt);
    	System.out.println("Deposit completed... ");  
    	notify();  
    }  
}  
 
public class Cash {  
	    public static void main(String args[])
	    {  
	    	Customer c=new Customer();  
	    	new Thread()
	    	{  
	    		public void run(){c.withdraw(20000);}  
	    	}.start();  
	    	new Thread(){  
	    		public void run(){c.deposit(15000);}  
	    	}.start();  
	    }
}
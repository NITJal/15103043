package One;

import java.util.ArrayList;

class Stack
{
	public ArrayList<Integer> stk = null;
	
	public Stack()
	{
		stk = new ArrayList<Integer>();
	}
	public void push(int value)
	{
		System.out.println(value + " Pushed");
		stk.add(value);
	}
	public void pop()
	{
		if(!isEmpty())
		{
			System.out.println(stk.get(stk.size()-1) + " Poped");
			stk.remove(stk.size()-1);
		}
	}
	public void display()
	{
		int n = stk.size();
		System.out.print("Stack :");
		for(int i=0; i<n; i++)
		{
			System.out.print(stk.get(i)+" ");
		}
		System.out.println();
	}
	public boolean isEmpty()
	{
		if(stk.size() == 0)
			return true;
		else
			return false;
	}
	public int top()
	{
		if(!isEmpty())
			return stk.get(stk.size()-1);
		else
			return 0;
	}
}

public class Stk {
	public static void main(String args[])
	{
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		s.pop();
		s.display();
		s.push(5);
	}
}

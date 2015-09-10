package chapter3;
import java.util.ArrayList;


public class Hanoi {
	
	private ArrayList<Stack<Integer>> stacks;
	int size;
	
	public Hanoi(int aSize)
	{
		size = aSize;
		stacks = new ArrayList<Stack<Integer>>();
		for(int i = 0; i < 3; i++)
		{
			stacks.add( new Stack<Integer>());
		}
		
		for(int i = size; i > 0; i--)
		{
			stacks.get(0).push(i);
		}
		
		
	}
	
	public void stackUpRight(int p)
	{
		if(p == 0)
		{
			return;
		}
		stackUpRight(p-1);
		stacks.get(1).push(stacks.get(0).pop());
		stackUpLeft(p-1);
		stacks.get(2).push(stacks.get(1).pop());
		stackUpRight(p-1);
	}
	
	public void stackUpLeft(int p)
	{
		if(p == 0)
		{
			return;
		}
		stackUpLeft(p-1);
		stacks.get(1).push(stacks.get(2).pop());
		stackUpRight(p-1);
		stacks.get(0).push(stacks.get(1).pop());
		stackUpLeft(p-1);
	}
	
	public void print()
	{
		for(int i = 0; i < size; i++)
		{
			System.out.println( (stacks.get(0).isEmpty() ? "|" : stacks.get(0).pop()) + "     " + (stacks.get(1).isEmpty() ? "|" : stacks.get(1).pop()) + "     " + (stacks.get(2).isEmpty() ? "|" : stacks.get(2).pop()) + "     " );
		}
	}
	
	public static void main(String[] args)
	{
		Hanoi h = new Hanoi(10);
		
		h.stackUpRight(10);
		h.print();
		
	}
}

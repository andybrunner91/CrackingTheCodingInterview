package chapter3;

public class MinStack<E extends Comparable<E>> {

	private Stack<E> theStack;
	private Stack<E> min;
	public MinStack()
	{
		theStack = new Stack<E>();
		min= new Stack<E>();
		
	}
	public boolean isEmpty()
	{
		return theStack.isEmpty();
	}
	
	public void push(E data)
	{
		if(theStack.isEmpty())
		{
			theStack.push(data);
			min.push(data);
			return;
		}
		if(data.compareTo(min.peek()) <=0)
		{
			min.push(data);
		}
		theStack.push(data);;
		
	}
	
	public E pop()
	{
		if(theStack.peek().compareTo(min.peek())==0)
		{
			min.pop();
		}
		return theStack.pop();
	}
	
	public E min() 
	{
		return min.peek();
	}
	
	public static void main(String[] args)
	{
		MinStack<Integer> m = new MinStack<Integer>();
		
		m.push(10);
		System.out.println(m.min());
		m.push(5);
		System.out.println(m.min());
		m.push(7);
		System.out.println(m.min());
		m.push(2);
		m.push(2);
		System.out.println(m.min());
		m.pop();
		System.out.println(m.min());
		m.pop();
		System.out.println(m.min());
		m.pop();
		System.out.println(m.min());
		m.pop();
		System.out.println(m.min());
		
	}
}

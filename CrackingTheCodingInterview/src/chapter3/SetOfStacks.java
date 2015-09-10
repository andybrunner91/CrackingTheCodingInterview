package chapter3;
import chapter2.LinkedList;



public class SetOfStacks<E>
{
	LinkedList<Stack<E>> aList;
	int capacity;
	int currentSize;
	
	public SetOfStacks(int aCapacity)
	{
		aList = new LinkedList<Stack<E>>();
		capacity = aCapacity; currentSize = 0;
		
	}
	
	public void push(E data)
	{
		if(currentSize == capacity || aList.isEmpty())
		{
			aList.add(new Stack<E>());
			currentSize = 0;
		
		}
	}
		
	public E pop()
	{
		if(aList.isEmpty()) return null;
		if(aList.head().getData().isEmpty())
		{
			aList.removeHead();
		}
		if(aList.isEmpty()) return null;
		currentSize--;
		return aList.head().getData().pop();
	}
	
	public static void main(String[] args)
	{
		SetOfStacks<Integer> s = new SetOfStacks<Integer>(2);
		s.push(5);
		s.push(10);
		s.push(7);
		s.pop();
		s.pop();
		s.pop();
		
	}
}



package chapter3;


public class Node<E> {
	
	private E myData;
	private Node<E> myNext;
	
	public Node(E someData, Node<E> someNext)
	{
		myData = someData;
		myNext = someNext;
	}
	public Node(E someData)
	{
		this(someData, null);
	}
	
	public E getData()
	{
		return myData;
	}
	
	public Node<E> next()
	{
		return myNext;
	}

}

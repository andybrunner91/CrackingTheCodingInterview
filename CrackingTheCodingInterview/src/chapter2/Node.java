package chapter2;

public class Node<E> {
	
	private E myData;
	private Node<E> myNext;
	
	public Node(E someData, Node<E> aNext)
	{
		myData = someData;
		myNext = aNext;
	}
	
	public Node<E> next()
	{
		return myNext;
	}
	
	public E getData()
	{
		return myData;
	}
	
	public void setData(E someData)
	{
		myData = someData;
	}
	
	public void setNext(Node<E> aNext)
	{
		myNext = aNext;
	}
	
	
	public String toString()
	{
		if(myNext == null)
		{
			return "My data is " + myData + " and myNext is null.";
		}
		return "My data is " + myData + " and myNext is " + myNext.getData();
	}

}

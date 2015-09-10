package chapter3;
import chapter2.Node;


public class Stack<E> {

	private Node<E> head;
	
	public Stack()
	{
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void push(E data)
	{
		Node<E> a = new Node<E>(data, head);
		head = a;
	}
	
	public E peek()
	{
		return head.getData();
	}
	
	public E pop()
	{
		if(isEmpty()) return null;
		Node<E> temp = head;
		head = head.next();
		return temp.getData();
	}
}

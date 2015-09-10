package chapter3;

public class MyQueue<E> {

	private Stack<E> s1 = new Stack<E>();
	private Stack<E> s2 = new Stack<E>();
	
	public void enqueue(E data)
	{
		while(!s2.isEmpty())
			s1.push(s2.pop());
		s1.push(data);
	}
	
	public E dequeue()
	{
		while(!s1.isEmpty())
			s2.push(s1.pop());
		return s2.pop();
	}
	
	public static void main(String[] args)
	{
		MyQueue<Integer> q = new MyQueue<Integer>();
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(8);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(9);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}

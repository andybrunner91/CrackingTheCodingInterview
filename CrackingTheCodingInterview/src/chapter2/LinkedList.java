package chapter2;
import java.util.Hashtable;


public class LinkedList<E> {
	
	private Node<E> head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public Node<E> head()
	{
		return head;
	}
	
	
	
	public void setHead(Node<E> aHead)
	{
		head = aHead;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public E removeHead()
	{
		E temp = head.getData();
		head = head.next();
		return temp;
	}
	
	public void add(E someData)
	{
		Node<E> aNode = new Node<E>(someData, head);
		head = aNode;
	}
	
	public void deleteFromMid(Node<E> aNode)
	{
		if(aNode == null) return;
		if(aNode.next() == null)
		{
			aNode=null;
			return;
		}
		aNode.setData(aNode.next().getData());
		aNode.setNext(aNode.next().next());
		
	}
	
	/*
	public void partition(E x)
	{
		Node<E> runner = head;
		while(runner != null && runner.next() != null )
		{
			if(runner.next().getData().compareTo(x) < 0)
			{
				Node<E> temp = runner.next();
				runner.setNext(runner.next().next());
				temp.setNext(head);
				head = temp;
			}
			runner = runner.next();
		}
		
	}
	*/
	
	public void print()
	{
		if(head == null)
		{
			System.out.println("Empty list");
			return;
		}
		Node<E> runner = head;
		while(runner != null)
		{
			System.out.print(runner.getData() + " ");
			runner = runner.next();
		}
		System.out.println();
	}
	
	/*
	public static void testPartition()
	{
		LinkedList<Integer> aList = new LinkedList<Integer>();
		aList.add(5);
		aList.add(10);
		aList.add(2);
		aList.add(12);
		aList.print();
		aList.partition(6);
		aList.print();
		aList.add(14);
		aList.add(1);
		aList.partition(3);
		aList.print();
		
	}
	*/
	
	public Node<E> findLoop()
	{
		LinkedList<E> aList = this;
		Hashtable<Node<E>,Boolean> aHash = new Hashtable<Node<E>,Boolean>();
		Node<E> runner = aList.head();
		
		while(runner != null)
		{
			if(aHash.containsKey(runner))
			{
				return runner;
			}
			else
			{
				aHash.put(runner, true);
			}
			runner = runner.next();
		}
		return null;
	}
	
	public static void testFindLoop()
	{
		LinkedList<Integer> aList = new LinkedList<Integer>();
		aList.add(5);
		aList.add(4);
		aList.add(3);
		aList.add(2);
		aList.add(1);
		
		aList.print();
		Node<Integer> node3 = aList.head().next().next();
		node3.next().next().setNext(node3);
		
		System.out.println(node3.next().next().toString());
		
		System.out.println(aList.findLoop().getData());
	}

	
	public static void main(String[] args)
	{
		//testPartition();
		testFindLoop();
	}

}

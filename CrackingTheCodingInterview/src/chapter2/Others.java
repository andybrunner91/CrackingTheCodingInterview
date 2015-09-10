package chapter2;

public class Others {
	
	public static void main(String[] args)
	{
		LinkedList<Integer> s1 = new LinkedList<Integer>();
		LinkedList<Integer> s2 = new LinkedList<Integer>();
		s1.add(6);
		s1.add(1);
		s1.add(7);
		s2.add(2);
		s2.add(9);
		s2.add(5);
		s2.add(3);
		s2.add(4);
		
		addLists(s1,s2).print();
		
	}
	
	
	//public static SLList<Integer> addListsRecursive(SLList<Integer> a1, SLList<Integer> a2)
	//{
		
	//}
	public static LinkedList<Integer> addLists(LinkedList<Integer> a1, LinkedList<Integer> a2)
	{
		boolean carry = false;
		LinkedList<Integer> result = new LinkedList<Integer>();
		Node<Integer> r1 = a1.head();
		Node<Integer> r2 = a2.head();
		Node<Integer> tail = result.head();
		
		while(r1 != null || r2 != null)
		{
			int sum = 0;
			if(r1 == null)
			{
				sum = r2.getData();
				r2 = r2.next();
			}
			else if(r2 == null)
			{
				sum = r1.getData();
				r1= r1.next();
			}
			else
			{
				sum = r1.getData() + r2.getData();
				r1 = r1.next();
				r2 = r2.next();
			}
			if(carry)
			{
				sum++;
			}
			if(sum >= 10)
			{
				carry = true;
				sum -= 10;
			}
			else
			{
				carry = false;
			}
			Node<Integer> newNode = new Node<Integer>(sum, null);
			
			if(result.head() == null)
			{
				result.setHead(newNode);
				tail = result.head();
			}
			else
			{
				tail.setNext(newNode);
				tail = newNode;
			}
			
		}
		return result;
	}

}

public class MaxHeap<E>
{
	private HeapNode<E> root;
	private int size;
	
	public MaxHeap ()
	{
		root = null;
		size = 0;
	}
	
	// precondition: none
	// postcondition: adds obj to the Heap
	public void add(E obj) 
	{
		if(size == 0)
		{
			root = new HeapNode<E>(obj);
			size = 1;
		}
		else
		{
			size = size + 1;
			add(obj, root);
		}	
	}

	private void add(E obj, HeapNode<E> current)
	{
		Comparable object = (Comparable) obj;
		Comparable currentData = (Comparable)(current.getData());
		
		if(object.compareTo(currentData) > 0)
		{
			E temp = current.getData();
			current.setData(obj);
			obj = temp;
		}
		if(current.goLeft() == true)
		{
			if(current.getLeft() == null)
			{
				current.setLeft(new HeapNode<E> (obj));
			}
			else
			{
				add(obj, current.getLeft());
			}
			current.flipDirection();
		}
		else
		{
			if(current.getRight() == null)
			{
				current.setRight(new HeapNode<E> (obj));
			}
			else
			{
				add(obj, current.getRight());
			}
			current.flipDirection();
		}
	}
	
	// precondition: none
	// postcondition: removes and returns the largest element in the Heap
	//				  while preserving the Heap structure
	public E remove() 
	{
		if(root == null)
			return null;
		
		E temp = root.getData();
		
		if(root.getLeft() == null && root.getRight() == null)
		{
			root = null;
		}
		else if(root.getLeft() == null)
		{
			promoteNode(root, root.getRight(), false);
		}
		else if(root.getRight() == null)
		{
			promoteNode(root, root.getLeft(), true);
		}
		else
		{
			Comparable left = (Comparable)(root.getLeft().getData());
			Comparable right = (Comparable)(root.getRight().getData());
			
			if(left.compareTo(right) > 0)
			{
				promoteNode(root, root.getLeft(), true);
			}
			else
			{
				promoteNode(root, root.getRight(), false);
			}
		}
		
		size = size - 1;
		return temp;
	}
	
	public void promoteNode(HeapNode<E> previous, HeapNode<E> current, boolean cameFromLeft)
	{
		if(current.getLeft() == null && current.getRight() == null)
		{
			if(cameFromLeft == true)
			{
				previous.setData(current.getData());
				previous.setLeft(null);
			}
			else
			{
				previous.setData(current.getData());
				previous.setRight(null);
			}
		}
		else if(current.getLeft() == null)
		{
			previous.setData(current.getData());
			promoteNode(current, current.getRight(), false);
		}
		else if(current.getRight() == null)
		{
			previous.setData(current.getData());
			promoteNode(current, current.getLeft(), true);
		}
		else
		{
			Comparable left = (Comparable)(current.getLeft().getData());
			Comparable right = (Comparable)(current.getRight().getData());
			
			if(left.compareTo(right) > 0)
			{
				previous.setData(current.getData());
				promoteNode(current, current.getLeft(), true);
			}
			else
			{
				previous.setData(current.getData());
				promoteNode(current, current.getRight(), false);
			}
		}
	}
	
	// precondition: none
	// postcondition: returns the current size of the Heap
	public int size() 
	{
		return size;
	}

	// Use this main method in MaxHeap class:
	public static void main(String[] args)
	{
		// Creates and prints out an array of integers
		Integer[] numbers = {3, 32, 45, -12, 17, 18, 29};
		for(Integer temp : numbers)
			System.out.print(temp+"\t");
		System.out.println();
			
		// Creates a heap
		MaxHeap<Integer> heap = new MaxHeap<Integer>();
			
		// Adds the elements of array to the heap
		for(Integer temp : numbers)
			heap.add(temp);
			
		// Pulls the elements of the heap out and puts
		// them back in the array
		int index = 0;
		while(heap.size()>0)
		{
			numbers[index] = heap.remove();
			index++;
		}
			
		// Prints out the array, it should now be sorted
		for(Integer temp : numbers)
			System.out.print(temp+"\t");
		System.out.println();
	}
}
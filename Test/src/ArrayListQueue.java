import java.util.ArrayList;

public class ArrayListQueue<E> implements APQueue<E>
{
        // Instance Variables
        private ArrayList<E> queue;
        private int size;

        //Constructor
        public ArrayListQueue()
        {
        	queue = new ArrayList<E>();
        }
        
	// Once you have completed the class by implementing
        // all of the needed instance variables, constructors
        // and methods required to implement the interface,
	// include a main method that tests it:

	public static void main(String[] args)
	{
		ArrayListQueue<String> list = new ArrayListQueue<String>();
		list.enqueue("Bob");
		list.enqueue("Josh");
		list.enqueue("Brice");
		while(!list.isEmpty())
		{
			System.out.println(list.peekFront());
			System.out.println(list.dequeue());
			System.out.println();
		}
	}
}
public interface APQueue<E>
{
	/**
	 * Adds obj to the queue, at the end
	 * @param obj object to be added
	 */
	public void enqueue(E obj);
	
	/**
	 * Removes and returns the first element in
	 * the queue.
	 * @return the first element of queue
	 */
	public E dequeue();
	
	/**
	 * Returns (without removing) the first 
	 * element of the queue.
	 * @return the first element
	 */
	public E peekFront();
	
	/**
	 * Returns true if the queue has no elements
	 * and false otherwise.
	 * @return true if queue is empty
	 */
	public boolean isEmpty();
}
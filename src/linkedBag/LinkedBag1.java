package linkedBag;

/**
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 4.0
 * @param <T>
*/
public final class LinkedBag1<T> implements BagInterface<T>
{
	private Node firstNode;
	private int numberOfEntries;

	public LinkedBag1()
	{
		firstNode = null;
    numberOfEntries = 0;
	} // end default constructor

  @Override
	public boolean add(T newEntry)
	{
		Node newNode = new Node(newEntry);
		newNode.next = firstNode;
		firstNode = newNode;
		numberOfEntries++;
      
		return true;
	} // end add

  @Override
	public T[] toArray()
	{
      @SuppressWarnings("unchecked")
      T[] result = (T[])new Object[numberOfEntries];
      
      int index = 0;
      Node currentNode = firstNode;
      while ((index < numberOfEntries) && (currentNode != null))
      {
         result[index] = currentNode.data;
         index++;
         currentNode = currentNode.next;
      }
      return result;

	} // end toArray
   
  @Override
	public boolean isEmpty()
	{
		return numberOfEntries == 0;
	}

  @Override
	public int getCurrentSize()
	{
		return numberOfEntries;
	}
   
// STUBS:

	/** Removes one unspecified entry from this bag, if possible.
       @return  Either the removed entry, if the removal
                was successful, or null. */
  @Override
	public T remove()
   {
			
      return null; // STUB
   } // end remove
   
	/** Removes one occurrence of a given entry from this bag.
       @param anEntry  The entry to be removed.
       @return  True if the removal was successful, or false otherwise. */
        @Override
   public boolean remove(T anEntry)
   {
      return false; // STUB
   } // end remove
	
	/** Removes all entries from this bag. */
        @Override
	public void clear()
   {
      // STUB
   } // end clear
	
	/** Counts the number of times a given entry appears in this bag.
		 @param anEntry  The entry to be counted.
		 @return  The number of times anEntry appears in the bag. */
	public int getFrequencyOf(T anEntry)
   {
      return 0; // STUB
   } // end getFrequencyOf
	
	/** Tests whether this bag contains a given entry.
		 @param anEntry  The entry to locate.
		 @return  True if the bag contains anEntry, or false otherwise. */
	public boolean contains(T anEntry)
   {
      return false; // STUB
   } // end contains

	private class Node
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node
} // end LinkedBag1




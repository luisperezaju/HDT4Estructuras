public abstract class AbstractList<E>
implements List<E>
{
	public AbstractList()
	{
		
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	
	public boolean contains(E value)
	
	{
		return -1 != indexOf(value);
	}
	
	
}
import java.util.Iterator;

public class SingleLink<E> extends AbstractList<E>
{

   protected int count; // list size
   protected Node<E> head; // ref. to first element

   public SingleLink()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }

@Override
public void clear() {
	// TODO Auto-generated method stub
	
}

@Override
public void addLast(E value) {
	// TODO Auto-generated method stub
	
}

@Override
public E getLast() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public E removeLast() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public E remove(E value) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void add(E value) {
	// TODO Auto-generated method stub
	
}

@Override
public E remove() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public E get() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int indexOf(E value) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int lastIndexOf(E value) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public E get(int i) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public E set(int i, E o) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void add(int i, E o) {
	// TODO Auto-generated method stub
	
}

@Override
public E remove(int i) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Iterator<E> iterator() {
	// TODO Auto-generated method stub
	return null;
}
}
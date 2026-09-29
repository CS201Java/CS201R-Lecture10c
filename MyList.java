import java.util.Collection;

public interface MyList<E> extends java.util.Collection<E> {

    //ABSTRACT METHODS
  
    public E get(int index); 
    public int size();

    //DEFAULT METHODS
    @Override
    //Default Method: add the given element to the end of the array   
    //PRE: accepts the element to add
    //POST:adds element to the end of the array  
    public default boolean add(E e){
        add(size(), e);
        return true;
    }
      
    @Override 
    //Default Method: Return true if this list contains no elements  
    //PRE: none
    //POST:return true if the array is empty, false if not 
    public default boolean isEmpty() {
      return size() == 0;
    }


    public default void add(int index, E e){}
    public default boolean addAll(Collection<? extends E> c){return false;}
    public default void clear(){}
    public default boolean contains(Object e) {return false;}
    public default boolean containsAll(Collection<?> c){return false;} 
    public default int indexOf(Object e){return -1;}    
    public default int lastIndexOf(E e) {return -1;}
    public default E remove (int index){return null;}
    public default boolean remove(Object e) {return false;}
    public default boolean removeAll(Collection<?> c) {return false;}
    public default boolean retainAll(Collection<?> c) {return false;}
    public default Object set(int index, E e){return null;}
    public default Object[] toArray() {return null;}
    public default <T> T[] toArray(T[] array) {return null;}
}
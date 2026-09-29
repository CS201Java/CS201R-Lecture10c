@SuppressWarnings("unchecked")

public class MyLinkedList<E> implements MyList<E> {
  private Node<E> head, tail;
  private int size = 0; // Number of elements in the list
  
  //Constructor:  Create a default list 
  public MyLinkedList() {
  }

  //Constructor: Create a list from an array of objects 
  public MyLinkedList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]); 
  }

  //Retrieve the element at the head
  //PRE: none
  //POST:verify the list is not empty
  //     return the head element 
  public E getFirst() {
    if (size == 0) {
      return null;
    }
    else {
      return head.element;
    }
  }

  //Retrieve the element at the head
  //PRE: none
  //POST:verify the list is not empty
  //     return the tail element 
  public E getLast() {
    if (size == 0) {
      return null;
    }
    else {
      return tail.element;
    }
  }

  
  //Add the element to the head of the list
  //PRE: accepts the element to add
  //POST:creates the new node
  //     adds the element as the new 'head' element
  //     adjusts tail if the list was empty
  //     increases the size of the list
  public void addFirst(E e) {
    Node<E> newNode = new Node<>(e);  // Create a new node
    newNode.next = head;              // link the new node with the head
    head = newNode;                   // head points to the new node
    size++;                           // Increase list size

    if (tail == null)                 // the new node is the only node in list
      tail = head;
  }

  //Add an element to the end of the list
  //PRE: accepts the element to add
  //POST:creates the new node
  //     adds the element as the tail element
  //     adjusts head if the list was empty 
  //     increases the size of the list

  public void addLast(E e) {
    Node<E> newNode = new Node<>(e);  // Create a new for element e

    if (tail == null) {
      head = tail = newNode;          // The new node is the only node in list
    }
    else {
      tail.next = newNode;            // Link the new with the last node
      tail = newNode;                 // tail now points to the last node
    }

    size++;                           // Increase size
  }

  @Override 
  //TASK 1: ADD METHOD
  //Add a new element to the end of the list (ignoring index)

  public void add(int index, E e) {
      addLast(e);
  }


  //Remove the element at the specified position in this list
  //PRE:  
  //POST:ignores index, removes head element
  public E removeFirst() {   
    if (isEmpty()) {
      return null;
    }
    else {
      Node<E> holdNode = head;
      head = head.next;
      size--;
      return holdNode.element;
    }
  }

  @Override 
  //Create a string that holds values in the array
  //PRE: none
  //POST:creates a string with array values & returns string
  public String toString() {
    StringBuilder result = new StringBuilder("[");

    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      result.append(current.element);
      current = current.next;
      if (current != null) {
        result.append(",\n "); // Separate two elements with a comma
      }
      else {
        result.append("]"); // Insert the closing ] in the string
      }
    }
    return result.toString();
  }

 

  @Override 
  //Retrieve the element at the index position
  //PRE: accepts the index
  //POST:verify the index & return null if invalid
  //     return the element 
  public E get(int index) {
    // Left as an exercise 
    if (size == 0 || index < 0 || index >= size) {
      return null;
    }
    Node<E> current = head;
    for (int i = 0; i < index; i++) 
        current = current.next;
    return current.element;
  }

 

   
  @Override 
  //Override iterator() defined in Iterable 
  //PRE: none
  //POST return a new array list iterator
  public java.util.Iterator<E> iterator() {
    return new LinkedListIterator();
  }
  
  @Override /** Return the number of elements in this list */
  public int size() {
    return size;
  }


  private class LinkedListIterator 
      implements java.util.Iterator<E> {
    private Node<E> current = head; // Current index 
    
    @Override
    public boolean hasNext() {
      return (current != null);
    }

    @Override
    public E next() {
      E e = current.element;
      current = current.next;
      return e;
    }

    @Override
    public void remove() {
      // This will not be implemented
    }
  }
  
  private static class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
      this.element = element;
    }
  }
  

}


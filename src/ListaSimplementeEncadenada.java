public class ListaSimplementeEncadenada<E> {

    protected int count; // list size
    protected NodoSimplementeEnlazado<E> head; // ref. to first element
    public ListaSimplementeEncadenada()
// post: generates an empty list
    {
        head = null;
        count = 0;
    }

    public int size()
// post: returns number of elements in list
    {
// number of elements we've seen in list
        int elementCount = 0;
// reference to potential first element
        NodoSimplementeEnlazado<E> finger = head;
        while (finger != null) {
// finger references a new element, count it
            elementCount++;
// reference possible next element
            finger = finger.next();
        }
        return elementCount;
    }
    public void addFirst(E value)
// post: value is added to beginning of list
    {
// note order that things happen:
// head is parameter, then assigned
        head = new NodoSimplementeEnlazado<E>(head, value);
        count++;
    }
    public E remove()
// pre: list is not empty
// post: removes and returns value from beginning of list
    {
        NodoSimplementeEnlazado<E> temp = head;
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
    public void addLast(E value)
// post: adds value to end of list
    {
// location for new value
        NodoSimplementeEnlazado<E> temp = new NodoSimplementeEnlazado<E>((NodoSimplementeEnlazado<E>) value,null);
        if (head != null)
        {
// pointer to possible tail
            NodoSimplementeEnlazado<E> finger = head;
            while (finger.next() != null)
            {
                finger = finger.next();
            }
            finger.setNext(temp);
        } else head = temp;
        count++;
    }
    public E removeLast()
// pre: list is not empty
// post: removes last value from list
    {
        NodoSimplementeEnlazado<E> finger = head;
        NodoSimplementeEnlazado<E> previous = null;
        while (finger.next() != null) // find end of list
        {
            previous = finger;
            finger = finger.next();
        }
// finger is null, or points to end of list
        if (previous == null)
        {
// has exactly one element
            head = null;
        }
        else
        {
// pointer to last element is reset
            previous.setNext(null);
        }
        count--;
        return finger.value();
    }
    public boolean contains(E value)
// pre: value is not null
// post: returns true iff value is found in list
    {
        NodoSimplementeEnlazado<E> finger = head;
        while (finger != null &&
                !finger.value().equals(value))
        {
            finger = finger.next();
        }
        return finger != null;
    }

    public void add(int i, E o)
// pre: 0 <= i <= size()
// post: adds ith entry of list to value o
    {
        if (i == size()) {
            addLast(o);
        } else if (i == 0) {
            addFirst(o);
        } else {
            NodoSimplementeEnlazado<E> previous = null;
            NodoSimplementeEnlazado<E> finger = head;
// search for ith position, or end of list
            while (i > 0)
            {
                previous = finger;
                finger = finger.next();
                i--;
            }
// create new value to insert in correct position
            NodoSimplementeEnlazado<E> current =
                    new NodoSimplementeEnlazado<E>(finger, o);
            count++;
// make previous value point to new value
            previous.setNext(current);
        }
    }



}

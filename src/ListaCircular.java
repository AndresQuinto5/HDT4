import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

public class ListaCircular<E>  {

    protected NodoCircular<E> tail;
    protected int count;
    public ListaCircular()
// pre: constructs a new circular list
    {
        tail = null;
        count = 0;
    }
    public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
    {

        NodoCircular<E> temp = new NodoCircular(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.getNext());
            tail.setNext(temp);
        }
        count++;
    }
    public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
    {
// new entry:
        addFirst(value);
        tail = tail.getNext();
    }
    public E removeLast()
// pre: !isEmpty()
// post: returns and removes value from tail of list
    {
        NodoCircular<E> finger = tail;
        while (finger.getNext() != tail) {
            finger = finger.getNext();
        }
// finger now points to second-to-last value
        NodoCircular<E> temp = tail;
        if (finger == tail)
        {
            tail = null;
        } else {
            finger.setNext(tail.getNext());
            tail = finger;
        }
        count--;
        return temp.value();
    }
}



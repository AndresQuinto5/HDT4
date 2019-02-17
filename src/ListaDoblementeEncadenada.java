import org.junit.Assert;

import java.util.ArrayList;

public class ListaDoblementeEncadenada<E> extends Lista<E> {
    protected int count;
    protected NodoDobleEnlazado<E> head;
    protected NodoDobleEnlazado<E> tail;
    public ListaDoblementeEncadenada()

    {

// post: constructs an empty list

        head = null;
        tail = null;
        count = 0;
    }

    public void add(E value)
// pre: value is not null
// post: adds element to head of list
    {
// construct a new element, making it head
        head = new NodoDobleEnlazado<>(value, head, null);
// fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }
    public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
    {
// construct new element
        tail = new NodoDobleEnlazado<>(value, null, tail);
// fix up head
        if (head == null) head = tail;
        count++;
    }

    public E getFirst(){
        // pre: list is not empty
        // post: returns first value in list
        {
            return head.value();
        }
    }
    public E remove(){
        NodoDobleEnlazado<E> finger = head;
        head = head.next();
// fix next field of element above

// fix previous field of element below

        count--; // fewer elements
        return finger.value();
    }


    public E get(){
        return head.value();
    }
    public int size(){
        return this.count;
    }





}


public class NodoDobleEnlazado<E>
{
    protected E data;
    protected NodoDobleEnlazado<E> nextElement;
    protected NodoDobleEnlazado<E> previousElement;
    public NodoDobleEnlazado(E v,
                            NodoDobleEnlazado<E> next,
                            NodoDobleEnlazado<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }
    public NodoDobleEnlazado(E v)
// post: constructs a single element
    {
        this(v,null,null);
    }
    public NodoDobleEnlazado<E> next()
// post: returns reference to next value in list
    {
        return nextElement;
    }
    public void setNext(NodoDobleEnlazado<E> next)
// post: sets reference to new next value
    {
        nextElement = next;
    }
    public E value()
// post: returns value associated with this element
    {
        return data;
    }
    public void setValue(E value)
// post: sets value associated with this element
    {
        data = value;
    }


}

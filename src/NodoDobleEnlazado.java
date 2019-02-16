public class NodoDobleEnlazado<E>
{
    protected NodoDobleEnlazado<E> prev;
    //Referencia nodo anterior

    protected NodoDobleEnlazado<E> next;
    // Referencia proximo nodo

    protected E Value;
    //Valor a almacenar

    public NodoDobleEnlazado(NodoDobleEnlazado<E> prev, NodoDobleEnlazado<E> next, E Value)
    {
        this.prev = prev;

        this.next = next;

        this.Value = Value;
    }

    public void setPrevious(NodoDobleEnlazado<E> prev) { this.prev = prev; }

    public NodoDobleEnlazado<E> getPrevious() { return prev; }

    public void setNext(NodoDobleEnlazado<E> next) { this.next = next; }

    public NodoDobleEnlazado<E> getNext() { return next; }

    public void setValue(E Value) { this.Value = Value; }

    public E getValue() { return Value; }

}

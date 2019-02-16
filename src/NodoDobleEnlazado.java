public class NodoDobleEnlazado<E>
{
    protected NodoDobleEnlazado<E> previous;
    //Referencia nodo anterior

    protected NodoDobleEnlazado<E> next;
    // Referencia proximo nodo

    protected E Value;
    //Valor a almacenar

    public NodoDobleEnlazado(NodoDobleEnlazado<E> previous, NodoDobleEnlazado<E> next, E Value)
    {
        this.previous = previous;

        this.next = next;

        this.Value = Value;
    }

    public void setPrevious(NodoDobleEnlazado<E> previous) { this.previous = previous; }

    public NodoDobleEnlazado<E> getPrevious() { return previous; }

    public void setNext(NodoDobleEnlazado<E> next) { this.next = next; }

    public NodoDobleEnlazado<E> getNext() { return next; }

    public void setValue(E Value) { this.Value = Value; }

    public E getValue() { return Value; }

}

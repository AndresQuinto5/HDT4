public class NodoDobleEnlazado<E>
{

    protected NodoDobleEnlazado<E> previous;
    //Referencia nodo anterior

    protected NodoDobleEnlazado<E> next;
    // Referencia proximo nodo

    protected E value;
    //Valor a almacenar

    public NodoDobleEnlazado(NodoDobleEnlazado<E> previous, NodoDobleEnlazado<E> next, E Value)
    {
        this.previous = previous;

        this.next = next;

        this.value = value;
    }

    public void setPrevious(NodoDobleEnlazado<E> previous) { this.previous = previous; }

    public NodoDobleEnlazado<E> getPrevious() { return previous; }

    public void setNext(NodoDobleEnlazado<E> next) { this.next = next; }

    public NodoDobleEnlazado<E> getNext() { return next; }

    public void setValue(E value) { this.value = value; }

    public E getValue() { return value; }

}

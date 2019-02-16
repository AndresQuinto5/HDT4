public class NodoSimplementeEnlazado<E>
{
    public NodoSimplementeEnlazado<E> next;
    //Referencia

    public E Value;
    //Recibe valor que se almacena en el nodo

    public NodoSimplementeEnlazado(NodoSimplementeEnlazado<E> next, E Value)
    {
        this.next = next;

        this.Value = Value;
    }

    public NodoSimplementeEnlazado<E> getNext() { return next; }

    public void setValue(E Value) { this.Value = Value; }

    public void setNext(NodoSimplementeEnlazado<E> next) { this.next = next; }

    public E getValue() { return Value; }
}


public class PilaLista<E> extends Pila<E>
{
    protected iLista<E> lista;

    public PilaLista(iLista lista)
    {
        this.lista = lista;
    }

    @Override
    public void push(E element)
    {
        lista.addLast(element);
    }

    @Override
    public E pop()
    {
        return lista.removeLast();
    }

    @Override
    public E peek()
    {
        return lista.getLast();
    }

    @Override
    public boolean empty()
    {
        return lista.isEmpty();
    }

    @Override
    public int size()
    {
        return lista.size();
    }

}
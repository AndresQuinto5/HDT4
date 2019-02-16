<<<<<<< HEAD
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
=======
public class PilaLista<E> implements iPila<E>
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
>>>>>>> c194e987a9437bb49cf8cf374b55b6ecf2f88faa

import java.util.ArrayList; //Implementacion del ArraylistEnlaPila

public class PilaArraylist<E> extends Pila<E>
{
    protected ArrayList<E> list;

    @Override
    public void push(E element)
    {
        list.add(element);
    }

    @Override
    public E pop()
    {
        return list.remove(list.size()-1);
    }

    @Override
    public E peek()
    {
        return list.get(list.size()-1);
    }

    @Override
    public boolean empty()
    {
        return list.isEmpty();
    }

    @Override
    public int size()
    {
        return list.size();
    }



    public PilaArraylist()
    {
        list = new ArrayList();
    }
}
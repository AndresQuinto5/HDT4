import java.util.ArrayList;
import java.util.List;

public abstract class Pila<E> implements iPila<E>{

    protected List<E> ar;



    @Override
    public void push(E item) {
        ar.add(item);
    }

    //quitar
    @Override
    public E pop() {
        return ar.remove(size()-1);

    }

    @Override
    public E peek() {
        return ar.get(ar.size()-1);
    }


    @Override
    public boolean empty() {
        return ar.size() == 0;
    }

    @Override
    public int size() {
        return ar.size();
    }
}

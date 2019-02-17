import java.util.Vector;

public class PilaVector<E> extends Pila<E> {

    protected Vector<E> ar;
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
    public int size() {
        return ar.size();
    }

    @Override
    public boolean empty() {
        return ar.isEmpty();
    }

    public PilaVector() { ar = new Vector<>();
    }

}

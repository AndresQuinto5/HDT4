import java.util.Iterator;

public interface iLista<E> {


    public void add(E value);
    // post: value is added to end of list

    public E getFirst();
    // pre: list is not empty
// post: returns first value in list


    public E remove();
    // post: removes and returns element equal to value
// otherwise returns null

    public E get();
    // pre: list has at least one element
// post: returns last value found in list


}

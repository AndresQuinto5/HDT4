import java.util.ArrayList;
import java.util.List;

public abstract class Pila<E> implements iPila<E>{

    protected List<E> ar;


    @Override
    public boolean empty() {
        return ar.size() == 0;
    }

}

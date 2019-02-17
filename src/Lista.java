import java.util.Iterator;

//import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public abstract class Lista<E> implements iLista<E>{


    public void push(E item){
        this.add(item);
    }


    public E peek(){
        return this.getFirst();
    }


    public E pop(){
        return this.remove();
    }

    public abstract int size();


    public boolean empty(){
        if (this.size() == 0) {
            return true;
        }else{
            return false;
        }
    }

}

import java.util.ArrayList;

public class Pila implements iPila<String>{

    public boolean tienealgo = true;
    ArrayList<String> ar = new ArrayList<>();

    @Override
    public void push(String item) {
        ar.add(item);
        tienealgo = false;
    }

    //quitar
    @Override
    public String pop() {
        return ar.remove(size()-1);

    }

    @Override
    public String peek() {
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

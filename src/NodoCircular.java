public class NodoCircular<E>{
    // Variable en la cual se va a guardar el valor.

    public int value;

    // Variable para enlazar los nodos.

    public NodoCircular Next;

    public NodoCircular(Object value) {

    }

    public void NodoCircular(){
        this.value = 0;
        this.Next = null;
    }

    // Métodos get y set para los atributos.

    public int getValue() {
        return value;
    }

    public void setValue(int valor) {
        this.value = valor;
    }

    public NodoCircular getNext() {
        return Next;
    }

    public void setNext(NodoCircular Next) {
        this.Next = Next;
    }


}
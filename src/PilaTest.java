import static org.junit.Assert.*;

public class PilaTest {
    @org.junit.Test
    public void pop() {
        Pila pila = new PilaArraylist();
        pila.push("2.0");
        assertEquals("2.0",pila.pop());
    }

    @org.junit.Test
    public void push() {
        Pila pila = new PilaArraylist();
        pila.push("2.0");
        assertEquals("2.0",pila.peek());

    }

    @org.junit.Test
    public void peek() {
        Calculadora calculadora = new Calculadora();
    }



    @org.junit.Test
    public void empty() {
        Pila pila = new PilaArraylist();
        assertTrue(pila.empty());
    }

    @org.junit.Test
    public void size() {
        Pila pila = new PilaArraylist();
        assertEquals(0,pila.size());
    }
}
 import static org.junit.Assert.*;

    public class CalculadoraTest {

        @org.junit.Test
        public void sumar() {
            Calculadora calculadora = new Calculadora();
            Double a = 1.0;
            Double b = 2.0;
            assertEquals(3.0,calculadora.sumar(a,b),0.0);
        }


        @org.junit.Test
        public void restar() {
            Calculadora calculadora = new Calculadora();
            Double a = 2.0;
            Double b = 1.0;
            assertEquals(1.0,calculadora.restar(a,b),0.0);
        }

        @org.junit.Test
        public void multiplicar() {
            Calculadora calculadora = new Calculadora();
            Double a = 1.0;
            Double b = 2.0;
            assertEquals(2.0,calculadora.multiplicar(a,b),0.0);
        }

        @org.junit.Test
        public void dividir() {
            Calculadora calculadora = new Calculadora();
            Double a = 2.0;
            Double b = 1.0;
            assertEquals(2.0,calculadora.dividir(a,b),0.0);
        }
    }


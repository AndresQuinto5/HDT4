import java.util.ArrayList;
import java.util.Vector;


public class Calculadora  implements iCalculadora{

    private static Calculadora ourInstance = new Calculadora();

    public static Calculadora getInstance() {
        if (ourInstance == null) {
            ourInstance = new Calculadora();
        }return ourInstance;
    }

    public Calculadora() {
    }

    //Sirve para ver si el array list tiene algo o es nulo//
    public boolean tienealgo = true;
    ArrayList<String> ar = new ArrayList<>();

    //Sumar dos numeros
    @Override
    public double sumar(double a, double b) {
        return a+b;
    }

    //restar dos numeros
    @Override
    public double restar(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a*b;
    }

    //dividir dos numeros
    @Override
    public double dividir(double a, double b) {
        return a/b;
    }


}
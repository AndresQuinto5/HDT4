/**
 * Interfaz para las operaciones de la calculadora de la HDT 2.
 */

/**
 * @author Marco Flores 16260
 * @date 28-01-2019
 */

public interface iCalculadora {

    /**
     * MÈtodo para hacer la suma de la calculadora
     * @param a double - sumando
     * @param b double - sumando
     * @return Double - El resultado de la suma de a y b
     */
    public double sumar(double a, double b);

    /**
     * MÈtodo para hacer la resta de la calculadora
     * @param a double -
     * @param b double -
     * @return Double - El resultado de la resta entre a y b
     */
    public double restar(double a, double b);

    /**
     * MÈtodo para hacer la multiplicaciÛn de la calculadora
     * @param a double - factor
     * @param b double - factor
     * @return Double - El resultado de la multiplicaciÛn entre a y b
     */
    public double multiplicar(double a, double b);

    /**
     * MÈtodo para hacer la divisiÛn de la calculadora
     * @param a double - dividendo
     * @param b double - divisor
     * @return Double - El resultado de la divisiÛn entre a y b
     */
    public double dividir(double a, double b);

}
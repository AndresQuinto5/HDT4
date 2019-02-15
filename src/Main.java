import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.stream.Stream;

public class Main {

    static String encendermenu = "\n CALCULADORA : \n" +
            "\t1. Ingresar la direccion del archivo con la ecuacion que quiere resolver:\n" +
            "\t   La direccion del archivo tiene que ser en formato C:\\\\Users\\\\try\\\\Desktop\\\\intento.txt\n" +
            "\t2. Salir.";


    public static void main(String[] args) {
        iCalculadora calculadora = new Calculadora();
        iPila pila = new Pila();
        Scanner input = new Scanner(System.in);
        String informacion = "";
        boolean deleViaje = false;

        System.out.println(encendermenu);
        String archivo = input.nextLine();

        //Encontrar el archivo y seguir buscando hasta que se encuentre.
        if (!archivo.equals("2")){
            try {
                File archivoUsuario = new File(archivo);
                Scanner scan = new Scanner(archivoUsuario);
                System.out.println("\n Se ha encontrado el archivo exitosamente, en un momento saldra el preview del texto\n");
                while (scan.hasNextLine()){
                    informacion = informacion + scan.next();
                }
                System.out.println("El texto encontrado es:  " + informacion);
                System.out.println("\n Se va a proseguir a resolver el problema...");
                deleViaje = true;

            }catch (Exception e){
                System.out.println("Intente ingresando la direccion del archivo de nuevo porque no se encontro");
            }
        }

        if (deleViaje){
            try{
                String a;
                String b;
                Double result1;
                Double result2;


                // primero se definen variables
                for (int i=0, n=informacion.length(); i < n; i++){
                    switch (Character.toString(informacion.charAt(i))){
                        case "+":{
                            a = ((Pila) pila).pop();
                            result1 = Double.parseDouble(a);
                            b = ((Pila) pila).pop();
                            result2 = Double.parseDouble(b);
                            ((Pila) pila).push(String.valueOf(calculadora.sumar(result1,result2)));
                            break;

                        }
                        case "-":{
                            a = ((Pila) pila).pop();
                            result1 = Double.parseDouble(a);
                            b = ((Pila) pila).pop();
                            result2 = Double.parseDouble(b);
                            ((Pila) pila).push(String.valueOf(calculadora.restar(result1,result2)));
                            break;

                        }
                        case "*":{
                            a = ((Pila) pila).pop();
                            result1 = Double.parseDouble(a);
                            b = ((Pila) pila).pop();
                            result2 = Double.parseDouble(b);
                            ((Pila) pila).push(String.valueOf(calculadora.multiplicar(result1,result2)));
                            break;
                        }
                        case "/":{
                            a = ((Pila) pila).pop();
                            result1 = Double.parseDouble(a);
                            b = ((Pila) pila).pop();
                            result2 = Double.parseDouble(b);
                            ((Pila) pila).push(String.valueOf(calculadora.dividir(result1,result2)));
                            break;
                        }
                        default: ((Pila) pila).push(Character.toString((informacion.charAt(i))));
                            break;
                    }
                }
                System.out.println("El resultado de la operacion es: " + ((Pila) pila).peek());
            }catch (Exception e){
                System.out.println("No se logro obtener un resultado, intente de nuevo."
                );
            }
        }
    }
}
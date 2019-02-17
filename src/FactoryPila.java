public class FactoryPila {

    public iPila getImplementaciones(String opc){

        if("1".equals(opc)){
            System.out.print("Opcion PilaLista Elegida");
            return new PilaLista();
        }
        else if (opc.equals("2")) {
            System.out.println("Opcion Vector Elegida");
            return new PilaVector();
        }
        else if (opc.equals("3")) {
            System.out.println("Opcion ArrayList Elegida");
            return new PilaArraylist();
        }
        return null;
    }
}

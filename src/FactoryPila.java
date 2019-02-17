class FactoryPila<E> {

    public iPila<E> getImplementacion(String opc){

        if (opc.equals("1")) {
            System.out.println("Opcion Vector Elegida");
            return new PilaVector<E>();
        }
        else if (opc.equals("2")) {
            System.out.println("Opcion ArrayList Elegida");
            return new PilaArraylist<E>();
        }
        else if (opc.equals("3")){
        System.out.print("Opcion Lista Circular  Elegida");
        return new PilaArraylist<>();
        }
        else if (opc.equals("4")) {
            System.out.print("Opcion Lista Simplemente Encadenada Elegida");
            return new PilaArraylist<>();
        }
        else if (opc.equals("5")) {
            System.out.print("Opcion Lista Doblemente Encadenada Elegida");
            return new PilaArraylist<>();
        }

        else
            System.out.print("La opcion no fue encontrada asi que se hara con Arraylist");
            return new PilaArraylist<>();
    }
}

class FactoryPila<E> {

<<<<<<< HEAD
    public iPila<E> getImplementacion(String opc){

        if (opc.equals("1")) {
=======
    public iPila getImplementaciones(String opc){

        if("1".equals(opc)){
            System.out.print("Opcion PilaLista Elegida");
            return new PilaLista();
        }
        else if (opc.equals("2")) {
>>>>>>> ec199b986816363beddef4e066abd2e0a63ab40c
            System.out.println("Opcion Vector Elegida");
            return new PilaVector<E>();
        }
        else if (opc.equals("3")) {
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

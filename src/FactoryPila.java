class FactoryPila<E> {

    public iPila<E> getImplementacion(String opc){

        if("1".equals(opc)){
            System.out.print("Opcion Pila Lista Elegida");
            return new PilaLista();
        }
        else if (opc.equals("2")) {
            System.out.println("Opcion Vector Elegida");
            return new PilaVector();
        }
        else if (opc.equals("2")) {
            System.out.println("Opcion ArrayList Elegida");
            return new PilaArraylist();
        }
        return null;
    }
}

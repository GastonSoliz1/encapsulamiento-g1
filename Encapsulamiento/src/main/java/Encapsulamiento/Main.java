package Encapsulamiento;

public class Main {
    public static void main(String[] args) {
        Aceleradores acelerador = new Aceleradores(1, "Carlos 1","Arellano");
        System.out.println("El nombre es: "+acelerador.getNombre()+" "+acelerador.getApellido());
    }
}

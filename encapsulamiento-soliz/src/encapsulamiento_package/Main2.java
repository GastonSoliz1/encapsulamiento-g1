package encapsulamiento_package;

public class Main2 {
    public static void main(String[] args){
        Persona Ricardo = new Persona("Ricardo",30,"example@gmail.com",1.70);

        System.out.println("Nombre de la persona: " + Ricardo.nombre);

        System.out.println("Edad de la persona: "+ Ricardo.edad);

        System.out.println("Estatura de la persona: " + Ricardo.estatura);

        //System.out.println("Correo de la persona: " + Ricardo.email);
    }
}

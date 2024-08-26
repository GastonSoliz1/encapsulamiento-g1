import encapsulamiento_package.Persona;

public class Main{

    public static void main(String[] args) {
        Persona Gaston = new Persona("Gaston", 12, "gesoliz.aceleracion2024@gylgroup.com",1.72);

        //System.out.println("Nombre de la persona: "+Gaston.nombre);

        System.out.println("Edad de la persona: " + Gaston.edad);

        //System.out.println("Estatura de la persona: " + Gaston.estatura);

        //System.out.println("Correo de la persona: " + Gaston.email);

        System.out.println("Correo de la persona: " + Gaston.getEmail());

    }
}
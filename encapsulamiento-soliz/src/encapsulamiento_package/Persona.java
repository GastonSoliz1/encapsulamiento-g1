package encapsulamiento_package;

public class Persona {
    String nombre;
    public Number edad;
    protected Number estatura;
    private String email;

    public Persona(String nombre,Number edad,String email,Number estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Number getEdad() {
        return edad;
    }

    public void setEdad(Number edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Number getEstatura(){
        return estatura;
    }

    public void setEstatura(Number estatura){
        this.estatura = estatura;
    }
}

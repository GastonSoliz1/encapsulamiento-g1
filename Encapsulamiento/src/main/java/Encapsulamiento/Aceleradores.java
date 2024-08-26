package Encapsulamiento;

public class Aceleradores {
    private int id;
    private String nombre;
    private String Apellido;

    public Aceleradores() {
    }

    public Aceleradores(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        Apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}

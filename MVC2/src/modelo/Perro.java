package modelo;

public class Perro {

    String nombre;
    String raza;
    public static byte numeroPerros = 5;
    
    public Perro(){
    }
    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}

package modelo;

public class Cuido {
    String nombreCuido;
    public static byte cantidad = 10;
    public Cuido(String nombre) {
        this.nombreCuido = nombre;
    }
    public String getNombre() {
        return nombreCuido;
    }
    public void setNombre(String nombreCuido) {
        this.nombreCuido = nombreCuido;
    }
    
}

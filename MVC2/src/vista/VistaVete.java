package vista;

import controlador.ControladorVete;

public interface VistaVete {
    public void mostrarInterfaz(ControladorVete controlador);
    public void mostrarResultadoVenta(String resultado);
    public String getRaza();
    public String getNombreCuido();

}

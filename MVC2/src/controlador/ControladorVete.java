package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Cuido;
import modelo.Perro;
import vista.VistaVete;
import vista.VistaVeteTerminal;
import vista.vistaVeteGUI;

public class ControladorVete implements ActionListener{  //debe tener el modelo y la vista

    ArrayList<Perro> perros;
    ArrayList<Cuido> cuidos;
    VistaVete vista;


    public ControladorVete(ArrayList<Perro> perros, ArrayList<Cuido> cuidos, VistaVete vista) {
        this.perros = perros;
        this.cuidos = cuidos;
        this.vista = vista;
    }

    public void mostrarInterfaz(){
        vista.mostrarInterfaz(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaVeteGUI.botonCompraCuido || VistaVeteTerminal.operacion == Operacion.COMPRARCUIDO){
            String cuido = vista.getNombreCuido();
            for (int i=0; i < cuidos.size(); i++){
                if (cuidos.get(i).getNombre().equals(cuido)){
                    vista.mostrarResultadoVenta("LA VENTA SE PUEDE LLEVAR A CABO");
                    cuidos.remove(i);
                    Cuido.cantidad--;
                    return;
                }
            }
            if (cuidos.size() == 0){
                vista.mostrarResultadoVenta("NO ME QUEDARON CONENTRADOS");
            }
            else{
                vista.mostrarResultadoVenta("NO TENEMOS ESE CUIDO");
                return;
            }
        }
        else{
            String raza = vista.getRaza();
            for (int i=0; i < perros.size(); i++){
                if (perros.get(i).getRaza().equals(raza)){
                    vista.mostrarResultadoVenta("LA VENTA SE PUEDE LLEVAR A CABO");
                    perros.remove(i);
                    Perro.numeroPerros--;
                    return;
                }
            }
            if (perros.size() == 0){
                vista.mostrarResultadoVenta("NO ME QUEDARON PERROS");
            }
            else{
                vista.mostrarResultadoVenta("NO TENEMOS ESA RAZA");
                return;
            }
        }
    }
    
}

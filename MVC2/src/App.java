import java.util.ArrayList;

import controlador.ControladorVete;
import modelo.Cuido;
import modelo.Perro;
import vista.VistaVeteTerminal;
import vista.vistaVeteGUI;

public class App {
    public static void main(String[] args) throws Exception {
        Perro perro = new Perro("Sasha", "criollo");
        Perro perro1 = new Perro("tom", "pug");
        Perro perro2 = new Perro("kai", "labrador");

        ArrayList<Perro> list = new ArrayList<>();
        list.add(perro2);
        list.add(perro);
        list.add(perro1);

        Cuido cuido1 = new Cuido("Ringo");
        Cuido cuido2 = new Cuido("dog");
        Cuido cuido3 = new Cuido("Nutrecan");

        ArrayList<Cuido> listaCuidos = new ArrayList<>();
        listaCuidos.add(cuido3);
        listaCuidos.add(cuido2);
        listaCuidos.add(cuido1);

        vistaVeteGUI vista = new vistaVeteGUI();
        //VistaVeteTerminal vista = new VistaVeteTerminal();
        ControladorVete controlador = new ControladorVete(list, listaCuidos, vista);
        controlador.mostrarInterfaz();
    }
}

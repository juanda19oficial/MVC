package vista;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controlador.ControladorVete;

public class vistaVeteGUI extends JFrame implements VistaVete{  //implemento la vista general

    Container contenedor;
    FlowLayout layout;
    public static JButton botonCompraPerro, botonCompraCuido;
    JTextField campoLibre;

    public vistaVeteGUI(){
        contenedor = getContentPane();
        layout = new FlowLayout();
        contenedor.setLayout(layout);

        campoLibre = new JTextField(10);
        contenedor.add(campoLibre);

        botonCompraPerro = new JButton("Comprar Perro");
        contenedor.add(botonCompraPerro);  //Aqui no se ponen las escuchas, se hace en el controlador al mostrar la interfaz

        botonCompraCuido = new JButton("Comprar cuido");
        contenedor.add(botonCompraCuido);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
    }

    @Override
    public void mostrarInterfaz(ControladorVete controlador) { //recibe el controlador es el puente entre vista controlador
        botonCompraPerro.addActionListener(controlador);
        botonCompraCuido.addActionListener(controlador);
        setVisible(true);
    }

    @Override
    public void mostrarResultadoVenta(String resultado) {
        JOptionPane.showMessageDialog(contenedor, resultado);
    }

    @Override
    public String getRaza() {
        String raza = campoLibre.getText();
        return raza;
    }

    @Override
    public String getNombreCuido() {
        String nombreCuido = campoLibre.getText();
        return nombreCuido;
    }


    
}

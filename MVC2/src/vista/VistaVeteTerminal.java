package vista;

import java.util.Scanner;
import controlador.ControladorVete;
import controlador.Operacion;
import excepciones.ExcepcionOpcion;

public class VistaVeteTerminal implements VistaVete {
    public static Operacion operacion;
    String raza;
    String nombreCuido;

    @Override
    public void mostrarInterfaz(ControladorVete controlador) {
        byte opcion = 0;
        while(opcion !=3){
            System.out.println("BIENVENIDO A LA VETERINARIA");
            System.out.println("1) comprar perro");
            System.out.println("2) comprar alimento");
            System.out.println("3) Salir");
            System.out.println("Digite su opcion: ");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextByte();
            while (true){
                try{
                    if (opcion==1){
                        System.out.println("Dame la raza: ");
                        raza = scanner.next();
                        controlador.actionPerformed(null);
                        operacion = Operacion.COMPRARPERRO;
                    }
                    else if(opcion == 2){
                        System.out.println("Dame el nombre del cuido: ");
                        nombreCuido = scanner.next();
                        controlador.actionPerformed(null);
                        operacion = Operacion.COMPRARCUIDO;
                    }
                    else{
                        throw new ExcepcionOpcion("OPCION INCORRECTA!!");
                    }
                }catch(NumberFormatException e){
                    System.out.println("DEBE DIGITAR UN NUMERO!!!");
                }catch(ExcepcionOpcion e){
                    System.out.println();
                }
            }
            
            
        }
    }

    @Override
    public void mostrarResultadoVenta(String resultado) {
        System.out.println(resultado);
    }

    @Override
    public String getRaza() {
        return raza;
    }

    @Override
    public String getNombreCuido() {
        return nombreCuido;
    }
    
}

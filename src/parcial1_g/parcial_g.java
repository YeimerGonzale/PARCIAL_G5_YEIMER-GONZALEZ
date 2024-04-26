//nombtre: Yeimer Jair Gonzalez Collazos    grupo:5   ing de sistemas nocturno
package parcial1_g;

import javax.swing.JOptionPane;


public class parcial_g {
    public static void main(String[] args) {
        int opcion;

        do {
            opcion = mostrarMenu();

            switch(opcion) {
                case 1 -> registrarAutomovil();
                case 2 -> registrarMoto();
                case 3 -> mostrarVendedor();
                case 4 -> JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                default -> JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 4);
    }

    public static int mostrarMenu() {
 
       String menu = """
                    ---CONCESIONARIO DE VEHICULOS DEL CAUCA---
                    --- REGISTRO DE VEHICULO VENDIDOS---\n 
                     
                      1. Registro de automoviles\n
                      
                      2. Registro de motos\n
                      
                      3. Vendedor
                      
                      4. Salir
                      
                      Ingrese su opcion:""";
        return Integer.parseInt(JOptionPane.showInputDialog(null, menu));
    }

    public static void registrarAutomovil() {
     JOptionPane.showMessageDialog(null,"Motor:2000"
             +"\n"+"Frenos: ABS"+"\n"+"Placa:ERS32R");
    }

    public static void registrarMoto() {
        JOptionPane.showMessageDialog(null,
                  "Placa: IQU28G "+"\n"
                + "Modelo: 2023"+"\n"
                + "Motor: 250cc"+"\n"
                + "Potencia: FRZA-10CBllos"+"\n"
                + "Tanque: 20L");
    }

    public static void mostrarVendedor() {
        JOptionPane.showMessageDialog(null, "El nombre completo del estudiante o vendedor  es: [Yeimer Jair Gonzalez Collazos]");
    }
}


package parcial1_g;

public class Automovil {
    public String placa;
    public int modelo;
    public double precio;

    public Automovil(String placa, int modelo, double precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}

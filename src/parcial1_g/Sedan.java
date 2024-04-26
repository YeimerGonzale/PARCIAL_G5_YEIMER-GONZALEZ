
package parcial1_g;

public class Sedan extends Automovil {
      
    public double motor;
    public boolean frenos;

    public Sedan(double motor, boolean frenos, String placa, int modelo, double precio) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
        
         
        }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setFrenos(boolean frenos) {
        this.frenos = frenos;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }

    public void frenosABS() {
        if (frenos) {
            System.out.println("El automóvil tiene frenos ABS");
        } else {
            System.out.println("El automóvil no tiene frenos ABS");
        }
}
}

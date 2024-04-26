
package parcial1_g;


public class Sport extends Moto {
    public  String motor;
    public  String potencia;
    public  String tanque;

   
    public Sport(String placa, int modelo, int cilindraje, String motor, String potencia, String tanque) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    
    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    
    }
   public String motorGarantia() {
        if (motor.equals("4T")) {
            return "La garantía de la moto es por 2 años";
        } else if (motor.equals("monocilindrico")) {
            return "La garantía de la moto es por 1 año";
        } 
    return null;
        }
    }


 
package trimestre2.POO.ejercicio7;

public class CuentaCorriente {
    private String dni;
    private String nombre;
    private double saldo;

    // crear una cuenta
    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
    }
    // ingreso
    public void ingreso(double cantidad) {
        this.saldo = this.saldo + cantidad;

    }
    //sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo = this.saldo - cantidad;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " con Dni: "
                + dni
                + "ntiene de saldo: "+ saldo;
    }
}
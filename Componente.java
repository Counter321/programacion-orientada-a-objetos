package trimestre2.POO.ejercicio8;

public class Componente {
    private String nombre;
    private double peso;

    public Componente() {
    }

    public Componente(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "\nComponente{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}

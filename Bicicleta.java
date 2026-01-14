package trimestre2.POO.ejercicio8;

import java.util.Arrays;

public class Bicicleta {
    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private String nSerie;
    private Componente[] componentes;


    public Bicicleta() {
    }

    public Bicicleta(String marca, String modelo, String color, String tipo, String nSerie, Componente[] componentes) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.nSerie = nSerie;
        this.componentes = componentes;
    }

    public double getSumaPesoComponentes(){
       double sumaTotal= 0;
       for (Componente comp : this.componentes) {
           sumaTotal = sumaTotal + comp.getPeso();

       }
       return sumaTotal;

    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nSerie='" + nSerie + '\'' +
                ", componentes=" + Arrays.toString(componentes) +
                '}';
    }
}

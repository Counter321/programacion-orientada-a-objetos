package trimestre2.POO.ejercicio9;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private int anoNacimiento;
    private double nota;

    public Alumno() {
    }

    public Alumno(String nombre, int anoNacimiento, double nota) {
        this.nombre = nombre;
        this.anoNacimiento = anoNacimiento;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre +" con  nota " +nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return anoNacimiento == alumno.anoNacimiento && Double.compare(nota, alumno.nota) == 0 && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anoNacimiento, nota);
    }

}


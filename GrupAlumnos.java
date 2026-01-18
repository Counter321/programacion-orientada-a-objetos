package trimestre2.POO.ejercicio9;

import java.util.Arrays;
import java.util.Objects;

public class GrupAlumnos {
    private String titulacion;
    private int curso;
    private String turno;
    private Alumno[] alumnos;

    public GrupAlumnos() {
    }

    public GrupAlumnos(String titulacion, int curso, String turno, Alumno[] alumnos) {
        this.titulacion = titulacion;
        this.curso = curso;
        this.turno = turno;
        this.alumnos = alumnos;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "GrupAlumnos{" +
                "titulacion='" + titulacion + '\'' +
                ", curso=" + curso +
                ", turno='" + turno + '\'' +
                ", alumnos=" + Arrays.toString(alumnos) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GrupAlumnos that = (GrupAlumnos) o;
        return curso == that.curso && Objects.equals(titulacion, that.titulacion) && Objects.equals(turno, that.turno) && Objects.deepEquals(alumnos, that.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulacion, curso, turno, Arrays.hashCode(alumnos));
    }

    public Alumno getBestAlumno() {
        Alumno elMejor = this.alumnos[0];

        // Por cada vuelta el for each reccorre la lista del array alumnos y le asigna a la variable
        // a el valor en ese momento de esa posicion
        for (Alumno a : this.alumnos) {
            if (a.getNota() > elMejor.getNota()) {
                elMejor = a; //va comparando y reemplaza el objeto por el que tengas mas nota
            }
        }
        return elMejor;
    }
    public double getEdadMediaAnnos() {
        double sumaEdades = 0;
        final int anioActual = 2026;
        for (Alumno a : this.alumnos) {
            int edad = anioActual-a.getAnoNacimiento();
            sumaEdades = edad + sumaEdades;
        }
        double edadmedia = sumaEdades/this.alumnos.length;
        return edadmedia;
    }
}

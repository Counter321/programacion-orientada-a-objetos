package trimestre2.POO.ejercicio9;

public class MainGrupoAlumnos {
    public static void main(String[] args) {
    Alumno alumno1 = new Alumno("Pepe",2000,5.0);
    Alumno alumno2 = new Alumno("Maria", 2002, 9.5);
    Alumno alumno3 = new Alumno("Juan", 2001, 7.2);
    Alumno alumno4 = new Alumno("Laura", 2000, 6.8);
    Alumno alumno5 = new Alumno("Luis", 2003, 4.5);

   Alumno[] listaclase = {alumno1,alumno2,alumno3,alumno4,alumno5};

   GrupAlumnos migrupo = new GrupAlumnos("Informática",1,"Mañana",listaclase);

   Alumno mejornota = migrupo.getBestAlumno();
   System.out.println("El alumno con mejor nota es:"+mejornota);
   double  media = migrupo.getEdadMediaAnnos();
        System.out.println("La media de edad en años es: "+media+" años");

    }
}

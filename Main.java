package unidad4.ampliacionejercicios.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion ;

        do {
            System.out.println("1¿Quieres dar de alta a un libro?");
            System.out.println("2.¿Quieres dar de alta a un usuario?");
            System.out.println("3.¿Quieres hacer un prestamo?");
            System.out.println("4.¿Quieres hacer una devolucion?");
            System.out.println("5.Mostrar los detalles de los préstamos aun activos");
            System.out.println("6.¿Quieres ver los libros que están en préstamo?");
            System.out.println("7.Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:

                    darDeAltaLibro();
                    break;
                case 2:
                   // AltaUsuario();
                    break;
                case 3:
                    break;
                case 4:
                    //hacerPrestamo();
                    break;
                case 5:
                   // hacerDevolucion();
                    break;
                case 6:
                   // mostrarPrestamosActivos();
                case 7:
                   // NumeroLibrosPrestamo();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;


            }

        } while (opcion != 7);



        }
    public static Libro darDeAltaLibro() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {


            System.out.println("Vamos a recopilar datos del libro");
            System.out.println("Dime su titulo");
            String titulo = sc.nextLine();
            System.out.println("Dime su autor");
            String autor = sc.nextLine();
            System.out.println("Dime su ISBN");
            String isbn = sc.nextLine();
            System.out.println("Dime su numero de paginas");
            int paginas = sc.nextInt();

            Libro libro1 = new Libro();
        }
  return libro1

    }
}

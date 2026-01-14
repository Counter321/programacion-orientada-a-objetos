package trimestre2.POO.ejercicio8;

public class mainBicicletaComponente {
    public static void main(String[] args) {

        Componente[] listacomponentes = new Componente[4];
        listacomponentes[0] = new Componente("Manillar", 1.5);
        listacomponentes[1] = new Componente("Sillín", 2.0);
        listacomponentes[2] = new Componente("Rueda delantera", 3.5);
        listacomponentes[3] = new Componente("Rueda trasera", 3.8);

        Bicicleta bicicleta= new  Bicicleta("orbea","alma","negro","Montaña","12345ABC",listacomponentes);


        System.out.println(bicicleta.toString());
        System.out.println("Peso total "+ bicicleta.getSumaPesoComponentes());

    }
}

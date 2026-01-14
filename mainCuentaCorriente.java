package trimestre2.POO.ejercicio7;

public class mainCuentaCorriente {
        public static void main(String[] args) {
            // 1. Creamos la cuenta (Saldo inicial será 0)
            CuentaCorriente cc = new CuentaCorriente("12345678A", "Pepe");

            // 2. Operaciones iniciales
            cc.ingreso(1200);      // Saldo pasa a 1200
            cc.sacarDinero(388);   // Saldo pasa a 812

            // 3. Mostramos estado actual
            System.out.println(cc.toString());

            // 4. Pruebas usando el método auxiliar de abajo
            sacarDineroCC(cc, 700); // Debería dejar sacar
            sacarDineroCC(cc, 500); // No debería dejar (porque quedaría poco saldo)
        }

        // Método auxiliar que venía en el PDF para probar si deja sacar dinero
        private static void sacarDineroCC(CuentaCorriente cc, int cantidad) {
            if (cc.sacarDinero(cantidad)) {
                System.out.println("Puedo sacar dinero, ahora tengo de saldo: " + cc.getSaldo());
            } else {
                System.out.println("No puedo sacar dinero ya que solo tengo " + cc.getSaldo());
            }
        }
    }



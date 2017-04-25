package tp1ejer3;

import fechas.Fecha;

/**
 *
 * @author Federico
 */
public class Tp1Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha d = new Fecha();
        System.out.println("La fecha es " + d);
        d.capturarFecha(30, 3, 2016);
        System.out.println("La fecha es " + d);

    }

}

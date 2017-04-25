package fechas;

import java.time.LocalDate;

/**
 *
 * @author Federico
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        LocalDate tmp = LocalDate.now();
        dia = tmp.getDayOfMonth();
        mes = tmp.getMonthValue();
        año = tmp.getYear();
    }

    public Fecha(int dia, int mes, int año) {
        if (Fecha.validarFecha(dia, mes, año)) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        } else {
            LocalDate tmp = LocalDate.now();
            this.dia = tmp.getDayOfMonth();
            this.mes = tmp.getMonthValue();
            this.año = tmp.getYear();
        }
    }

    public static boolean validarFecha(int dia, int mes, int año) {
        boolean respuesta = true;
        boolean esBisiesto = ((año % 4) == 0) && ((año % 100) != 0 || (año % 400) == 0);
        if (año == 0) {
            respuesta = false;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                || mes == 8 || mes == 10 || mes == 12) {
            if (dia >= 1 && dia <= 31) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 1 && dia <= 30) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } else if (mes == 2) {
            if (dia >= 1 && dia <= 28) {
                respuesta = true;
            } else if (dia == 29 && esBisiesto) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } else {
            respuesta = false;
        }
        return respuesta;
    }

    public void capturarFecha(int dia, int mes, int año) {
        if (Fecha.validarFecha(dia, mes, año)) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }
    }

    public String mesALetras() {
        String x = "";
        switch (this.mes) {
            case 1:
                x = "Enero";
                break;
            case 2:
                x = "Febrero";
                break;
            case 3:
                x = "Marzo";
                break;
            case 4:
                x = "Abril";
                break;
            case 5:
                x = "Mayo";
                break;
            case 6:
                x = "Junio";
                break;
            case 7:
                x = "Julio";
                break;
            case 8:
                x = "Agosto";
                break;
            case 9:
                x = "Septiembre";
                break;
            case 10:
                x = "Octubre";
                break;
            case 11:
                x = "Noviembre";
                break;
            case 12:
                x = "Diciembre";
                break;
        }
        return x;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    
}

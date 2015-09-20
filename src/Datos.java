
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Datos {

    public static LinkedList<Double> listaDatos = new LinkedList<>();
    public static String[] LimitesRealesDeClase;

    public static double promedio() {
        double r = 0.0;
        if (!listaDatos.isEmpty()) {

            int cantidadDatos = 0;
            double x = 0;

            for (int i = 0; i < listaDatos.size(); i++) {

                x = x + listaDatos.get(i);
                cantidadDatos += 1;
            }
            r = (Double) (x / cantidadDatos);
            System.out.println(" el promedio es " + r);
        } else {
            System.out.println(" no hay numeros para sacar la mediana");

        }
        return r;
    }

    public static void añadirDato(Double x) {
        ordenar();
        listaDatos.add(x);

    }

    public static void mostrarDatos() {
        int cantidad = listaDatos.size();
        for (int i = 0; i < listaDatos.size(); i++) {
            System.out.print("" + listaDatos.get(i));
            if (i < listaDatos.size() - 1) {
                System.out.print("-");
            }
        }
        System.out.println("\n HAY UN TOTAL DE " + cantidad + " DATOS");
    }

    public static void ordenar() {

        Double vec[] = new Double[listaDatos.size()];
        for (int i = 0; i < listaDatos.size(); i++) {
            vec[i] = listaDatos.get(i);
        }

        while (!estaOrdenado()) {

            for (int z = 0; z < vec.length; z++) {
                if (z + 1 < vec.length) {
                    if (vec[z + 1] < vec[z]) {
                        double aux = vec[z];
                        vec[z] = vec[z + 1];
                        vec[z + 1] = aux;
                    }
                }
            }

            listaDatos.clear();

            for (int w = 0; w < vec.length; w++) {
                listaDatos.add(w, vec[w]);
            }

        }

    }

    public static Boolean estaOrdenado() {
        LinkedList l = listaDatos;
        Boolean r = true;
        for (int i = 0; i < l.size(); i++) {
            if (i + 1 < l.size()) {
                if ((Double) l.get(i) > (Double) l.get(i + 1)) {
                    r = false;
                }
            }
        }

        return r;
    }

    public static void tablaFrecuencia(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(cuantosDatosHaySinContarLosRepetidos());
        LinkedList lx = listaDeDatosSinContrarRepeticiones();

        for (int i = 0; i < lx.size(); i++) {

            double valor = (Double) lx.get(i);
            modelo.setValueAt(i + 1, i, 0);
            modelo.setValueAt(valor, i, 1);

            int frecuencia = frecuenciaDeUnDato(valor);
            modelo.setValueAt(frecuencia, i, 2);
        }
        tabla.setModel(modelo);

    }

    public static void tablaLimitesRealesDeClase(JTable tabla) {

        try {
            limitesRealesDeClase();

            int Fi = 0;

            int fi = 0;

            int cantidadDeDatos = listaDatos.size();

            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(LimitesRealesDeClase.length);

            for (int i = 0; i < LimitesRealesDeClase.length; i++) {

                String valor = LimitesRealesDeClase[i];
                modelo.setValueAt(i + 1, i, 0);
                modelo.setValueAt(valor, i, 1);
                //volver a obtener los limites de la cadena
                String limiteActuales[] = LimitesRealesDeClase[i].split("-----");
                double Limferior = Double.parseDouble(limiteActuales[0]);
                double LimSuperior = Double.parseDouble(limiteActuales[1]);
                //calcular xi
                double xi = ((LimSuperior + Limferior) / 2);
                //frecuencia absoluta fi
                fi = frecuenciaDeDatosEnUnRangoSinLosExtremos(Limferior, LimSuperior);
                //frecuencia Acumulada
                Fi = Fi + fi;
                //frecuencia relativa
                double fri = (double) (fi / (double) cantidadDeDatos);

                //frecuencia relativa acumulada
                double Fri = (double) (Fi / (double) cantidadDeDatos);

                modelo.setValueAt(fi, i, 2);
                modelo.setValueAt(Fi, i, 3);
                modelo.setValueAt(fri, i, 4);
                modelo.setValueAt(Fri, i, 5);
                modelo.setValueAt(xi, i, 6);

            }
            tabla.setModel(modelo);

        } catch (Exception e) {
            System.out.println(" ERROR EN EL METODO DE LIMITES REALES");
        }
    }

    public static int cuantosDatosHaySinContarLosRepetidos() {
        int r = 0;
        int contador = 0;
        LinkedList lista = new LinkedList();
        for (int i = 0; i < listaDatos.size(); i++) {
            if (elDatoEstaEnEstaLista(listaDatos.get(i), lista) == false) {
                lista.add(listaDatos.get(i));
                contador += 1;
            }
        }
        r = contador;

        return r;
    }

    public static LinkedList listaDeDatosSinContrarRepeticiones() {

        LinkedList lista = new LinkedList();
        for (int i = 0; i < listaDatos.size(); i++) {
            if (elDatoEstaEnEstaLista(listaDatos.get(i), lista) == false) {
                lista.add(listaDatos.get(i));

            }
        }

        return lista;
    }

    public static void mostrarDatosLista(LinkedList l) {
        System.out.println("_______MOSTRAR DATOS LISTA______");
        for (int i = 0; i < l.size(); i++) {
            System.out.println("" + l.get(i));
        }

    }

    public static boolean elDatoEstaEnEstaLista(Double dato, LinkedList lista) {
        boolean r = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(dato)) {
                r = true;

            }
        }

        return r;
    }

    public static int frecuenciaDeUnDato(Double dato) {
        int r = 0;

        for (int i = 0; i < listaDatos.size(); i++) {
            if (listaDatos.get(i).equals(dato)) {
                r = r + 1;
            }
        }

        return r;

    }

    public static int frecuenciaDeDatosEnUnRangoSinLosExtremos(double extremoI, double extremoS) {
        int r = 0;

        for (int i = 0; i < listaDatos.size(); i++) {
            if ((double) listaDatos.get(i) >= extremoI && (double) listaDatos.get(i) <= extremoS) {

                r = r + 1;

            }
        }

        return r;

    }

    public static void verVector(Double v[]) {
        System.out.println("ver vector-----------------------");
        for (int i = 0; i < v.length; i++) {
            System.out.println("" + v[i]);

        }

    }

    public static void limitesRealesDeClase() {
        ordenar();
        //hallando el rando
        double rango = listaDatos.getLast() - listaDatos.getFirst();
        //aproximando al entero mas proximo para hallar el numero de clases
        String nClases = "" + (1 + Math.log(listaDatos.size()) / Math.log(2));
        BigDecimal aux = new BigDecimal(nClases);
        int parteEntera = aux.intValue();
        String s = aux.toPlainString();
        double redondeo = Double.parseDouble(s);
        double b = redondeo - parteEntera;
        int numeroDeClasesTruncado = 0;
        if (b >= 0.5) {
            numeroDeClasesTruncado = parteEntera + 1;
        } else {
            numeroDeClasesTruncado = parteEntera;
        }

        //fin de la aproximacion al entero mas proximo
        //calculo de la amplitud
        double amplitud = rango / numeroDeClasesTruncado;
        //aproximacion de la aplitud al entero siguiente
        amplitud = (int) amplitud + 1;
        //fin del calculo de la aplitud
        //calcular la unidad de medida

        //fin calculo unidad de medida
        //punto medio unidad de medida
        double pMedio = (unidadDeMedida() / 2);
        System.out.println("P MEDIO " + pMedio);

        //fin del punto medio
        // CALCULO DE LOS LIMITES REALES DE CLASE
        LimitesRealesDeClase = new String[numeroDeClasesTruncado];
        double primerValor = listaDatos.getFirst() - pMedio;
        for (int i = 0; i < numeroDeClasesTruncado; i++) {
            LimitesRealesDeClase[i] = primerValor + "-----" + (primerValor + amplitud);
            primerValor = primerValor + amplitud;
        }
        for (int i = 0; i < LimitesRealesDeClase.length; i++) {
            System.out.println("" + LimitesRealesDeClase[i]);
        }

    }

    public static double unidadDeMedida() {

        double r = 1;
        if (MayorCantidadDeDecimasDeLosDatos() > 0) {
            for (int i = 1; i <= MayorCantidadDeDecimasDeLosDatos(); i++) {
                r = r / 10;
            }
        }

        System.out.println(" LA UNIDAD DE MEDIDA ES DE " + r);
        return r;
    }

    public static int MayorCantidadDeDecimasDeLosDatos() {

        int mayorDecimas = -1;
        for (int i = 0; i < listaDatos.size(); i++) {
            int x = cuantosDecimales(listaDatos.get(i));
            if (x > mayorDecimas) {
                mayorDecimas = x;
            }
        }

        return mayorDecimas;
    }

    public static boolean TieneParteDecimal(double num) {
        boolean r = false;
        double parteDecimal = num - (int) num;

        if (parteDecimal > 0.0) {
            r = true;
        }

        return r;
    }

    public static int cuantosDecimales(double num) {

        int cont = 0;
        int contador = 0;
        String cadenaNumero = "" + num;
        BigDecimal Bnumero = new BigDecimal(cadenaNumero);
        String cadenaParteEntera = "" + Bnumero.intValue();
        BigDecimal BPEntera = new BigDecimal(cadenaParteEntera);
        String cadenaParteDecimal = "" + Bnumero.subtract(BPEntera);
        BigDecimal BparteDecimal = new BigDecimal(cadenaParteDecimal);
        BigDecimal Bcero = new BigDecimal("0.0");
        BigDecimal Bdiez = new BigDecimal("10.0");

        while (BparteDecimal.compareTo(Bcero) != 0) {
            BparteDecimal = BparteDecimal.multiply(Bdiez);
            String CadenaNuevaParteEntera = "" + BparteDecimal.intValue();
            BigDecimal BNuevaPEntera = new BigDecimal(CadenaNuevaParteEntera);
            BparteDecimal = BparteDecimal.subtract(BNuevaPEntera);

            cont += 1;
        }

        return cont;

    }

    public static void DispercionCentralDatosNoAgrupados() {

    }

    public static void DatosAleatorios(int cantidad) {
        String s = "";
        Random r = new Random();
        for (int i = 0; i < cantidad; i++) {
            int n = (int) (r.nextDouble() * 100 + 1);
            s = s + "" + n;
            if (i < cantidad - 1) {
                s = s + ",";
            }

        }
        System.out.println("LOS DATOS ALEATORIOS SON : ");
        System.out.println("" + s);

        //SE INGRESAN LOS DATOS A LA LISTA ENLAZADA PRINCIPAL QUE CONTIENE LOS DATOS
        String Aleatorios[] = s.split(",");

        for (int i = 0; i < Aleatorios.length; i++) {
            listaDatos.add(Double.parseDouble(Aleatorios[i]));

        }
        System.out.println("LA CANTIDAD DE DATOS ALEATORIOS ACTUAL ES DE " + listaDatos.size());

    }

    public static void test() {
        /*double v[] = {2.12, 1.0};

         for (int i = 0; i < v.length; i++) {
         listaDatos.add(v[i]);

         }

         System.out.println(" MAYOR CANTIDAD DE DECIMAS " + MayorCantidadDeDecimasDeLosDatos());
         System.out.println("UNIDAD DE MEDIDA " + unidadDeMedida());
         ¨*/
      
    }

    public static double mediaMuestralDatosNoAgrupados() {

        double X = 0;
        //calculamos la sumatoria de todos los datos ingresados 
        for (int i = 0; i < listaDatos.size(); i++) {
            X = X + listaDatos.get(i);
        }
        //dividimos la sumatoria de todos los datos ingresados entre el numero de datos
        System.out.println("LA SUMATORIA " + X);
        X = X / (double) listaDatos.size();
        System.out.println(" LA MEDIA MUESTRAL ES DE " + X);

        return X;
    }

    public static void main(String[] args) {
        Datos test = new Datos();
        test.DatosAleatorios(37);

        test.mediaMuestralDatosNoAgrupados();

    }

}

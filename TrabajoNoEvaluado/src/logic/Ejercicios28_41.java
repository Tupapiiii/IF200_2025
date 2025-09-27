
package logic;

/**
 *
 * @author alvin
 */
public class Ejercicios28_41 {
    
        // 28) Formato de fecha
    public static void ejercicio28(int dia, int mes, int anio) {
        String[] meses = {"", "enero","febrero","marzo","abril","mayo","junio","julio",
                          "agosto","septiembre","octubre","noviembre","diciembre"};
        System.out.println(dia + " de " + meses[mes] + " del " + anio);
    }

    // 29) Producto por sumas sucesivas
    public static void ejercicio29(int a, int b) {
        int producto = 0;
        for (int i = 0; i < b; i++) {
            producto += a;
        }
        System.out.println("Producto: " + producto);
    }

    // 30) Tablas de multiplicar 1 al 12
    public static void ejercicio30() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    // 31) Cociente y resto por restas sucesivas
    public static void ejercicio31(int dividendo, int divisor) {
        if (divisor == 0) {
            System.out.println("División no definida");
            return;
        }
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        System.out.println("Cociente: " + cociente + ", Resto: " + dividendo);
    }

    // 32) Nota final del curso (ejemplo simple: promedio de 3 notas)
    public static void ejercicio32(int nota1, int nota2, int nota3) {
        int finalNota = (nota1 + nota2 + nota3) / 3;
        System.out.println("Nota final: " + finalNota);
    }

    // 33) Media con centinela -99
    public static void ejercicio33(int[] notas) {
        int suma = 0, contador = 0;
        for (int nota : notas) {
            if (nota == -99) break;
            suma += nota;
            contador++;
        }
        if (contador > 0) {
            System.out.println("Media: " + (suma / (double)contador));
        } else {
            System.out.println("No se ingresaron notas");
        }
    }

    // 34) Suma de N números
    public static void ejercicio34(int[] numeros) {
        int suma = 0;
        for (int n : numeros) suma += n;
        System.out.println("Suma total: " + suma);
    }

    // 35) Número central
    public static void ejercicio35(int a, int b, int c) {
        int central;
        if ((a > b && a < c) || (a < b && a > c)) central = a;
        else if ((b > a && b < c) || (b < a && b > c)) central = b;
        else central = c;
        System.out.println("Número central: " + central);
    }

    // 36) Primera vocal de una palabra
    public static void ejercicio36(String palabra) {
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                System.out.println("Primera vocal: " + c);
                return;
            }
        }
        System.out.println("No tiene vocales");
    }

    // 37) Cantidad de consonantes
    public static void ejercicio37(String palabra) {
        palabra = palabra.toLowerCase();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                contador++;
            }
        }
        System.out.println("Cantidad de consonantes: " + contador);
    }

    // 38) Simplificar fracción
    public static void ejercicio38(int numerador, int denominador) {
        int a = numerador, b = denominador;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        numerador /= a;
        denominador /= a;
        System.out.println("Fracción simplificada: " + numerador + "/" + denominador);
    }

    // 39) Año bisiesto
    public static void ejercicio39(int anio) {
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if (bisiesto) System.out.println(anio + " es bisiesto");
        else System.out.println(anio + " no es bisiesto");
    }

    // 40) Estación climática (versión simplificada: recibe arrays)
    public static void ejercicio40(int[] maximas, int[] minimas) {
        int dias = 0, errores = 0;
        int maxTemp = Integer.MIN_VALUE, minTemp = Integer.MAX_VALUE;

        for (int i = 0; i < maximas.length; i++) {
            if (maximas[i] == -100 && minimas[i] == -100) break;
            dias++;
            if (maximas[i] == 9 || minimas[i] == 9 || minimas[i] > maximas[i]) {
                errores++;
            } else {
                if (maximas[i] > maxTemp) maxTemp = maximas[i];
                if (minimas[i] < minTemp) minTemp = minimas[i];
            }
        }
        double porcentajeErrores = (dias > 0) ? (errores * 100.0 / dias) : 0;
        System.out.println("Días: " + dias);
        System.out.println("Temp máxima: " + maxTemp);
        System.out.println("Temp mínima: " + minTemp);
        System.out.println("Errores: " + errores);
        System.out.println("Porcentaje de errores: " + porcentajeErrores + "%");
    }

    // 41) Divisores de un número
    public static void ejercicio41(int n) {
        System.out.print("Divisores de " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
    
}

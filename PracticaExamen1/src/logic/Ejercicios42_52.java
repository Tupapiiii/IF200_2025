
package logic;

/**
 *
 * @author alvin
 */
public class Ejercicios42_52 {
    
     // 42) Números perfectos menores a 1000
    public static void ejercicio42() {
        System.out.print("Números perfectos menores a 1000: ");
        for (int n = 2; n < 1000; n++) {
            int suma = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) suma += i;
            }
            if (suma == n) System.out.print(n + " ");
        }
        System.out.println();
    }

    // 43) Cantidad de dígitos de un número (considera negativos)
    public static void ejercicio43(int numero) {
        int n = Math.abs(numero);
        int digitos = (n == 0) ? 1 : 0;
        while (n > 0) {
            digitos++;
            n /= 10;
        }
        System.out.println("El número tiene " + digitos + " dígito(s)");
    }

    // 44) Número decimal a romano (hasta 3000)
    public static void ejercicio44(int numero) {
        String[] miles = {"", "M", "MM", "MMM"};
        String[] cientos = {"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] decenas = {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] unidades = {"", "I","II","III","IV","V","VI","VII","VIII","IX"};

        String romano = miles[numero/1000] +
                        cientos[(numero%1000)/100] +
                        decenas[(numero%100)/10] +
                        unidades[numero%10];

        System.out.println("Romano: " + romano);
    }

    // 45) Seno con serie de Taylor (17 términos)
    public static void ejercicio45(double x) {
        double seno = 0;
        int signo = 1;
        for (int i = 1; i <= 17; i++) {
            int exponente = 2 * i - 1;
            double termino = Math.pow(x, exponente) / factorial(exponente);
            seno += signo * termino;
            signo *= -1;
        }
        System.out.println("Seno aproximado: " + seno);
    }

    private static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    // 46) N-ésimo término de Fibonacci (A1=1, A2=2)
    public static void ejercicio46(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }
        if (n == 2) {
            System.out.println("2");
            return;
        }
        int a = 1, b = 2, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Fibonacci " + n + ": " + b);
    }

    // 47) Simulación básica de ascensor
    public static void ejercicio47(int pisoActual, String accion) {
        if (accion.equals("subir") && pisoActual < 25) pisoActual++;
        else if (accion.equals("bajar") && pisoActual > 1) pisoActual--;
        System.out.println("Piso actual: " + pisoActual);
    }

    // 48) Día siguiente de una fecha
    public static void ejercicio48(int d, int m, int a) {
        int[] diasMes = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        // año bisiesto
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) diasMes[2] = 29;

        d++;
        if (d > diasMes[m]) {
            d = 1;
            m++;
            if (m > 12) {
                m = 1;
                a++;
            }
        }
        System.out.println("Día siguiente: " + d + "/" + m + "/" + a);
    }

    // 49) Sueldo neto con deducciones
    public static void ejercicio49(String nombre, int numEmpleado, int horas, double pagoHora, boolean sindicato) {
        double bruto;
        if (horas <= 40) {
            bruto = horas * pagoHora;
        } else {
            bruto = 40 * pagoHora + (horas - 40) * pagoHora * 1.5;
        }
        double deduccion = bruto * 0.09; // seguro social
        if (sindicato) deduccion += bruto * 0.03;
        double neto = bruto - deduccion;

        System.out.println("Empleado: " + numEmpleado + " - " + nombre);
        System.out.println("Salario bruto: " + bruto);
        System.out.println("Deducciones: " + deduccion);
        System.out.println("Salario neto: " + neto);
    }

    // 50) Jornal diario
    public static void ejercicio50(int horas, String turno, boolean domingo) {
        int tarifa;
        if (turno.equals("diurno")) tarifa = 500;
        else tarifa = 800;

        if (domingo) {
            if (turno.equals("diurno")) tarifa += 200;
            else tarifa += 30;
        }
        int jornal = horas * tarifa;
        System.out.println("Jornal diario: " + jornal);
    }

    // 51) Calcular hora dentro de un segundo
    public static void ejercicio51(int h, int m, int s) {
        s++;
        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) h = 0;
            }
        }
        System.out.println("Hora dentro de un segundo: " + h + ":" + m + ":" + s);
    }

    // 52) Dos sumatorias
    public static void ejercicio52(int n, int m) {
        int suma1 = 0;
        for (int x = 0; x <= n; x++) {
            suma1 += 2 * x + 1;
        }

        int suma2 = 0;
        for (int y = 0; y <= m; y++) {
            for (int x = 1; x <= n; x++) {
                suma2 += 2 * x + y * y;
            }
        }

        System.out.println("Σ(2x+1) = " + suma1);
        System.out.println("ΣΣ(2x+y^2) = " + suma2);
    }
}

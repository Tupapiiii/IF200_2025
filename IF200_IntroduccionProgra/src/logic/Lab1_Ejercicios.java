package logic;

/**
 *
 * @author alvin
 */
public class Lab1_Ejercicios {

    public Lab1_Ejercicios() {
    }
    /**
     * Metodo que determmina si un numero es par
     * o impar
     * @param n 
     */
    public void ejercicio1(int n){
        if(n % 2 == 0){
            System.out.println(n + " es par.");
        }else{
            System.out.println(n + " es impar");
            System.out.println("Hola");
        }
    }
    
    /**
     * Metodo para calcular el valor absoluto de
     * un numero
     * @param n 
     */
    public void ejercicio2(int n){
    if(n < 0){
        n = n * - 1;
        }
        System.out.println("Valor absoluto del número es: " + n);
    }
    
    /**
     * Metodo para la suma e impresión del
     * consecutivo 3, 6, 9...99
     */
    public void ejercicio3(){
    int suma = 0;
        for (int i = 3; i <= 99; i = i + 3) {
            System.out.print(i + " ");
            suma = suma + i;
        }
        System.out.println("\nSuma: " + suma);
    }
    
    /**
     * Metodo para la realizacion del orden
     * ascendete de 3 numeros ingresados
     * @param a
     * @param b
     * @param c 
     */
    public void ejercicio4(int a, int b, int c){
    if(a > b){
        int temp = a;
        a = b;
        b = temp;
    }
    if(a > c){
        int temp = a;
        a = c;
        c = temp;
    }
    if(b > c){
        int temp = b;
        b = c;
        c = temp;
    }
        System.out.println("Orden ascendente: " + a + " " + b + " " + c);
    }
    
    /**
     * Metodo para realizar operaciones según lo siguiente:
     * si x = y se realiza multiplicacion
     * si x > y se realiza una resta
     * o si y > x se realiza una suma
     * @param x
     * @param y 
     */
    public void ejercicio5(int x, int y){
    int resultado;
    if(x == y){
        resultado = x * y;
    }else if(x > y){
        resultado = x - y;
    }else{
        resultado = x + y;
    }
        System.out.println("Resultado: " + resultado);
    }
    
    /**
     * Metodo para verificar si hay una nota 10
     * @param notas 
     */
    public void ejercicio6(int[] notas){
    boolean notaDiez = false;
    for(int i = 0; i < notas.length; i++){
        if(notas[i] == - 1){
            break;
        }
        if(notas[i] == 10){
            notaDiez = true;
        }
    }
    if(notaDiez){
        System.out.println("Existe una nota 10");
    }else{
        System.out.println("No existe una nota 10");
        }
    }
    
    /**
     * Metodo para el calculo de las pulsaciones segun la edad y 
     * el sexo de la persona
     * @param sexo
     * @param edad
     */
    public void ejercicio7(String sexo, int edad){
        int pulsaciones;
        if(sexo.equals("F")){
            pulsaciones = (220 - edad) / 10;
        }else{
            pulsaciones = (210 - edad) / 10;
        }
        System.out.println("Pulsaciones: " + pulsaciones);
    }
    
    /**
     * Metodo para calcular la utilidad salarial segun la antiguedad
     * del trabajador
     * @param salario
     * @param antiguedad 
     */
    public void ejercicio8(double salario, int antiguedad){
        double porcentaje;
        double utilidad;
        if(antiguedad < 1){
            porcentaje = 0.05;
        }else if(antiguedad < 2){
            porcentaje = 0.07;
        }else if(antiguedad < 5){
            porcentaje = 0.10;
        }else if(antiguedad < 10){
            porcentaje = 0.15;
        }else{
            porcentaje = 0.20;
        }
        utilidad = salario * porcentaje;
        System.out.println("Utilidad de: " + utilidad);
    }
    
    /**
     * Metodo para determinar si un numero es primo
     * @param n 
     */
    public void ejercicio9(int n){
        boolean esPrimo = true;
        if(n <= 1){
            esPrimo = false;
        }else{
            for (int i = 2; i <= n / 2; i++) {
                if(n % i == 0){
                    esPrimo = false;
                    break;
                }
                
            }
        }
        if(esPrimo){
            System.out.println(n + " es un numero primo");
        }else{
            System.out.println(n + " no es un numero primo");
        }
    }
    
    /**
     * Metodo para calcular el total de descuento sobre una compra
     * de computadoras en base a su cantidad
     * @param cantidad 
     */
    public void ejercicio10(int cantidad){
        double precio = 11000;
        double total = cantidad * precio;
        double descuento;
        if(cantidad < 5){
            descuento = 0.10;
        }else if(cantidad < 10){
            descuento = 0.20;
        }else{
            descuento = 0.40;
        }
        double montoDescuento = total * descuento;
        double pagoTotal = total - montoDescuento;
        System.out.println("Total sin descuento: " + total);
        System.out.println("Monto de descuento en la compra: " + montoDescuento);
        System.out.println("Monto a pagar con el descuento adquirido: " + pagoTotal);
    }
    
    /**
     * Metodo para la generacion de una lista de numeros primos
     * hasta un numero n determinado
     * @param n 
     */
    public void ejercicio11(int n){
        System.out.print("Listado de primos: ");
        for (int i = 2; i <= n; i++) {
            boolean primo = true;
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0){
                    primo = false;
                    break;
                }
                
            }
            if(primo){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    /**
     * Metodo para calcular el area de un triangulo
     * segun su base y altura
     * @param base
     * @param altura 
     */
    public void ejercicio12(double base, double altura){
        double area = (base * altura) / 2;
        System.out.println("Area del triangulo: " + area);
    }
}

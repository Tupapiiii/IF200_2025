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
}

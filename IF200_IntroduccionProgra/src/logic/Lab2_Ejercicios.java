
package logic;

/**
 *
 * @author alvin
 */
public class Lab2_Ejercicios {

    public Lab2_Ejercicios() {
    }
    
    /**
     * Metodo para la suma de los numeros pares
     * entre 2 y 1000
     */
    public void ejercicio1(){
        int suma = 0;
        for (int i = 2; i <= 1000; i+= 2) {
            suma = suma + i;
        }
        System.out.println("Suma de pares: " + suma);
    }
    
    /**
     * Metodo para la conversion de grados
     * celsius a fahrenheit
     * @param celsius 
     */
    public void ejercicio2(double celsius){
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        
    }
    
    /**
     * Metodo para calcular la potencia de 
     * x ^ n
     * @param x
     * @param n 
     */
    public void ejercicio3(int x, int n){
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * x;
            
        }
        System.out.println(x + " elevado a la " + n + " = " + resultado);
    }
    
    /**
     * Metodo para la impresion del mes del año
     * a partir del ingreso del numero correspondiente
     * @param numMes 
     */
    public void ejercicio4(int numMes){
        String mes;
        if(numMes == 1) mes = "Enero";
        else if(numMes == 2) mes = "Febrero";
        else if(numMes == 3) mes = "Marzo";
        else if(numMes == 4) mes = "Abril";
        else if(numMes == 5) mes = "Mayo";
        else if(numMes == 6) mes = "Junio";
        else if(numMes == 7) mes = "Julio";
        else if(numMes == 8) mes = "Agosto";
        else if(numMes == 9) mes = "Septiembre";
        else if(numMes == 10) mes = "Octubre";
        else if(numMes == 11) mes = "Noviembre";
        else if(numMes == 12) mes = "Diciembre";
        else mes = "Mes invalido";
        System.out.println("Mes: " + mes);
    }
    
    /**
     * Metodo para evaluar la funcion f(x)
     * @param x 
     */
    public void ejercicio5(int x){
        int resultado;
        if(x > 0){
            resultado = x + 5;
        }else if(x < 0){
            resultado = x * x;
        }else{
            resultado = 1;
        }
        System.out.println("F(x) = " + resultado);
    }
    
    /**
     * Metodo para calcular el area de un triangulo
     * con 3 lados
     * @param a
     * @param b
     * @param c 
     */
    public void ejercicio6(double a, double b, double c){
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p* (p - a) * (p - b)
        * (p - c));
        System.out.println("Area del triangulo: " + area);
    }
    
    /**
     * Metodo para intercambiar valores entre a y b
     * @param a
     * @param b 
     */
    public void ejercicio7(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Nuevo valor de a: " + a + " nuevo valor de b: "
                + b);
    }
    
    /**
     * Metodo para  calcular la ecuacion de la recta
     * y = mx + b
     * @param x0
     * @param y0
     * @param x1
     * @param y1 
     */
    public void ejercicio8(double x0, double y0,
    double x1, double y1){
        double m = (y1 - y0) / (x1 - x0);
        double b = y0 - (m * x0);
        System.out.println("Ecuacion de la recta y = "
        + m + "x + " + b);
    }
    
    /**
     * Metodo para sumar todos los numeros naturales
     * menores a k
     * @param k 
     */
    public void ejercicio9(int k){
        int suma = 0;
        for (int i = 1; i < k; i++) {
            suma = suma + i;
        }
        System.out.println("Suma de numeros menores a "
        + k + " = " + suma);
    }
    
    /**
     * Metodo para calcular la media(promedio)
     * de un arreglo
     * @param numeros 
     */
    public void ejercicio10(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        double promedio = (double) suma / numeros.length;
        System.out.println("Promedio: " + promedio);
    }
    
    /**
     * Metodo para visualizar la suma de pares
     * y contar pares e impares
     * @param numeros 
     */
    public void ejercicio11(int[] numeros){
        int sumaPares = 0, sumaImpares = 0, pares = 0, impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                sumaPares += numeros[i];
                pares++;
            }else{
                sumaImpares += numeros[i];
                impares++;
            }
        }
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
    
    /**
     * Metodo para calcular la suma de numeros pares
     * e impares entre 1 y 200
     */
    public void ejercicio12(){
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 1; i <= 200; i++) {
            if(i % 2 == 0){
                sumaPares += i;
            }else{
                sumaImpares += i;
            }
        }
        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);
    }
    
    /**
     * Metodo para calcular la suma de los primeros
     * 100 numeros naturales
     */
    public void ejercicio13(){
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += (i * i);
        }
        System.out.println("Suma de cuadrados: " + suma);
    }
    
    /**
     * Metodo para calcular el factorial de n
     * @param n 
     */
    public void ejercicio14(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial de " + n + " = " + factorial);
        
    }
    
    /**
     * Método para calcular el valor maximo de una
     * serie de 10 numeros
     * @param numeros 
     */
    public void ejercicio15(int[] numeros){
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        System.out.println("Valor maximo: " + max);
    }
}

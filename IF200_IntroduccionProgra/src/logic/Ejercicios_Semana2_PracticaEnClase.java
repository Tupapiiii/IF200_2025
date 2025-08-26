package logic;

/**
 *
 * @author alvin
 */
public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }
    
    public void  quiz_A_primos(){
    
    }
    
    public void quiz_B_piramide(int n){
        
        for (int i = 1; i <= n; i++) {
            //Controla los espacios vacios
             for (int j = 1; j <= (n-i); j++) {
                 System.out.print(" ");
            } //end for B
             //controla los * de la piramide
             for (int k = 0; k <= (n * i - 1); k++) {
                 System.out.print("*");
            }
             System.out.println(" ");
        } //end for A
        
    }// end metodo
    
    public void ejercicioA(int n){
//    int n = 5; 
//
//    if (n < 3) { 
//        System.out.println("El tamaño del cuadrado debe ser al menos 3 para mostrar el centro y los bordes.");
//        return;
//    }
//
//    int centro = n / 2; 
//
//    // Primera fila
//    for (int j = 0; j < n; j++) {
//        System.out.print("* ");
//    }
//    System.out.println();
//
//    // Filas intermedias
//    for (int i = 1; i < n - 1; i++) { 
//        System.out.print("* "); 
//
//        for (int j = 1; j < n - 1; j++) { 
//            if (i == centro && j == centro) {
//                System.out.print("* ");
//            } else {
//                System.out.print("  "); 
//            }
//        }
//        System.out.print("* "); 
//        System.out.println();
//    }

//    // Última fila
//    for (int j = 0; j < n; j++) {
//        System.out.print("* ");
//    }
//    System.out.println();
//}
    
         // Primera fila
    for (int j = 0; j < n; j++) {
        System.out.print("* ");
    }
    System.out.println();

    // Filas intermedias
    for (int i = 0; i < n - 2; i++) {
        System.out.print("* "); // primer asterisco
        for (int j = 0; j < n - 2; j++) {
            System.out.print("  "); // espacios
        }
        System.out.print("* "); // último asterisco
        System.out.println();
    }

    // Última fila (solo si n > 1)
    for (int j = 0; j < n; j++) {
        System.out.print("* ");
    }
    System.out.println();

  }
    
    public void ejercicioB(){
    // Número de asteriscos
        int n = 12;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void ejercicioC(){
    //Número de asteriscos
        int n = 9;
        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void ejercicioD(int[] n){
        // orden mediante burbuja
        for (int i = 0; i < n.length - 1; i++) {
            for(int j = 0; j < n.length - 1 - i; j++){
                if(n[j] > n[j + 1]){
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        // muestra del resultado
        System.out.println("Orden ascedente: ");
        for(int num : n){
        System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void ejercicioE(){
    int[] n = new int[100];
    java.util.Random rand = new java.util.Random();
    
    //generación de los numeros aleatorios
        for (int i = 0; i < n.length; i++) {
            n[i] = rand.nextInt(100);
        }
        
        //orden descendente (burbuja)
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1- i; j++) {
                if(n[j] < n[j + 1]){
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        //muestra del resultado
        System.out.println("Orden descendente: ");
        for(int num : n){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void ejercicioF(){
    char[][] tablero = new char[8][8];
    //inicialización del tablero con espacios
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = ' ';
            }
        }
        //fichas negras n en las primeras filas
        for (int i = 0; i < 3; i++) {
            for (int j = (i % 2 == 0) ? 1 : 0; j < 8; j += 2) {
                tablero[i][j] = 'N';
            }
        }
        //fichas rojas r en las ultimas 3 filas
         for (int i = 5; i < 8; i++) {
            for (int j = (i % 2 == 0) ? 1 : 0; j < 8; j += 2) {
                tablero[i][j] = 'R';
            }
        }
        //impresion del tablero
        System.out.println(" 1 2 3 4 5 6 7 8");
        char fila = 'A';
        for (int i = 0; i < 8; i++) {
            System.out.print(fila + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
            fila++;
        }
    }
}

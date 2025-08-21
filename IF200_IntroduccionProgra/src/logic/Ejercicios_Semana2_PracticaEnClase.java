/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    public void ejercicioA(){
     int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.println("* ");
                } else{
                    System.out.println(" ");
                }
                
            }
            System.out.println();
        }
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
    
}

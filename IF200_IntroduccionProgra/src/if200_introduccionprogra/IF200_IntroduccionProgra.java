/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if200_introduccionprogra;
import domain.Person;
import domain.SavingAccount;
import logic.*;
/**
 *
 * @author alvin
 */
public class IF200_IntroduccionProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person client1 = new Person("Alvin", "Gomez", "1-234-567", "33445566", 19);
        SavingAccount account1 = new SavingAccount("2025-09-04", 12, 5, "1000567801",25000, client1);
        
        //Simulation of deposit in the account
        account1.deposit(3000);
        System.out.println(account1.toString());
        
        // Simulation of withdraw in the account
        System.out.println("\n----------------------");
        System.out.println("Withdraw of money");
        System.out.println("-----------------------\n");
        account1.withdraw(15000);
        System.out.println(account1.toString());
        
        // Dta types
        
        //Python
        //print('Hola Mundo');
        
        
        /**
         * Tipos de datos númericos:
         * int, long, short, float,
         * numeric, money, decimal
         * 
         * 
         * Manejo de fecha:
         * Date
         * 
         * Cadenas de caracteres:
         * String, char
         * 
         * Objetos:
         * Object
         * 
         * Data structures
         * Arrays or Vectors: int[] x;
         *                    int[][] y;
         * 
         * True/False
         * boolean
         * 
         */
        
//        Ejercicios_Semana2_PracticaEnClase ej;
//        ej = new Ejercicios_Semana2_PracticaEnClase();
//        ej.quiz_B_piramide(5);
//        System.out.println("EjercicioA: ");
//        ej.ejercicioA(5);
//        System.out.println("Figura B: ");
//        ej.ejercicioB();
//        System.out.println("Figura C: ");
//        ej.ejercicioC();
//        System.out.println("Ejercicio d: ");
//        int[] n = {8, 5, 2, 9, 10, 1, 3};
//        ej.ejercicioD(n);
//        System.out.println("Ejercicio e: ");
//        ej.ejercicioE();
//        System.out.println("\nEjercicio F: ");
//        ej.ejercicioF();

/**
 * Instancia para la prueba de los métodos realizados para el laboratorio 1
 */
//        Lab1_Ejercicios lab;
//        lab = new Lab1_Ejercicios();
//        lab.ejercicio1(2);
//        lab.ejercicio2(-5);
//        lab.ejercicio3();
//        lab.ejercicio4(24, 15, 50);
//        lab.ejercicio5(4, 5);
//        int[] notas = {7, 8, 9, 10, 5, 1};
//        lab.ejercicio6(notas);
//        lab.ejercicio7("M", 24);
//        lab.ejercicio8(500000, 3);
//        lab.ejercicio9(5);
//        lab.ejercicio10(5);
//        lab.ejercicio11(200);
//        lab.ejercicio12(10, 5);
    
//     Lab2_Ejercicios lab2;
//    lab2 = new Lab2_Ejercicios();
    
//    lab2.ejercicio1();
//    lab2.ejercicio2(30);
//    lab2.ejercicio3(3, 5);
//    lab2.ejercicio4(12);
//    lab2.ejercicio5(5);
//    lab2.ejercicio6(5, 7, 8);
//    lab2.ejercicio7(3, 5);
//    lab2.ejercicio8(1, 2, 3, 4);
//    lab2.ejercicio9(10);
//    lab2.ejercicio10(new int[]{5, 10, 15, 20});
//    lab2.ejercicio11(new int[]{2,3,6,8,9,14,17,23,26,30});
//    lab2.ejercicio12();
//    lab2.ejercicio13();
//    lab2.ejercicio14(4);
//    lab2.ejercicio15(new int[]{4, 9, 12, 17, 24, 90, 66, 34, 100, 77});
    
    }
}


package lab_arreglos_practica;

import logic.*;

/**
 *
 * @author alvin
 */
public class Lab_Arreglos_Practica {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        
        Ejercicios_Arreglos ea = new Ejercicios_Arreglos();
        // --- Arreglos unidimensionales ---
        // 1) Suma elementos (5 números)
        int[] arrSuma = {10, 20, 30, 40, 50}; 
        ea.sumaElementos(arrSuma);

        // 2) Menor y mayor (10 números)
        int[] arr10 = {5, 12, -3, 54, 7, 0, 99, 23, -10, 8};
        ea.menorYMayor(arr10);

        // 3) Promedio calificaciones (5 notas)
        int[] notas = {75, 60, 55, 90, 80};
        ea.promedioCalificaciones(notas);

        // 4) Contar pares e impares (10 números)
        int[] arrParesImpares = {1,2,3,4,5,6,7,8,9,10};
        ea.contarParesImpares(arrParesImpares);

        // 5) Invertir arreglo (5 números)
        int[] arrInvertir = {1, 2, 3, 4, 5};
        ea.invertirArreglo(arrInvertir);

        System.out.println("----- MATRICES -----");

        // --- Matrices ---
        // 1) Matriz identidad 3x3
        int[][] I = ea.matrizIdentidad3x3();
        System.out.println("Matriz identidad 3x3:");
        ea.imprimirMatriz(I);

        // 2) Suma de 2 matrices (ejemplo 2x2)
        int[][] A = { {1,2}, {3,4} };
        int[][] B = { {5,6}, {7,8} };
        int[][] C = ea.sumarMatrices(A, B);
        System.out.println("Suma A + B:");
        ea.imprimirMatriz(C);

        // 3) Transpuesta 3x3
        int[][] M3 = { {1,2,3}, {4,5,6}, {7,8,9} };
        System.out.println("Matriz original 3x3:");
        ea.imprimirMatriz(M3);
        int[][] MT = ea.transpuesta3x3(M3);
        System.out.println("Transpuesta 3x3:");
        ea.imprimirMatriz(MT);

        // 4) Diagonales 4x4
        int[][] M4 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12},
            {13,14,15,16}
        };
        ea.diagonales4x4(M4);
    }
    
    
}

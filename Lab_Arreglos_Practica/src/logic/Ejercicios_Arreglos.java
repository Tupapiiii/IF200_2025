
package logic;

/**
 * prueba para revisar push
 * @author alvin
 */
public class Ejercicios_Arreglos {
    
    public Ejercicios_Arreglos(){
    }
    /**
     * ARREGLOS UNIDIMENSIONALES
     */
       

    // 1) Suma elementos (arreglo de 5 enteros)
    public void sumaElementos(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma = suma + arr[i];
        }
        System.out.println("Suma total: " + suma);
    }

    // 2) Mayor y menor en arreglo de 10 números
    public void menorYMayor(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Arreglo vacío");
            return;
        }
        int menor = arr[0];
        int mayor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
            }
            if (arr[i] > mayor) {
                mayor = arr[i];
            }
        }
        System.out.println("Menor: " + menor + ", Mayor: " + mayor);
    }

    // 3) Promedio de 5 calificaciones e indicar aprobado/reprobado
    // Asumo punto de corte: 60 para aprobar (puedes cambiar en main)
    public void promedioCalificaciones(int[] notas) {
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        double promedio = (double) suma / notas.length;
        System.out.println("Promedio: " + promedio);
        if (promedio >= 60) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }

    // 4) Contar pares e impares en un arreglo de 10 números
    public void contarParesImpares(int[] arr) {
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
        }
        System.out.println("Pares: " + pares + ", Impares: " + impares);
    }

    // 5) Invertir arreglo (mostrar original y luego invertido)
    public void invertirArreglo(int[] arr) {
        System.out.print("Original: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Invertido: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ---------------------------
    // MATRICES (2D)
    // ---------------------------

    // 1) Matriz identidad 3x3
    public int[][] matrizIdentidad3x3() {
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) m[i][j] = 1;
                else m[i][j] = 0;
            }
        }
        return m;
    }

    // 2) Suma de 2 matrices (misma dimensión)
    public int[][] sumarMatrices(int[][] A, int[][] B) {
        int filas = A.length;
        int cols = A[0].length;
        int[][] C = new int[filas][cols];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    // 3) Transpuesta de una matriz 3x3
    public int[][] transpuesta3x3(int[][] M) {
        int[][] T = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                T[j][i] = M[i][j];
            }
        }
        return T;
    }

    // 4) Diagonal principal y secundaria de una matriz 4x4
    public void diagonales4x4(int[][] M) {
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(M[i][i] + " ");
        }
        System.out.println();

        System.out.print("Diagonal secundaria: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(M[i][3 - i] + " ");
        }
        System.out.println();
    }

    // Método auxiliar para imprimir matrices (genérico)
    public void imprimirMatriz(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}

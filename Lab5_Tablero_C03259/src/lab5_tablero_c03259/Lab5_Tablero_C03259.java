package lab5_tablero_c03259;

import logic.*;
import java.util.Scanner;
/**
 *
 * @author alvin
 */
public class Lab5_Tablero_C03259 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Juego juego = new Juego();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido a damas Chinas");
        
        while(true){
            Tablero t = juego.getTablero();
            System.out.println(t.toString());
            System.out.println("Turno actual: " + juego.getTurnoActual());
            System.out.print("Ingrese fila origen o 'salir' para terminar: ");
            
            String texto = sc.next();
            if(texto.equalsIgnoreCase("Salir"))break;
            
            int filaOrigen;
            try {
                filaOrigen = Integer.parseInt(texto);
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido, ingrese un numero del 0 al 7 o 'Salir'");
                sc.nextLine();
                continue;
            }
            
            System.out.print("Ingrese la columna de origen: ");
            int colOrigen = sc.nextInt();
            System.out.print("Ingrese la fila de destino: ");
            int filaDestino = sc.nextInt();
            System.out.print("Ingrese la columna de destino: ");
            int colDestino = sc.nextInt();
            
            String resultado = juego.intentarMover(filaOrigen, colOrigen, filaDestino, colDestino);
            
            
            if(resultado.equals("Movimiento realizado con exito")){
                System.out.println("Válidado " + resultado);
                
            }else{
                System.out.println("Invalidado " + resultado);
            }
            
            System.out.println();
        }
        
        System.out.println("Juego finalizado");
        sc.close();
    }
    
}

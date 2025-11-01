
package logic;
import java.util.Scanner;
/**
 *
 * @author alvin
 */
public class ValidadorEntradas {
    
    /**
     * Metodo que se encarga de la lectura por scanner
     * de una cadena no vacia
     * @param sc
     * @param mensaje
     * @return 
     */
    public static String leerNoVacio(Scanner sc, String mensaje){
        String texto;
        do{
            System.out.print(mensaje);
            texto = sc.nextLine().trim();
            if(texto.isEmpty()){
                System.out.println("Error: Este campo no puede quedar vacio.");
            }
        }while(texto.isEmpty());
        return texto;
    }
    
    /**
     * Metodo que realiza la validacion de entrada de valores
     * numeros en formato positivo, mediante repeticiones hasta proporcionar
     * un valor en el rango de numeros positivos
     * @param sc
     * @param mensaje
     * @return 
     */
    public static int leerEnteroPositivo(Scanner sc, String mensaje){
        int num = -1;
        while(num <= 0){
            System.out.print(mensaje);
            String lineaMensaje = sc.nextLine().trim();
            try{
                num = Integer.parseInt(lineaMensaje);
                if(num <= 0){
                    System.out.println("Debe ser un numero positivo");
                }
            }catch (NumberFormatException e){
                System.out.println("Ingrese un numero valido");
            }
        }
        return num;
    }
    
    /**
     * Lectura de correo para verificar que contenga el @
     * @param sc
     * @param mensaje
     * @return 
     */
    public static String leerEmailValido(Scanner sc, String mensaje){
        String correo;
        while(true){
            System.out.println(mensaje);
            correo = sc.nextLine().trim();
            if(!correo.isEmpty() && correo.contains("@")){
                return correo;
            }
            System.out.println("Correo invalido debe contener '@'");
        }
    }
    
    /**
     * Lectura de telefono, para verificar si cumple con los 
     * requerimientos de digitos y tamaño minimo
     * @param sc
     * @param mensaje
     * @return 
     */
    public static String leerTelefonoValido(Scanner sc, String mensaje){
        String telefono;
        while(true){
            System.out.print(mensaje);
            telefono = sc.nextLine().trim();
            if(telefono.length() >= 8 && telefono.matches("\\d+")){
                return telefono;
            }
            System.out.println("Invalido, el telefono debe contener solo numeros"
                    + "y al menos 8 como minimo");
        }
    }
}

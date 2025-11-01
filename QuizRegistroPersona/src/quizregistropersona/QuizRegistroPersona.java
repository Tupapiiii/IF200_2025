
package quizregistropersona;
import java.io.IOException;
import java.util.Scanner;
import logic.*;

/**
 * Clase principal, la cual realiza solicitud de datos
 * por consola, valida, creaa la persona y realiza el guardado 
 * en persona.txt en su formato append
 * @author alvin
 */
public class QuizRegistroPersona {

    public static void main(String[] args) {
        GestionRegistros gestorEntrada = new GestionRegistros();
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Registro de persona");
            
            String nombre = ValidadorEntradas.leerNoVacio(sc, "Nombre completo: ");
            String id = ValidadorEntradas.leerNoVacio(sc, "Identificacion: ");
            int edad = ValidadorEntradas.leerEnteroPositivo(sc, "Edad: ");
            String correo = ValidadorEntradas.leerEmailValido(sc, "Correo electronico: ");
            String telefono = ValidadorEntradas.leerTelefonoValido(sc, "Telefono: ");
            
            Persona persona = gestorEntrada.crearPersona(nombre, id, edad, correo, telefono);
            
            try {
                gestorEntrada.guadarRegistro(persona);
                System.out.println("Registro agregado con exito en persona.txt");
            } catch (IOException e) {
                System.out.println("No se ha guardado el registro, vuelva a intentarlo"
                        + "        " + e.getMessage());
            }
                    
        }
     }
    
}

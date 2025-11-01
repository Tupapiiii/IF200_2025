
package logic;
import java.io.*;
import java.time.LocalDateTime;

/**
 * Clase encargada de la creacion del objeto Persona
 * esto con la fecha actual y el aseguramiento del
 * guardado en el archivo en el formato solicitado
 * "append"
 * @author alvin
 */
public class GestionRegistros {
    
    private static final String ARCHIVO_REGISTRO = "persona.txt";

    public GestionRegistros() {
    }
    
    /**
     * Creacion de una persona con su fecha de registro al momento 
     * de ser llamado
     * 
     * @param nombre
     * @param id
     * @param edad
     * @param correo
     * @param telefono
     * @return 
     */
    public Persona crearPersona(String nombre, String id, int edad, String correo, String telefono){
        return new Persona(nombre, id, edad, correo, telefono, LocalDateTime.now());
    }
    
    /**
     * Guardado de la representacion de la persona en el archivo
     * mediante el try-with-resources
     * 
     * @param persona
     * @throws IOException 
     */
    public void guadarRegistro(Persona persona) throws IOException{
        try(FileWriter fw = new FileWriter(ARCHIVO_REGISTRO, true);
                PrintWriter pw = new PrintWriter(fw)){
            pw.print(persona.formatoArchivo());
        }
    }
}

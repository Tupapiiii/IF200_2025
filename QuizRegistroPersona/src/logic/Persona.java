
package logic;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *Clase que representa los datos de una persona registrada
 * @author alvin
 */
public class Persona {
    
    private String nombre;
    private String id;
    private int edad;
    private String correo;
    private String telefono;
    private LocalDateTime fechaRegistro;
    
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-DD HH:mm");

    /**
     * Constructor con todos los datos necesarios para su registro
     * 
     * @param nombre
     * @param id
     * @param edad
     * @param correo
     * @param telefono
     * @param fechaRegistro 
     */
    public Persona(String nombre, String id, int edad, String correo, String telefono, LocalDateTime fechaRegistro) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
    }
    
    public String formatoArchivo(){
        return "Datos: " + nombre + "|" + id + "|" + edad + "|" + correo
                         + "|" + telefono + "|" + fechaRegistro.format(FORMATO_FECHA);
    }
    
}

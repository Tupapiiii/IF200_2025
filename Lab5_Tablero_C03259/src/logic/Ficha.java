
package logic;

/**
 *
 * @author alvin
 * Representacion de las fichas
 * color R = ROJA y B = NEGRA
 */
public class Ficha {
    /**
     * Atributo de la clase
     */
    private final char color; // 'R' o 'B'
    
    /**
     * Constructor en el que se valida el color de la ficha
     * determinando su validez segun su color asignado
     * @param color 
     */
    public Ficha(char color){
        if(color != 'R' && color != 'B'){
            throw new IllegalArgumentException("Color invalido: " + color);
        }
        this.color = color;
    }
    
    /**
     * LLamado al get de la clase
     * @return 
     */
    public char getColor(){
        return color;
    }
    /**
     * Retorno de la ficha en texto para su muestra en el tablero
     * @return 
     */
    @Override
    public String toString(){
        return String.valueOf(color);
    }
}

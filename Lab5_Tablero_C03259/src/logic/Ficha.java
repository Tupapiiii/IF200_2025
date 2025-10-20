
package logic;

/**
 *
 * @author alvin
 * Representacion de las fichas
 * color R = ROJA y B = NEGRA
 */
public class Ficha {
    
    private final char color; // 'R' o 'B'
    
    public Ficha(char color){
        if(color != 'R' && color != 'B'){
            throw new IllegalArgumentException("Color invalido: " + color);
        }
        this.color = color;
    }
    
    public char getColor(){
        return color;
    }
    
    @Override
    public String toString(){
        return String.valueOf(color);
    }
}

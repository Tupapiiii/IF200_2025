
package logic;

/**
 *
 * @author alvin
 */
public class Juego {
    
    private final Tablero tablero;
    private char turnoActual;
    
    public Juego(){
        tablero = new Tablero();
        turnoActual = 'R';
    }
    
    public Tablero getTablero(){
        return tablero;
    }
    
    public char getTurnoActual(){
        return turnoActual;
    }
    
    public String intentarMover(int filaOrigen, int colOrigen, int filaDestino, int colDestino){
        
        // 1. verificacion de posiciones dentro del tablero
        if(!tablero.estaDentro(filaOrigen, colOrigen) || !tablero.estaDentro(filaDestino, colDestino)){
            return "Las coordenadas están fuera del tablero";
        }
        
        // 2. revision de fichas en la posicion de origen
        Ficha fichaOrigen = tablero.getFicha(filaOrigen, colOrigen);
        if(fichaOrigen == null){
            return "No hay ficha dentro de la posicion de origen o inicio";
        }
        
        // 3. revision de posicion de destino de la ficha
        
        if(tablero.getFicha(filaDestino, colDestino) != null){
            return "Ya exiiste una ficha en la casilla seleccionada";
        }
        
        /**
         * 4. calculo del cambio en filas y columnas
         * dr delta fila = diferencia en filas(toRow - fromRow)
         * dc delta columnas = diferencia en columnas(toCol - fromCol)
         */
        
        int deltaFila = filaDestino - filaOrigen;
        int deltaCol = colDestino - colOrigen;
        
        // 5. validacion de movimiento de casilla en diagonal
        
        if(Math.abs(deltaFila) != 1 || Math.abs(deltaCol) != 1){
            return "Solo se puede mover una casilla en diagonal";
        }
        
        // 6. validar ficha segun color segun turno
        
        char colorFicha = fichaOrigen.getColor();
        if(colorFicha != turnoActual){
            return "El turno no coincide con la ficha, el turno actual es: " + turnoActual;
        }
        
        // 7. validacion de movimiento segun color
        // fichas rojas se mueven hacia abajo
        // fichas negras se mueven hacia arriba
        
        switch(colorFicha){
            case 'R':
                if(deltaFila != 1){
                    return "Fichas rojas con movimiento unicamente hacia abajo";
                }
                break;
            case 'B':
                if(deltaFila != -1){
                    return "Fichas negras con movimiento unicamente hacia arriba";
                }
                break;
                
            default:
                return "Color invalido de la ficha";
        }
        
        // 8. movimiento de la ficha luego de las validaciones
       
        tablero.mover(filaOrigen, colOrigen, filaDestino, colDestino);
        
        // 9. cambiar turno de jugador
        
        turnoActual = (turnoActual == 'R') ? 'B' : 'R';
        
        return "Movimiento exitoso";
    }
}


package logic;

/**
 *
 * @author alvin
 * Tablero 8*8 que guarda fichas en casillas vacias
 * de manera intermitente asignado filas y columnas
 * de 0 a 7 segun su recorrido
 */
public class Tablero {
    
    /**
     * Atributos de la clase
     * con matriz de objeto y un tamaño especificado
     * el cual puede ser cambiado
     */
    private final Ficha[][] celdas;
    private static final int SIZE = 8; //VALOR ESTATICO DEFINIDO SIN CAMBIOS
    
    /**
     * Constructor que incializa las fichas en el tablero, posicionando por el 
     * tamaño del tablero
     */
    public Tablero(){
        celdas = new Ficha[SIZE][SIZE];
        inicializar();
    }
    /**
     * Inicializacion y asignacion de espacios en tablero
     * para cada una de las fichas segun solicitado
     */
    public void inicializar(){
        // matriz de limpieza del tablero
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                celdas[i][j] = null;
            }
        }
        
        // colocacion de fichas negras arriba del tablero
        for(int i = 0; i <= 2; i++){
            for (int j = 0; j < SIZE; j++) {
                if((i + j) % 2 == 1){
                    celdas[i][j] = new Ficha('B');
                }
            }
        }
        
        // colocacion de fichas rojas abajo del tablero
        for (int i = 5; i <= 7; i++) {
            for (int j = 0; j < SIZE; j++) {
                if((i + j) % 2 == 1){
                    celdas[i][j] = new Ficha('R');
                }
            }
        }
    }
    
    /**
     * Obtencion de la ficha en una posicion especifica
     * null si no se encuentra en dicha posicion
     * @param fila
     * @param col
     * @return 
     */
    public Ficha getFicha(int fila, int col){
        if(!estaDentro(fila, col)){
            return null;
        }else{
            return celdas[fila][col];
        }
    }
    
    /**
     * Colocacion de una ficha en una posicion especifica
     * @param fila
     * @param col
     * @param ficha 
     */
    public void setFicha(int fila, int col, Ficha ficha){
        if(!estaDentro(fila, col)) throw new IndexOutOfBoundsException("Fuera del tablero");
        celdas[fila][col] = ficha;
    }
    
    /**
     * Verificacion de las coordenadas dento de los limites del tablero
     * @param fila
     * @param col
     * @return 
     */
    public boolean estaDentro(int fila, int col){
        return fila >= 0 && fila < SIZE &&
                col >= 0 && col < SIZE;
    }
    
    /**
     * Movimiento de la ficha de origen al punto de destino 
     * asumiendo que las validaciones ya fueron correctas para su movimiento
     * @param filaOrigen
     * @param colOrigen
     * @param filaDestino
     * @param colDestino 
     */
    public void mover(int filaOrigen, int colOrigen, int filaDestino, int colDestino){
        Ficha f = getFicha(filaOrigen, colOrigen);
        setFicha(filaDestino, colDestino, f);
        setFicha(filaOrigen, colOrigen, null);
    }
    
    /**
     * Muestra el tablero en su represntacion de texto con filas y columnas 
     * en su formato de muestras al usuario
     * @return 
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("   0 1 2 3 4 5 6 7 \n");
        for(int i = 0; i < SIZE; i++){
            sb.append(i).append("  ");
            for(int j = 0; j < SIZE; j++){
                Ficha f = celdas[i][j];
                sb.append(f == null ? "." : f.getColor());
                if(j < SIZE -1) sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

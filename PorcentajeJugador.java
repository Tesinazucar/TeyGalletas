public class PorcentajeJugador {
    public static void main(String[] args) {
    /* 
    Calcular el porcentaje del nivel de un jugador respecto al nivel maximo
        */
    int maxScore = 500; //el nivel maximo es 500
    int playerScore = 423; 
    
    double porcentaje = (double) playerScore / maxScore * 100.0d ;
     
    System.out.println("El porcentaje del jugador es: " + porcentaje);
    }
}


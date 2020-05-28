public class Apuesta {
    private int numeroJugado;
    private float dineroApostado;
    private int numeroQueSalio;

    public Apuesta(int numeroJugado, float dineroApostado, int numeroQueSalio) {
        this.numeroJugado = numeroJugado;
        this.dineroApostado = dineroApostado;
        this.numeroQueSalio = numeroQueSalio;
    }
    
    public int getNumeroJugado(){
        return numeroJugado;
    }
    
    public int getNumeroQueSalio(){
        return numeroQueSalio;
    }
    
    public float getDineroApostado(){
        return dineroApostado;
    }
}

public class Ruleta {
    private String nombreJugador;
    private Apuesta[] apuesta;
    
    public Ruleta(String nombreJugador, int cantidadApuestas){
        this.nombreJugador = nombreJugador;
        apuesta = new Apuesta[cantidadApuestas];
    }
    
    public void agregarApuesta(Apuesta ap){
        for (int i = 0; i < apuesta.length; i++) {
            if(apuesta[i] == null){
                apuesta[i] = ap;
                break;
            }  
        }
    }
    
    public int cantidadApuestasGanadas(){
        int apuestasGanadas = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if(apuesta[i] != null){
                if(apuesta[i].getNumeroJugado() == apuesta[i].getNumeroQueSalio()){
                    apuestasGanadas++;
                }
            }
        }
        return apuestasGanadas;
    }
    
    public float totalGanado(){
        float totalGanado = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if(apuesta[i] != null){
                if(apuesta[i].getNumeroJugado() == apuesta[i].getNumeroQueSalio()){
                    totalGanado += (apuesta[i].getDineroApostado() * 36);
                }
                else{
                    totalGanado -= apuesta[i].getDineroApostado();
                }
            }
        }
        return totalGanado;
    }
    
    public int vecesQueSalio(int numero){
        int contadorNumero = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if(apuesta[i] != null && apuesta[i].getNumeroQueSalio() == numero){
                contadorNumero++;
            }
        }
        return contadorNumero;
    }
    
    public float sumaNumerosPares(){
        float totalNumerosPares = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if(apuesta[i] != null){
                if(apuesta[i].getNumeroJugado() % 2 == 0){
                    totalNumerosPares += apuesta[i].getDineroApostado();
                }
            }
        }
        return totalNumerosPares;
    }
}

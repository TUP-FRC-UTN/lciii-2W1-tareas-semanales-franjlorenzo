public abstract class Reserva {
    protected int numHabitacion;
    protected int diasReservados;
    protected boolean vigencia;

    @Override
    public abstract String toString();

    public Reserva(int numHabitacion, int diasReservados, boolean vigencia) {
        this.numHabitacion = numHabitacion;
        this.diasReservados = diasReservados;
        this.vigencia = vigencia;
    }
    
    
}

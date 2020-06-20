public class Negocio extends Reserva{
    private boolean conferencia;

    public Negocio(int numHabitacion, int diasReservados, boolean vigencia, boolean conferencia) {
        super(numHabitacion, diasReservados, vigencia);
        this.conferencia = conferencia;
    }

    @Override
    public String toString() {
        return "Negocio \n"
                + "Numero de habitacion: " + numHabitacion + ", Dias reservados: " + diasReservados + ", Vigencia: " + vigencia + ", Conferencia: " + conferencia;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public boolean isVigencia() {
        return vigencia;
    }
    
    
}

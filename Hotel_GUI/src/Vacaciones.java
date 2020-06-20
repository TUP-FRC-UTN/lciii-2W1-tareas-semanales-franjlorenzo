public class Vacaciones extends Reserva{
    private int cantHijos;

    @Override
    public String toString() {
        return "Vacaciones \n"
                + "Numero de habitacion: " + numHabitacion + ", Dias reservados: " + diasReservados + ", Vigencia: " + vigencia + ", Cant hijos: " + cantHijos;
    }

    public Vacaciones(int numHabitacion, int diasReservados, boolean vigencia, int cantHijos) {
        super(numHabitacion, diasReservados, vigencia);
        this.cantHijos = cantHijos;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public boolean isVigencia() {
        return vigencia;
    }
    
    
}

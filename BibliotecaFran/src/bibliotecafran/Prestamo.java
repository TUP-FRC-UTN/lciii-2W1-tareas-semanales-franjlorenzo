package bibliotecafran;

class Prestamo {
    private String solicitante;
    private int cantidadDias;
    private boolean devuelto;
    
    public String getSolicitante(){
        return solicitante;
    }
    
    @Override
    public String toString(){
       return "Solicitante: " + solicitante; 
    }
}

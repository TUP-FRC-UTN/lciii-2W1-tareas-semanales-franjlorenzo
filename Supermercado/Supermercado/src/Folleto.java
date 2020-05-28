public class Folleto {
    private int fechaInicio;
    private Oferta[] oferta;
    
    public Folleto(int fechaInicio, int cantidadOfertas){
        this.fechaInicio = fechaInicio;
        oferta = new Oferta[cantidadOfertas];
    }
    
    public void agregarOferta(Oferta of){
        for (int i = 0; i < oferta.length; i++) {
            if(oferta[i] == null){
                oferta[i] = of;
                break;
            }  
        }
    }
    
    public int cantidadArtOfertados(){
        int cantidadArticulos = 0;
        for (int i = 0; i < oferta.length; i++) {
            if(oferta[i] != null && oferta[i].getDiasOferta() > 5){
                cantidadArticulos++;
            }    
        }
        return cantidadArticulos;
    }
    
    public int totalUnidades(){
        int stockTotal = 0;
        for (int i = 0; i < oferta.length; i++) {
            if(oferta[i] != null){
                stockTotal += oferta[i].getStock();
            } 
        }
        return stockTotal;
    }
    
    public int descuentoSuperior(){
        int descuentoSuperior20 = 0;
        for (int i = 0; i < oferta.length; i++) {
            if(oferta[i] != null){
                if((oferta[i].getPrecioRegular() - oferta[i].getPrecioOferta()) > 20){
                    descuentoSuperior20++;
                }
            }  
        }
        return descuentoSuperior20;
    }
    
    public float totalRecaudado(int codigo){
        int recaudacionTotal = 0;
        for (int i = 0; i < oferta.length; i++) {
            if(oferta[i] != null && oferta[i].getCodigo() == codigo){
                recaudacionTotal += oferta[i].getStock() * oferta[i].getPrecioOferta();
            }  
        }
        return recaudacionTotal;
    }
}

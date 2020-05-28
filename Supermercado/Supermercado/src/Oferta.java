public class Oferta {
    private int codigo;
    private String nombre;
    private float precioRegular;
    private float precioOferta;
    private int diasOferta;
    private int stock;

    public Oferta(int codigo, String nombre, float precioRegular, float precioOferta, int diasOferta, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioRegular = precioRegular;
        this.precioOferta = precioOferta;
        this.diasOferta = diasOferta;
        this.stock = stock;
    }
    
    public int getDiasOferta(){
        return diasOferta;
    }
    
    public int getStock(){
        return stock;
    }
    
    public float getPrecioRegular(){
        return precioRegular;
    }
    
    public float getPrecioOferta(){
        return precioOferta;
    }
    
    public int getCodigo(){
        return codigo;
    }
}

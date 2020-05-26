package fabrica_caños;

public class Material {

    private String descripcionMaterial;
    private int codigo;
    private float valorUnitario;

    public float getValorUnitario() {
        return valorUnitario;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setDescripcionMaterial(String descripcionMaterial){
        this.descripcionMaterial = descripcionMaterial;
    }
    
    public void setValorUnitario(float valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    
    public Material(int codigo, String descripcionMaterial, float valorUnitario){
        this.codigo = codigo;
        this.descripcionMaterial = descripcionMaterial;
        this.valorUnitario = valorUnitario;
    }
}

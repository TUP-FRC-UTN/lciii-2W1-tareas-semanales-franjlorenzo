package fabrica_caños;

public class Producto {

    private String descripcion;
    private Material[] materiales;

    public Producto(String descripcion, int cantElementos) {
        this.descripcion = descripcion;
        materiales = new Material[cantElementos];
    }

    public void agregarMateriales(Material material) {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = material;
                break;
            }
        }
    }

    public float CalculoTotal() {
        float totalCostos = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null){
                totalCostos += materiales[i].getValorUnitario();
            }  
        }
        return totalCostos;
    }
    
    public boolean existeMaterial(int codigo){
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null){
                if(materiales[i].getCodigo() == codigo){
                    return true;
                }
                break;
            } 
        }
        return false;
    }
    
    /*public Material[] menorValor(float valor, int cantElementos){
        float[] menorV;
        menorV = new float[cantElementos];
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null && materiales[i].getValorUnitario() < valor){
                menorV.append(materiales[i].getValorUnitario());
            }
            
        }
    }*/
    
}

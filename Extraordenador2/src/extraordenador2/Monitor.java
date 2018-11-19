package extraordenador2;

/**
 *
 * @author cromerofajar
 */
public class Monitor {
    public Monitor(){}
    
    private String marca;
    private float pulgadas;
    
    public void marcas(String marca){
        this.marca=marca;
        }
    public void tamaño(float pulgadas){
        this.pulgadas=pulgadas;
    }
    public String marca(){
        return marca;
    }
     public float pulgadas(){
        return pulgadas;
    }
}

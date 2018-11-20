package extraordenador3;

/**
 *
 * @author cromerofajar
 */
public class Monitor {
    public Monitor(){}
    
    private String marca;
    private float pulgadas;
    
    public void setMarca(String marca){
        this.marca=marca;
        }
    public void setPulgadas(float pulgadas){
        this.pulgadas=pulgadas;
    }
    public String getMarca(){
        return marca;
    }
     public float getPulgadas(){
        return pulgadas;
    }
}

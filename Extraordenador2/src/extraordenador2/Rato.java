package extraordenador2;

/**
 *
 * @author cromerofajar
 */
public class Rato {
        public Rato(){}
    
    private boolean inhalambrico;
    private String modelo;
    
    public void inhalam (boolean inhalambrico){
        this.inhalambrico=inhalambrico;
    }
    public void model(String modelo){
        this.modelo=modelo;
    }
    public String modelo(){
        return modelo;
    }
    public boolean inhalambrico(){
        return inhalambrico;
    }
}

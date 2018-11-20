package extraordenador3;

/**
 *
 * @author cromerofajar
 */
public class Rato {
        public Rato(){}
    
    private boolean inhalambrico;
    private String modelo;
    
    public void setInhalambrico (boolean inhalambrico){
        this.inhalambrico=inhalambrico;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public boolean getInhalambrico(){
        return inhalambrico;
    }
}

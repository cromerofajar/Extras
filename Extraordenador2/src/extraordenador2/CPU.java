package extraordenador2;

/**
 *
 * @author cromerofajar
 */
public class CPU {
    public CPU(){}
    
    private int nucleos, ram;
    
    public void nucleo (int nucleos){
        this.nucleos=nucleos;
        }
    public void ram(int ram){
        this.ram=ram;
    }
    public int rams(){
        return ram;
    }
    public int nucleos(){
        return nucleos;
    }
    
}

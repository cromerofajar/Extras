package extraordenador3;

/**
 *
 * @author cromerofajar
 */
public class CPU {
    public CPU(){}
    
    private int nucleos, ram;
    
    public void setNucleo (int nucleos){
        this.nucleos=nucleos;
        }
    public void setRam(int ram){
        this.ram=ram;
    }
    public int getRam(){
        return ram;
    }
    public int getNucleo(){
        return nucleos;
    }
    
}

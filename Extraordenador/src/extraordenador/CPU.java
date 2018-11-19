package extraordenador;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class CPU {
    public CPU(){}
    
    private int nucleos, ram;
    
    public void nucleo (){
        nucleos=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de nucleos"));
    }
    public void ram(){
        ram=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca cantidad de ram"));
    }
    public void visualizar(){
        JOptionPane.showMessageDialog(null,"Su CPU:\n"+"  "+nucleos+" nucleos\n"+"  "+ram+"cantidad de ram");
    }
    public int nucleos(){
        return nucleos;
    }
    
}

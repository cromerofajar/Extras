package extraordenador;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Monitor {
    public Monitor(){}
    
    private String marca;
    private float pulgadas;
    
    public void marcas(){
        marca=JOptionPane.showInputDialog(null,"Introduzca la marca");
        }
    public void tamaño(){
        pulgadas=Float.parseFloat(JOptionPane.showInputDialog(null,"Introduzca las pulgadas"));
    }
    public void visualizar(){
        JOptionPane.showMessageDialog(null,"Su Monitor:\n"+"  Es de marca"+marca+"\n  "+ pulgadas +"pulgadas");
    }
     public float pulgadas(){
        return pulgadas;
    }
}

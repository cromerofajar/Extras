package extraordenador;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Rato {
        public Rato(){}
    
    private boolean inhalambrico;
    private String modelo;
    
    public void inhalam (){
        int respuesta=JOptionPane.showOptionDialog(null,"El raton es inhalambrico?","Raton",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
        if (respuesta==1)
            inhalambrico=false;
        else
            inhalambrico=true;
    }
    public void model(){
        modelo=JOptionPane.showInputDialog(null,"Introduzca el modelo");
    }
    public void visualizar(){
        JOptionPane.showMessageDialog(null,"Su Rato:\n"+"  La funcion de inhalambrico "+inhalambrico + "\n  "+modelo+"de modelo");
    }
    public boolean inhalambrico(){
        return inhalambrico;
    }
}

package extraordenador;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Teclado {
    public Teclado(){}
    private int numteclas;

    public void numeroteclas (){
        numteclas=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de teclas"));
    }
    public void visualizar(){
        JOptionPane.showMessageDialog(null,"Su teclado tiene:\n"+"  "+numteclas+" cantidad de teclas");
    }
     public int numteclas(){
        return numteclas;
    }
}

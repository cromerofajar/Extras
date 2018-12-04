package dosultimonumero;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Operaciones {
    int numero,contador,finalNumero;
    public void comprobar(){
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un numero"));
        while(numero!=0){
            finalNumero=numero%10;
            if(finalNumero==2){
                contador++;
            }
             numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un numero"));
        }
        JOptionPane.showMessageDialog(null,"As introducido un total de "+contador+" numeros rematados en 2");
    }
}

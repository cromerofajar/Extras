package extracomprobarcapicua;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Operaciones {
    long numero,digito,invertido,resto,numero2;
    public void comprobar(){
        numero=Long.parseLong(JOptionPane.showInputDialog(null,"Introduzca un numero"));
        numero2=numero;
        while(numero2!=0){
            while(numero2!=0){
        digito=numero2%10;
        invertido=invertido*10+digito;
        numero2=numero2/10;
        }
        if(numero==invertido){
            JOptionPane.showMessageDialog(null,"El numero es capicua");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero no es capicua");
        }
        numero=Long.parseLong(JOptionPane.showInputDialog(null,"Introduzca un numero"));
        numero2=numero;
        digito=0;
        invertido=0;
        }
    }
}

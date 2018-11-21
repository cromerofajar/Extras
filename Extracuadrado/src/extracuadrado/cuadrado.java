package extracuadrado;

import javax.swing.JOptionPane;
import pedirDatos.Datos;

/**
 *
 * @author cromerofajar
 */
public class cuadrado {
    public cuadrado(){}
    Datos lib=new Datos();
    public void dibujarcuadrado(){
    int columna=lib.solicitarInt(Integer.parseInt(JOptionPane.showInputDialog(null,"introduce numero de columnas")));
    int fila=lib.solicitarInt(Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca numero de filas")));
        System.out.println("Cuadrado");
        for(int i=0;i<fila;i++){
            for (int b=0;b<columna;b++){
                System.out.print("*");
            }
        System.out.print("\n");
        }
        System.out.println("\nTriangulo alineado a la derecha");  
        for(int i=fila+1;i>0;i--){
            int c;
            for(c=0;c<2*i-(i+1);c++){
                System.out.print(" ");
            }
            for(int b=c;b<fila+1;b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

} 
} 


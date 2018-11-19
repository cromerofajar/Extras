package extraordenador2;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Ordenador {
    public Ordenador(){}
    
    CPU obxC=new CPU();
    Rato obxR=new Rato();
    Teclado obxT=new Teclado();
    Monitor obxM=new Monitor();
    
    private double precio;
    
    public void introducirAtributos(){
        obxC.nucleo(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de nucleos")));
        obxC.ram(Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca cantidad de ram")));
        int respuesta= JOptionPane.showOptionDialog(null,"El raton es inhalambrico?","Raton",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
        if (respuesta==1)
            obxR.inhalam(false);
        else
            obxR.inhalam(true);
        
        obxR.model(JOptionPane.showInputDialog(null,"Introduzca el modelo"));
        obxT.numeroteclas(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de teclas")));
        obxM.marcas(JOptionPane.showInputDialog(null,"Introduzca la marca"));
        obxM.tamaño(Float.parseFloat(JOptionPane.showInputDialog(null,"Introduzca las pulgadas")));
    }
    
    public void visualizarAtributos(){
        JOptionPane.showMessageDialog(null,"Su ordenador tiene:\n"+"Con CPU de "+obxC.nucleos()+ " nucleos y "+ obxC.rams()+" GB ram\nCon Monitor de marca "+ obxM.marca()+ " y de "+obxM.pulgadas()+" pulgadas\nCon Raton de funcion inhalambrica "+ obxR.inhalambrico()+" y modelo "+obxR.modelo()+"\nCon un teclado de "+obxT.numteclas());
    }
    public void calcularPrezo(){
        double precioCPU,precioRato,precioTeclado,precioMonitor;
        precioCPU=obxC.nucleos()*5;
        if (obxR.inhalambrico()==true){
            precioRato=1.5;
        }
        else {
            precioRato=1;
        }
        precioTeclado=obxT.numteclas()*0.7;
        precioMonitor=obxM.pulgadas()*12;
        precio=precioCPU+precioRato+precioTeclado+precioMonitor;
        JOptionPane.showMessageDialog(null,"El precio es: "+precio);
        
    }
}

package extraordenador;

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
        obxC.nucleo();
        obxC.ram();
        obxR.inhalam();
        obxR.model();
        obxT.numeroteclas();
        obxM.marcas();
        obxM.tamaño();
    }
    
    public void visualizarAtributos(){
        obxC.visualizar();
        obxR.visualizar();
        obxT.visualizar();
        obxM.visualizar();
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

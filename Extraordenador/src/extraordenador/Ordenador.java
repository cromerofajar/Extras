package extraordenador;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Ordenador {
    public Ordenador(){}
    
    CPU procesador=new CPU();
    Rato raton=new Rato();
    Teclado teclado=new Teclado();
    Monitor monitor=new Monitor();
    
    private double precio;
    
    public void introducirAtributos(){
        procesador.nucleo();
        procesador.ram();
        raton.inhalam();
        raton.model();
        teclado.numeroteclas();
        monitor.marcas();
        monitor.tamaño();
    }
    
    public void visualizarAtributos(){
        procesador.visualizar();
        raton.visualizar();
        teclado.visualizar();
        monitor.visualizar();
    }
    public void calcularPrezo(){
        double precioCPU,precioRato,precioTeclado,precioMonitor;
        precioCPU=procesador.nucleos()*5;
        if (raton.inhalambrico()==true){
            precioRato=1.5;
        }
        else {
            precioRato=1;
        }
        precioTeclado=teclado.numteclas()*0.7;
        precioMonitor=monitor.pulgadas()*12;
        precio=precioCPU+precioRato+precioTeclado+precioMonitor;
        JOptionPane.showMessageDialog(null,"El precio es: "+precio);
        
    }
}

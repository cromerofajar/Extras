package extraordenador2;

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
        procesador.nucleo(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de nucleos")));
        procesador.ram(Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca cantidad de ram")));
        int respuesta= JOptionPane.showOptionDialog(null,"El raton es inhalambrico?","Raton",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
        if (respuesta==1)
            raton.inhalam(false);
        else
            raton.inhalam(true);
        
        raton.model(JOptionPane.showInputDialog(null,"Introduzca el modelo"));
        teclado.numeroteclas(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de teclas")));
        monitor.marcas(JOptionPane.showInputDialog(null,"Introduzca la marca"));
        monitor.tamaño(Float.parseFloat(JOptionPane.showInputDialog(null,"Introduzca las pulgadas")));
    }
    
    public void visualizarAtributos(){
        JOptionPane.showMessageDialog(null,"Su ordenador tiene:\n"+"Con CPU de "+procesador.nucleos()+ " nucleos y "+ procesador.rams()+" GB ram\nCon Monitor de marca "+ monitor.marca()+ " y de "+monitor.pulgadas()+" pulgadas\nCon Raton de funcion inhalambrica "+ raton.inhalambrico()+" y modelo "+raton.modelo()+"\nCon un teclado de "+teclado.numteclas());
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

package extraordenador3;

import javax.swing.JOptionPane;
import pedirDatos.Datos;

/**
 *
 * @author cromerofajar
 */
public class Ordenador {
    public Ordenador(){}
    Datos lib=new Datos();
    
    CPU procesador=new CPU();
    Rato raton=new Rato();
    Teclado teclado=new Teclado();
    Monitor monitor=new Monitor();
    
    int nucleos,respuesta,nteclas,ram;
    String marca,modelo;
    float pulgadas;
    boolean inhalambrico;
    
    private double precio;
    
    public void introducirAtributos(){
        procesador.setNucleo(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de nucleos")));
        nucleos=lib.solicitarInt(procesador.getNucleo());
        procesador.setRam(Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca cantidad de ram")));
        ram=lib.solicitarInt(procesador.getRam());
        respuesta=lib.solicitarInt(JOptionPane.showOptionDialog(null,"El raton es inhalambrico?","Raton",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null));
        if (respuesta==1)
            inhalambrico=lib.solicitarBoolean(false);
        else
            inhalambrico=lib.solicitarBoolean(true);
        
        raton.setModelo(JOptionPane.showInputDialog(null,"Introduzca el modelo"));
        modelo=lib.solicitarString(raton.getModelo());
        teclado.setNumTeclas(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de teclas")));
        nteclas=lib.solicitarInt(teclado.getNumTeclas());
        monitor.setMarca(JOptionPane.showInputDialog(null,"Introduzca la marca"));
        marca=lib.solicitarString(monitor.getMarca());
        monitor.setPulgadas(Float.parseFloat(JOptionPane.showInputDialog(null,"Introduzca las pulgadas")));
        pulgadas=lib.solicitarFloat(monitor.getPulgadas());
    }
    
    public void visualizarAtributos(){
        JOptionPane.showMessageDialog(null,"Su ordenador tiene:\n"+"Con CPU de "+nucleos+ " nucleos y "+ ram +" GB ram\nCon Monitor de marca "+ marca+ " y de "+pulgadas+" pulgadas\nCon Raton de funcion inhalambrica "+ inhalambrico +" y modelo "+modelo+"\nCon un teclado de "+nteclas);
    }
    public void calcularPrezo(){
        double precioCPU,precioRato,precioTeclado,precioMonitor;
        precioCPU=nucleos*5;
        if (inhalambrico==true){
            precioRato=1.5;
        }
        else {
            precioRato=1;
        }
        precioTeclado=nteclas*0.7;
        precioMonitor=pulgadas*12;
        precio=precioCPU+precioRato+precioTeclado+precioMonitor;
        JOptionPane.showMessageDialog(null,"El precio es: "+precio);
        
    }
}

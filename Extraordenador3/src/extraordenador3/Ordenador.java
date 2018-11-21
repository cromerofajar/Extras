package extraordenador3;

import javax.swing.JOptionPane;
import pedirDatos.Datos;

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
    
    int nucleos,respuesta,nteclas,ram;
    String marca,modelo;
    float pulgadas;
    boolean inhalambrico;
    
    private double precio;
    
    public void introducirAtributos(){
        procesador.setNucleo(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de nucleos")));
        nucleos=Datos.solicitarInt(procesador.getNucleo());
        procesador.setRam(Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca cantidad de ram")));
        ram=Datos.solicitarInt(procesador.getRam());
        respuesta=Datos.solicitarInt(JOptionPane.showOptionDialog(null,"El raton es inhalambrico?","Raton",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null));
        if (respuesta==1)
            inhalambrico=Datos.solicitarBoolean(false);
        else
            inhalambrico=Datos.solicitarBoolean(true);
        
        raton.setModelo(JOptionPane.showInputDialog(null,"Introduzca el modelo"));
        modelo=Datos.solicitarString(raton.getModelo());
        teclado.setNumTeclas(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de teclas")));
        nteclas=Datos.solicitarInt(teclado.getNumTeclas());
        monitor.setMarca(JOptionPane.showInputDialog(null,"Introduzca la marca"));
        marca=Datos.solicitarString(monitor.getMarca());
        monitor.setPulgadas(Float.parseFloat(JOptionPane.showInputDialog(null,"Introduzca las pulgadas")));
        pulgadas=Datos.solicitarFloat(monitor.getPulgadas());
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

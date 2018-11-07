
package ejercicionotas;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Calculos {
    Scanner ler=new Scanner(System.in);
    private int nota;
    private float notaT;
    private float notaE;
    private float notaP;
    private float notaB;
    public Calculos (){}
    
    public void introducirNotaExame(){
        System.out.println("Introduzca nota exame:");
        int contadorE;
        float notas=0;
        for(contadorE=0;contadorE<2;contadorE++){ //Iniciamos un for con la cantidad de exames.
            int sumar=ler.nextInt();
           while(sumar <=0||sumar>10){ //En caso de poner una nota que no este entre 1 y 10 nos pedira introducir la nota nuevamente hasta que este entre estos.
            System.out.println("Introduzca cifra entre 1 y 10.");
            sumar=ler.nextInt();
           }
            notas=notas+sumar;
            notaE=(notas/2)*40/100; //Calculamos el porcentaje de la nota de los examenes.
        }
                    System.out.println("Su nota de examenes es:"+notaE); //Visualizamos la nota final de los examenes
    }
    
    public void introducirNotaProyec(){
                System.out.println("Introduzca nota proyecto:");
           float sumar=ler.nextInt();
           while(sumar<=0||sumar>10){ //Al ser un solo proyecto validamos directamente a que su nota este entre 1 y 10 en caso de no estar la pedira de nuevo.
            if(sumar <=0||sumar>10){
            System.out.println("Introduzca cifra entre 1 y 10.");
            sumar=ler.nextInt();
            }}
            notaP=sumar*40/100;
            
           System.out.println("Su nota de proyecto es:"+ notaP); //Visualizamos la nota final del boletin.
        }
    
    public void introducirNotaBoletines(){
        int entregado;
        int total;
        int porcentaje;
            System.out.println("Introduzca la cantidad total de boletines"); 
            total=ler.nextInt();    //Solicitamos la cantidad de boletines.
            System.out.println("Introduzca la cantidad que entrego"); 
            entregado=ler.nextInt();    //Solicitamos la cantidad entregada de boletines por el alumno.
            
            porcentaje=entregado*100/total; //Calculamos el porcentaje de boletines entregados.
            if(porcentaje>=90){ //Segun sea su variable ponemos la nota correspondiente.
                notaB=2;
            }
            else if(porcentaje>=70){
                notaB=1;
            }
            else {notaB=0;
            } 

        System.out.println("Su nota de boletines es:"+notaB);   //Nos mostraria la nota correspondiente a los boletines.
    }
    
    public void calcularNota(){
        System.out.println("Introduzca cantidad de alumnos:");
        int contador;
        int alumnos=ler.nextInt(); //Nos pide introducir la cantidad de alumnos.
         for(contador=0;contador<alumnos;contador++){ //Segun la cantidad de alumnos nos realiza el for dicha cantidad de veces.
        introducirNotaExame(); //Llamamos a los metodos.
        introducirNotaProyec();
        introducirNotaBoletines();
        notaT=notaE+notaP+notaB; //Sumamos las notas.
        nota=(int)Math.round(notaT); //Redondeamos la nota.
        System.out.println("La nota total del alumno es:"+nota);    //Visualizamos la nota final.
    }
    }
}
    
    


//RAFAEL MONCLOVA SUANO

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquiler;

import java.util.Scanner;

/**
 *
 * @author ismae
 */
public class EmpresaAlquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner SC = new Scanner(System.in);
        Vehiculo vehiculoAlquiler;
        
        System.out.println("introduce el tipo de Vehículo");
        String nTipoVehiculo =SC.nextLine();  
              
        //Segun el tipo de vehiculo que indiquemos, se creará coche, moto u otro(vehiculo por defecto)
        switch (nTipoVehiculo){
            
            case "coche":
                vehiculoAlquiler=new Coche();
            break;
            case "moto":
                vehiculoAlquiler=new Moto();
            break;
            default:
                vehiculoAlquiler=new Vehiculo();
            break;    
        }
        
        
              
        System.out.println("introduce el número de horas");
        int horas =SC.nextInt();
        int coste=0;  
        //El metodo calculaPrecio() realiza el calculo dependiendo del tipo de vehiculo automaticamente
        coste = vehiculoAlquiler.calculaPrecio() * horas;
           
        vehiculoAlquiler.imprimir_extendido();
        System.out.println("El coste es "+coste);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquiler;
//RAFAEL MONCLOVA SUANO
/**
 *
 * @author ismae
 */
public class Vehiculo {
    //Los tipos de vehículo serán subclases de la clase vehículo(SWITCH y LONG CLASS)
    
    //por defecto los vehículos son uniplaza excepto que sean coches o motos
    protected int plazas;

//EL vehiculo por defecto tendrá 1 plaza    
public Vehiculo(){
    plazas = 1;
}


public int getPlazas() {
return plazas;
}
public void imprimir_Basico(){

System.out.print("PLAZAS");  
System.out.print(plazas);
}

//Cada clase hija reescribe el metodo (SWITCH)
public int calculaPrecio(){
    return 10;
}

public void imprimir_extendido(){
//Podemos reutilizar el imprimir_basico() (CÓDIGO DUPLICADO y LONG METHOD)
    imprimir_Basico();
    System.out.println("PRECIO: "+calculaPrecio());

}

    
}

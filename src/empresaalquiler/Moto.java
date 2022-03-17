/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquiler;
//RAFAEL MONCLOVA SUANO
/**
 *
 * @author alumno
 */
public class Moto extends Vehiculo{

    public Moto() {
        super.plazas = 2;
    }
    
    @Override
    public int calculaPrecio(){
        return 15;
    }
    
    @Override
    public void imprimir_Basico(){
        System.out.println("MOTO");
        super.imprimir_Basico();
    }
    
    @Override
    public void imprimir_extendido(){
    //Podemos reutilizar el imprimir_basico() (CÓDIGO DUPLICADO)
        imprimir_Basico();
        System.out.println("PRECIO: "+calculaPrecio());

    }
    
    
    
}

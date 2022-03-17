//RAFAEL MONCLOVA SUANO
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquiler;

/**
 *
 * @author alumno
 */
public class Coche extends Vehiculo{

    public Coche() {
        super.plazas = 5;
    }
    
    @Override
    public int calculaPrecio(){
        return 60;
    }
    
    @Override
    public void imprimir_Basico(){
        System.out.println("COCHE");
        super.imprimir_Basico();
    }
    
    @Override
    public void imprimir_extendido(){
    //Podemos reutilizar el imprimir_basico() (CÓDIGO DUPLICADO)
        imprimir_Basico();
        System.out.println("PRECIO: "+calculaPrecio());

    }
    
}

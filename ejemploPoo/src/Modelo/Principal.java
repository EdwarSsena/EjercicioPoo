
package Modelo;


public class Principal {
    //metodos constructor
    public static void main(String()args){
        vhiculo objTaxi = vehiculo ("EDO9FA", "2006", " Azul");
        objTaxi.imprimirDatos();
        String auxcolor = objTaxi.getColor();
        System.out.println("El color es : "+ auxcolor);
        
        vehiculo objBus = new vehiculo (" YYY099", "Ford", "Negro");
        objBus.implements ();
        String auxColor2 = objBus.getColor();
        System.out.println("El color es: "+auxColor2);
        
    }
    
}

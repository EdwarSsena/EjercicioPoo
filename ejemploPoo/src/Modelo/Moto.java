
package Modelo;

import java.time.chrono.ThaiBuddhistEra;




public class Moto extends vehiculo{
    private int cantidadCauchos;
    
    public Moto (String datoPlaca, String datoModelo, String datoColor, int datoCauchos);
    super (datoPlaca, datoModelo, datoColor);
    this.cantidadCauchos = datoCauchos;
}

public int getCauchos(){
return this.cantidadCauchos;
}
public void sentCantidadCauchos(int datoCantidad){
this.CantidadCauchos = datoCantidad;
}
public void imprimirDatos(){
super.imprimirDatos();
System.out.println("Color es: "+ super.getColor());
System.out.printIn("Cantidad de Cauchos es: "+ this.cantidadCauchos);
}


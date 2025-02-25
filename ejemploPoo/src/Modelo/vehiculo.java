
package Modelo;


public class vehiculo {
    //Se inicializan o declaran las variables
    private static String Placa;
    private static String Modelo;
    private String Color;

  // crea el contructor con parametros
    public vehiculo(String datoPlaca; String datoModelo; String datoColor){
    
    //se asignan los datos
    vehiculo.Placa = datoPlaca;
    vehiculo.Modelo = datoModelo;
    this.Color = datoColor;
}
    //metodo manejar
    public String getColor(){
        String auxColor = this.Color;
        return auxColor;
    }
    //metodo que maneja el encapsulamiento
    public void setColor (String datoColor){
        this.Color = datoColor;
        
    }
    //Crear metodo de imprimir datos
    public void imprimirDatos(){
        System.out.println("Placa es:  "+vehiculo.Placa);
        System.out.println("Modelo es:  "+ vehiculo.Modelo);
        
    }
}

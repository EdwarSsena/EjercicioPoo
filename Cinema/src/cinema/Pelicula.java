
package cinema;


public class Pelicula {
private String titulo;
private String director;
private int duracion; //cuanto puede durar la pelicula

public Pelicula(String titulo, String director, int duracion){
    this.titulo = titulo;
    this.director = director;
    this.duracion = duracion;
}
//Getter y Setter
public String getTitulo(){
    return titulo;
}
public void setTitulo(String titulo){
    this.titulo = titulo;
}
public String getDirector(){
    return director;
}
public void setDirector(String director){
    this.director = director;
}
public int getDuracion(){
    return duracion;
}
public void setDuracion(int duracion){
    this.duracion = duracion;
}
}

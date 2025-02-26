
package cinema;


class cantidadSillas {
    private int totalSillas;
    private int sillasDisponibles;
    
    public cantidadSillas(int totalSillas){
        this.totalSillas = totalSillas;
        this.sillasDisponibles = totalSillas;
    }
    public int getTotalSillas(){
        return totalSillas;
    }
    public int getSillasDisponibles(){
        return sillasDisponibles;
    }
    public void reservarSilla(){
        if(sillasDisponibles > 0){
            sillasDisponibles--;
        }else{
            System.out.println("No hay sillas disponibles para reservar ");
        }
    }
        public void  liberarSilla(){
            if(sillasDisponibles < totalSillas){
            sillasDisponibles++;
        }else{
                System.out.println("la silla esta ocupada ");
            }
    }
}


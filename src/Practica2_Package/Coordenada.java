package Practica2_Package;

/**
 *
 * @author manidmt
 */

public class Coordenada {
 
    private int fila, columna;
    
    public Coordenada(int fila, int columna){
        
        this.fila = fila; this.columna = columna;
    }
    
    public int getFila(){                   return fila;}
    
    public int getColumna(){                return columna;}
    
    public void setFila(int fila){          this.fila = fila;}
    
    public void setColumna(int columna){    this.columna = columna;}
    
    public Boolean equals(Coordenada pos){
        
        return this.fila == pos.getFila() && this.columna == pos.getColumna();
    }    
}

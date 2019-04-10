/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

/**
 *
 * @author Youness
 */
public class Caballo 
{
private Color color;
private Posicion posicion;

    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Caballo(){
        this.color=Color.NEGRO;
        this.posicion= new Posicion(8,'b');
    }
    public Caballo(Color color){
        if(color==Color.BLANCO)
            this.color=color;
            this.posicion= new Posicion(1,'b');
        if(color==Color.NEGRO)
            this.color=color;
            this.posicion= new Posicion(8,'b');
    }     
    public Caballo(Color color, char columna){
        
        if(columna=='b' || columna=='g'){
            
            if(color==Color.BLANCO){
            this.color=color;
            this.posicion= new Posicion(1,columna);}
            else{
                this.color=color;
                this.posicion= new Posicion(8,columna);
            }
        } else throw new IllegalArgumentException("ERROR: Has pasado un parametro nulo");
                    }
    public Caballo(Caballo Caballo1){
        if(Caballo1==null)
        throw new IllegalArgumentException("ERROR: No es posible copiar un caballo nulo.");
        else
        this.color=Caballo1.color;
        this.posicion=Caballo1.posicion;

    }
            }
        
       
   
    
        
    


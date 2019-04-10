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

}

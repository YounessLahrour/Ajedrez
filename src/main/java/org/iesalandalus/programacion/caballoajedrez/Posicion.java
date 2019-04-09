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
public class Posicion 
{
    private int fila;
    private char columna;

    public int getFila() {
        return fila;
    }
    public char getColumna() {
        return columna;
    }
    public void setFila(int fila) {
        if(fila<1 || fila>8)
            throw new IllegalArgumentException("ERROR: Fila no válida.");
        else
        this.fila = fila;
    }

    public void setColumna(char columna) {
        if(columna<'a' || columna>'h')
            throw new IllegalArgumentException("ERROR: Columna no válida.");
        else
        this.columna = columna;
    }
    
    public Posicion(int fila, char columna){
        this.fila=fila;
        this.columna=columna;
    } 
    
    public Posicion(Posicion Posicion1)
    {
        this.fila=Posicion1.fila;
        this.columna=Posicion1.columna;    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Posicion other = (Posicion) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[fila=" + fila + ", columna=" + columna + ']';
    }
    
    
}

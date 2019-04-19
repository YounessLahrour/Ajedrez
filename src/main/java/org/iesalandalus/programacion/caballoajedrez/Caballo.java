/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

import java.util.Objects;
import javax.naming.OperationNotSupportedException;

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
    public Caballo(Color color)
    {
        if(color==null) throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
            this.color=color;
            
        if(color==Color.BLANCO)
            this.color=color;
            this.posicion= new Posicion(1,'b');
        if(color==Color.NEGRO)
            this.color=color;
            this.posicion= new Posicion(8,'b');
    }     
    public Caballo(Color color, char columna)
    {
       if (color==null) throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo."); 
        
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
    
    public void mover(Direccion nuevaDireccion) throws OperationNotSupportedException
    {
      int fila=posicion.getFila();
      int nuevaFila;
      char columna=posicion.getColumna();
      char nuevaColumna;
      
      try{
      
          switch(nuevaDireccion)
          {
              case ARRIBA_IZQUIERDA:
                  nuevaFila=fila+2;
                  nuevaColumna=(char)(columna-1);
                  posicion.setFila(nuevaFila);
                  posicion.setColumna(nuevaColumna);
                  
              break;
              
              case ARRIBA_DERECHA:
                  nuevaFila=fila+2;
                  nuevaColumna=(char)(columna+1);
                  posicion.setFila(nuevaFila);
                  posicion.setColumna(nuevaColumna);
              break;
              
              case DERECHA_ABAJO:
                  nuevaFila=fila-1;
                  nuevaColumna=(char)(columna+2);
                  posicion.setFila(nuevaFila);
                  posicion.setColumna(nuevaColumna);
              break;
                  
              case DERECHA_ARRIBA:
                  nuevaFila=fila+1;
                  nuevaColumna=(char)(columna+2);
                  posicion.setFila(nuevaFila);
                  posicion.setColumna(nuevaColumna);
              break;    
                
              case IZQUIERDA_ABAJO:
                  nuevaFila=fila-2;
                  nuevaColumna=(char)(columna-1);
                  posicion.setFila(nuevaFila);
                  posicion.setColumna(nuevaColumna);
              break;  
              
              case IZQUIERDA_ARRIBA:
                  nuevaFila=fila-2;
                  nuevaColumna=(char)(columna+1);
                  posicion.setFila(nuevaFila);
                  posicion.setColumna(nuevaColumna);
              break;
              
              case ABAJO_DERECHA:
                  nuevaFila=fila-2;
                  nuevaColumna=(char)(columna+1);
                  posicion.setFila(nuevaFila);
                  posicion.setColumna(nuevaColumna);
              break;
              
              case ABAJO_IZQUIERDA:
                  nuevaFila=fila-2;
                  nuevaColumna=(char)(columna-1);
                  posicion.setFila(nuevaFila);
                  posicion.setColumna(nuevaColumna);
              break;
              default:
                  throw new OperationNotSupportedException("Movimiento erróneo");
          }
          }catch (IllegalArgumentException e) 
          {
            posicion.setColumna(columna);
            posicion.setFila(fila);
            throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
           }
              
          }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.color);
        hash = 79 * hash + Objects.hashCode(this.posicion);
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
        final Caballo other = (Caballo) obj;
        if (this.color != other.color) {
            return false;
        }
        if (!Objects.equals(this.posicion, other.posicion)) {
            return false;
        }
        return true;
    }
        
    }
    
            
        
       
   
    
        
    


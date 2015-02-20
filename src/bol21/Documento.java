/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol21;

/**
 *
 * @author Administrador
 */
public class Documento {
    String contenido;
    int numCop;

    public Documento() {
    }

    public Documento(String contenido, int numCop) {
        this.contenido = contenido;
        this.numCop = numCop;
    }

    public String getContenido() {
        return contenido;
    }

    public int getNumCop() {
        return numCop;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setNumCop(int numCop) {
        this.numCop = numCop;
    }

    @Override
    public String toString() {
        return   "El mensaje es =" + contenido + ", Numero de Copias=" + numCop ;
    }
     public void TantasVeces(int x) {
         for (int i = 0; i < x; i++) {
             System.out.println( "El mensaje es =" + contenido)  ;
    }
           
}
}
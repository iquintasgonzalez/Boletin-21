/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol21;

/**
 *
 * @author iquintasgonzalez
 */
public class metodos {

    public void visualizar(Documento uno) {
        for (int i = 0; i < uno.numCop; i++) {
            System.out.println("El mensaje es =" + uno.contenido);
        }
    }
  
}

package bol21;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Bol21 {
    
    public static void main(String[] args) {
        
        metodos doc = new metodos();
        
        ArrayList<Documento> cola = new ArrayList<Documento>();
        for (int i = 0; i < 3; i++) {
            
            String dato = JOptionPane.showInputDialog("introducir datos");
            String num = JOptionPane.showInputDialog("introducir num copy");
            int numCopias = Integer.parseInt(num);
            cola.add(new Documento(dato, numCopias));
            
        }
        
      
        System.out.println(cola.toString());
        
        for (int i = 0; i < 3; i++) {
            
        }
        for (int i = 0; i < 3; i++) {
            
        doc.visualizar(cola.get(0));
        cola.remove(0);
        
        
        }
        
    }
    
}


package Proyecto;


import java.util.Scanner;
import javax.swing.JOptionPane;


public class Banco {
    
    private boolean continuar = true;
    
    Scanner in = new Scanner(System.in);
    
    
    public void MostrarMenu(){
        
      while(continuar){
          String menu = "SISTEMA BANCARIO\n "+
                  "1. Crear cuenta \n"+
                  "2. Ingresar a la cuenta \n"+
                  "3. Eliminar cuenta \n"+
                  "4. cambiar contraseña \n"+
                  "5. Salir del sistema \n";
                  int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
                  
                  switch(op){
                      case 1:
                          
                          break;
                  }
      } 
    }
    
}

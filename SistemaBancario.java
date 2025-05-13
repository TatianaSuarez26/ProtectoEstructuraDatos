
package Proyecto;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class SistemaBancario {
    
    protected Sistema[][] cuentas;
    private int contador = 0;
    private Queue <Transaccion> transaccionPendiente = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    public void CrearCuenta(Sistema cuenta){
        
        if(contador < cuentas.length){
            StringBuilder usuario = sb.append(JOptionPane.showInputDialog("Ingrese el nombre"));
            
            
        }
    }
}

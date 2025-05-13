
package Proyecto;

import java.util.Stack;

public class Transaccion {
    private Sistema cuenta;
    private double monto;
    private String tipo;
    public Stack<Transaccion> historial = new Stack<>();
    
    public Transaccion (Sistema cuenta, double monto, String tipo) {
        this.cuenta = cuenta;
        this.monto = monto;
        this.tipo = tipo;
    }

    public void MostrarHistorial(){
        
        for(Transaccion t : historial){
            System.out.println(t);
        }
}
       
         

    
    
}

   
    
    


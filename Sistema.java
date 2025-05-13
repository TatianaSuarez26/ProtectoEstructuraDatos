
package Proyecto;

import java.util.Stack;

public class Sistema {
    public String titular;
    public double saldo;
    private String contraseña;
    private boolean acceso;
    public Stack<Transaccion> historial = new Stack<>();

    public Sistema(String titular, double saldo, String contraseña) {
        this.titular = titular;
        this.saldo = saldo;
        this.contraseña = contraseña;
 
    }

    public String isContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setPrecio(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean autenticar(String contrasena){
        if( !this.contraseña.equals(contrasena)){
            System.out.println("Contraseña incorrecta");
            acceso = false;
        } 
         acceso = true;
         return acceso;
    } 
    
    public void Depositar(double monto){
        saldo += monto;
        historial.push(new Transaccion(this , monto , "deposito"));
                
    }
    public void Retirar (double monto){
        if(monto > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= monto;
            historial.push(new Transaccion (this, monto, "retiro"));
        }
    }
   

    @Override
    public String toString() {
        return "Titular de la cuenta: " + titular +" || Saldo disponible: $ "+ saldo ;
    }
    
    
}


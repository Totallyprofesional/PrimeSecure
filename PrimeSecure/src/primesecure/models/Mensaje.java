/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primesecure.models;

import primesecure.managers.PrimeManager;

/**
 *
 * @author Home
 */
public class Mensaje extends Thread{
    private String mensaje; 
    private int primo;    

    public Mensaje(String mensaje, int primo) {
        this.mensaje = mensaje;
        this.primo = primo;
    }

    @Override
    public void run() {
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Verificar codigo: " + primo);
        
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(mensaje);
    }
    
}

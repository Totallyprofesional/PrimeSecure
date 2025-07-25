/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primesecure.models;

/**
 *
 * @author Home
 */
public class Mensaje extends Thread{
    private String texto; 
    private int primo;    

    public Mensaje(String texto, int primo) {
        this.texto = texto;
        this.primo = primo;
    }
 
    @Override
    public void run() {
        System.out.println("Mensaje: " + texto);
        System.out.println("Verificar codigo: " + primo);
        
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(texto);
    }
    
}

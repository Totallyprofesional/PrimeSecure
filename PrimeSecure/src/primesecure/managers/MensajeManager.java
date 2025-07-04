/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primesecure.managers;

import primesecure.models.Mensaje;

/**
 * 
 * @author Home 
 */
public class MensajeManager {
    private PrimeManager primeManager;

    public MensajeManager(PrimeManager primeManager) {
        this.primeManager = primeManager;
    }

    public void Enviar(String mensaje, int primo) {
        if (!primeManager.BuscarPrimos(primo)) {
            throw new IllegalArgumentException("El código primo no existe en la base de datos.");
        }

        Mensaje msg = new Mensaje(mensaje, primo);

        msg.start();
    }
    
    
}

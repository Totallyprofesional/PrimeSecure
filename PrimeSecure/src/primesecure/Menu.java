/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primesecure;

import java.util.Scanner;
import primesecure.managers.MensajeManager;
import primesecure.managers.PrimeManager;
import primesecure.models.Mensaje;

/**
 *
 * @author Home
 */ 
public class Menu {
    private Scanner sc = new Scanner(System.in);
    private PrimeManager manager = new PrimeManager();  

    public void mostrarMenu(PrimeManager primeManager) {
        int option = 0;
 
        do {
            System.out.println("\n Bienvenido al Menu PrimeSecure");
            System.out.println("1. Mensajería");
            System.out.println("2. Agregar codigos");
            System.out.println("3. Mostrar total de códigos primos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
             
            option = sc.nextInt(); 

            switch (option) {
                case 1:
                    Mensajería(sc, primeManager);
                    break;
                case 2: 
                    AgregarCodigos(sc);
                    break;
                case 3:
                    TotalCodigos(); 
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Por favor ingrese una opción valida");
            }

        } while (option != 4);
    } 

    public void Mensajería(Scanner sc, PrimeManager primeManager) {
        System.out.print("Ingrese texto del mensaje: ");
        String mensaje = sc.nextLine(); 
        System.out.print("Ingrese código primo asociado: ");
        int primo = sc.nextInt();

        try { 
            MensajeManager manager = new MensajeManager(primeManager);
            manager.Enviar(mensaje, primo);
            System.out.println("Mensaje enviado.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void AgregarCodigos(Scanner sc) {
        System.out.print("Ingrese código primo: ");
        int primo = sc.nextInt();
        try {
            manager.addCodigo(primo);
            System.out.println("Código agregado");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }        
    }

    public void TotalCodigos() {
        System.out.println("Total códigos : " + manager.getPrimeList() );
    }
    
}


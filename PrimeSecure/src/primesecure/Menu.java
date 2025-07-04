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
            System.out.println("1. Mensajer�a");
            System.out.println("2. Agregar codigos");
            System.out.println("3. Mostrar total de c�digos primos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opci�n: ");
             
            option = sc.nextInt(); 

            switch (option) {
                case 1:
                    Mensajer�a(sc, primeManager);
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
                    System.out.println("Por favor ingrese una opci�n valida");
            }

        } while (option != 4);
    } 

    public void Mensajer�a(Scanner sc, PrimeManager primeManager) {
        System.out.print("Ingrese texto del mensaje: ");
        String mensaje = sc.nextLine(); 
        System.out.print("Ingrese c�digo primo asociado: ");
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
        System.out.print("Ingrese c�digo primo: ");
        int primo = sc.nextInt();
        try {
            manager.addCodigo(primo);
            System.out.println("C�digo agregado");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }        
    }

    public void TotalCodigos() {
        System.out.println("Total c�digos : " + manager.getPrimeList() );
    }
    
}


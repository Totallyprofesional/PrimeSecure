/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primesecure;

import java.util.InputMismatchException;
import java.util.Scanner;
import primesecure.models.Mensaje;
import primesecure.models.PrimeList;

/**
 *
 * @author Home
 */   
public class Menu {
    private Scanner sc = new Scanner(System.in);
    private PrimeList primeList;
    private Mensaje mensaje;
    private int primo;
    private String texto;

    public Menu(PrimeList primeList, Mensaje mensaje, int primo, String texto) {
        this.primeList = primeList;
        this.mensaje = mensaje;
        this.primo = primo;
        this.texto = texto;
    }
    
    public void mostrarMenu() {
        int option = 0;
 
        do {
            System.out.println("\n Bienvenido al Menu PrimeSecure");
            System.out.println("1. Mensajería");
            System.out.println("2. Agregar codigos");
            System.out.println("3. Buscar codigos");
            System.out.println("4. Eliminar codigos");
            System.out.println("5. Mostrar total de códigos primos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
             
            option = sc.nextInt(); 
 
            switch (option) {
                case 1:
                    Mensajería(sc);
                    break;
                case 2: 
                    AgregarCodigos(sc); 
                    break;
                case 3: 
                    BuscarCodigos(sc);
                    break;
                case 4: 
                    EliminarCodigos(sc);
                    break;
                case 5:
                    TotalCodigos(); 
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Por favor ingrese una opción valida");
            } 

        } while (option != 6); 
    }  

    public void Mensajería(Scanner sc) {
        System.out.print("Ingrese texto del mensaje: ");
        texto = sc.nextLine(); 
        System.out.print("Ingrese código primo asociado: ");
        
        try {
            primo = sc.nextInt();
            sc.nextLine(); 
        } catch (InputMismatchException e) {
            System.out.println("Error. Ingrese un numero valido");
        }
        
        if (primeList.isPrime(primo)){
            mensaje.run();
            System.out.println("Mensaje enviado");
        } else {
            System.out.println("Codigo invalido");
        }        
    } 
    
    public void AgregarCodigos(Scanner sc) {   
        try {
            primo = sc.nextInt();
            sc.nextLine(); 
        } catch (InputMismatchException e) {
            System.out.println("Error. Ingrese un numero valido");
        }   
        
        primeList.add(primo);
    }
             
    public void BuscarCodigos(Scanner sc) {
        System.out.print("Ingrese código primo: ");
        primo = sc.nextInt(); 
        
        
        
    }
     
    public void EliminarCodigos(Scanner sc) {
        try {
            primo = sc.nextInt(); 
            sc.nextLine(); 
        } catch (InputMismatchException e) {
            System.out.println("Error. Ingrese un numero valido");
        }   
        
        primeList.remove(primo);         
    }
      
    public void TotalCodigos() {
        primeList.getPrimesCount();
    }
    
}


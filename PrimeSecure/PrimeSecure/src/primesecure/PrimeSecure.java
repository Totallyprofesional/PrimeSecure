/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primesecure;

import primesecure.models.Mensaje;
import primesecure.models.PrimeList;

/**
 *
 * @author Home
 */
public class PrimeSecure {
    public static PrimeList primeList;
    public static Mensaje mensaje;
    public static int primo;
    public static String texto;
    
    public static void main(String[] args) {
        Menu menu = new Menu(primeList, mensaje, primo, texto);
        menu.mostrarMenu();
        }
    
} 
 
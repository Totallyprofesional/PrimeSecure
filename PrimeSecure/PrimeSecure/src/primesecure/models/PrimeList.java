/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primesecure.models;
import java.util.ArrayList; 

/**
 *
 * @author Home
 */
public class PrimeList extends ArrayList<Integer> {
    
    public boolean isPrime(int n) {  
        try {  
            if (n%2 == 0 || n%3 == 0) return false;
         
            // Desde 25
            for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0) return false;
                     
        } catch (Exception e) {
            System.out.println("Error de verificacion: " + e.getMessage());
            return false;
        }
        
        return true;
    }
        
    @Override 
    public boolean add(Integer n) { 
        if (!isPrime(n)) {
            throw new IllegalArgumentException("Numero ingresado debe ser primo");
        }
        return super.add(n); 
    }
    
    @Override
    public boolean remove(Object n) {
        if (n instanceof Integer && !isPrime((Integer) n)) {
            throw new IllegalArgumentException("Numero ingresado debe ser primo");
        }
        return super.remove(n);
    }
    
    public int getPrimesCount() {
        return this.size();
    }
    
}


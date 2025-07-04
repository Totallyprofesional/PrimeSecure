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
    
    public boolean Verificar(int n) {
        if (n <= 1) return false; 
        if (n <= 3) return true;
         
        // Revisar formula de porcentaje
        if (n % 2 == 0 || n % 3 == 0) return false;
          
        try {
            // Comprobar funcion
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
        } catch (Exception e) {
            System.out.println("Error de verificacion: " + e.getMessage());
            return false;
        }
        return true;
    }
    
    @Override
    public boolean add(Integer n) {
        if (!Verificar(n)) {
            throw new IllegalArgumentException("Numero ingresado debe ser primo");
        }
        return super.add(n);
    }
    
    @Override
    public boolean remove(Object o) {
        if (o instanceof Integer && !Verificar((Integer) o)) {
            throw new IllegalArgumentException("Numero ingresado debe ser primo");
        }
        return super.remove(o);
    }
    
    // Comprobar origen de size
    public int getConteoPrimos() {
        return this.size();
    }

    
}

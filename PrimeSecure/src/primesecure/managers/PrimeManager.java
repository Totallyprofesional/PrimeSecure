/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primesecure.managers;

import primesecure.models.PrimeList;

/** 
 *
 * @author Home
 */
public class PrimeManager {
    private PrimeList primeList = new PrimeList();

    public void addCodigo(int primo) {
        primeList.add(primo);
    }   

    public void removeCodigo(int primo) {
        primeList.remove(primo);
    }

    public int ConteoPrimos() {
        return primeList.getConteoPrimos();
    } 
    
    public boolean BuscarPrimos(int primo) {
        return primeList.contains(primo);
    }

    public PrimeList getPrimeList() {
        if (primeList.isEmpty()){
            System.out.println("No hay datos");
        }else {
            return primeList;
        }
        return null;
    }

    public boolean prime(int primeCode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

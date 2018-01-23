/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinconverter;

/**
 *
 * @author john
 */
public class CoinConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalPennies = 392;
        
        int quarters = totalPennies / 25;
        
        int quarterRemainder = totalPennies % 25;
        
        int dimes = quarterRemainder / 10;
        
        int dimeRemainder = quarterRemainder % 10;
        
        int nickles = dimeRemainder / 5;
        
        int pennies = dimeRemainder % 5;
        
        System.out.println("Total Pennies: " + totalPennies);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nickles);
        System.out.println("Pennies: " + pennies);
        
    }
    
}

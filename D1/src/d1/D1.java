/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1;

import java.util.Scanner;


public class D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int, char, bool, double vai flow, string
        vardaIevade();                      
    }
    
    private static void vardaIevade () 
    {
        System.out.println("Ievadi savu vārdu:"); // shortcut: sout un tad tab
        
        Scanner sc = new Scanner (System.in); // alt + enter 
            
        String vards =  sc.nextLine(); // lietotāja ievade, var uzreiz arī noteikt tipu nextInt piemēram
        
        System.out.println("Ievadi savu uzvārdu:"); 
        
        String uzvards = sc.nextLine();
        
        System.out.println("Tavs vārds ir " + vards + " " + uzvards); 
    }
    
}

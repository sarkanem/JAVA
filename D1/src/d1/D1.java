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
        
        //datu tips int, char, bool, double vai flow, string
        
//        vardaIevade();          
//        sazarosanas();
//        ievade();
        loginsUnParole();
        
        
    }
    
    private static void vardaIevade() 
    {
        System.out.println("Ievadi savu vārdu:"); // shortcut: sout un tad tab
        
        Scanner sc = new Scanner (System.in); // alt + enter 
            
        String vards =  sc.nextLine(); // lietotāja ievade, var uzreiz arī noteikt tipu nextInt piemēram
        
        System.out.println("Ievadi savu uzvārdu:"); 
        
        String uzvards = sc.nextLine();
        
        System.out.println("Tavs vārds ir " + vards + " " + uzvards); 
    }
    
    private static void sazarosanas()
    {   
        int a = 6;
        if(a==5)
        {
            
        }
        
        
        // lai  pārbaudītu stringus
        String b = "b";
        String g = "g";
        
        if (b.equals("a")) {
        }
        else if (b.equals(g)) {
        }
        else {
        }
        
        switch(a){
            case 1:
                //kas notiek
                break;
            case 2:
                break;
            default:
                break;
        }
    }
    
    private static void ievade()
    {
        System.out.println("Ievadi skaitli");
        
        Scanner sc = new Scanner (System.in); 
        
        int skaitlis =  sc.nextInt(); 
        
        if (skaitlis >= 5)
        {
            System.out.println("**");                
        }
        else
        {
             System.out.println("*");   
        }

        String simboli = "aaa";
        int a = simboli.length(); // 3
    }
    
    private static void loginsUnParole() {
        
        String logins = "lietotajs";
        String parole = "abc123";
        
        //3-13 logins
        //5-10 parole
                
        // vai sakrit
        
        System.out.println("Ievadi savu lietotājvārdu:");
        
        Scanner sc = new Scanner (System.in);
            
        String loginsIevade =  sc.nextLine(); 
        int loginsSK = loginsIevade.length();
        
        
        if (loginsSK < 3 || loginsSK > 13 )
        {
            System.out.println("Lietotājvārds ir nepareiza garuma");                
        }
        else if (loginsIevade.equals(logins))
        {
             System.out.println("Lietotājvārds ir pareizs");   
        }
        else
        {
             System.out.println("Lietotājvārds nesakrīt");   
        }
        
        
        System.out.println("Ievadi savu paroli:"); 
        
        String paroleIevade = sc.nextLine();   
        int paroleSK = paroleIevade.length();
        
        
        if (paroleSK < 3 || paroleSK > 13 )
        {
            System.out.println("Parole ir nepareiza garuma");                
        }
        else if (paroleIevade.equals(parole))
        {
             System.out.println("Parole ir pareiza");   
        }
        else
        {
             System.out.println("Parole nesakrīt");   
        }
    }   
    
    
}

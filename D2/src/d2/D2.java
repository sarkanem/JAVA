/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

import java.util.Scanner;

/**
 *
 * @author Uldis
 */
public class D2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        zarosanasUzdevums();
//        cikli();
//        zvaigznes(); 
           kapinat();
    }

    private static void zarosanasUzdevums() {        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ievadi pirmo skaitli:");
        int a =  sc.nextInt(); 
        System.out.println("Ievadi otro skaitli:");
        int b = sc.nextInt(); 
        
        boolean parbaude = intervals(a,b);
        if (parbaude == false) {
            System.out.println("Skaitļi nav atbilstoši intervālam");
        }
        else if (parbaude == true) { // var vienkārši if (parbaude) pārbauda automātiski true
            System.out.println("Saskaitīt vai atņemt (S/A)?");
            String izvele = sc.next().toUpperCase(); 

                switch (izvele){

                case "S":
                {
                    System.out.println("Skaitļu summa ir " + saskaitisana(a,b));
                    break;
                }

                case "A":
                {  
                    System.out.println("Skaitļu atlikums ir " + atnemsana(a,b));
                    break;                
                }       
                default:
                {
                    System.out.println("Tu ievadīji nepareizu darbību!");
                    break;
                }
            }   
        }                         
    }
    
    private static int saskaitisana(int a, int b){
        int result = 0;
        
        result = a+b;
        
        return result;
    }
    
    private static int atnemsana(int a, int b){
        int result = 0;
        
        result = a-b;
        
        return result;
    }
    
    private static boolean intervals(int a, int b){
        
        boolean result = true;
        
        if (a >= 0 && a <= 10 && b >= 0 && b <= 10 )
        {
            result = true;
        }
        else 
        {
            result = false;
        }
        
        return result;
    }
    
    private static void cikli(){
        //for, foreach, while, do..while
        
        for(int i = 0; i<10; i++){ //zinām cik ilgi gribām ciklu
            System.out.println(i);            
        }
        
        int j = 0;
        while(j<10){ // ja īsti nezinām, cik ilgi vajadzīgs cikls
            System.out.println(j);
            j++;             
        }
        
        j = 0; // ja j ir 10, do izprintēs 10 un pārbaudīs nosacījumu while un pārtrauks. Vienu reizi iezies ciklu.
        do {
            System.out.println(j);
            j++; // ja j oriģinali bia 10, tad te tas kļūst par 11
        }while(j<10);  
        
    }
    
    private static void zvaigznes(){
        
       String j = "";
       for(int i = 0; i<4; i++){         
           j += "*";
           System.out.println(j);            
        }
    }
    
    private static void kapinat(){
      Scanner sc = new Scanner (System.in);
            
      System.out.println("Ievadi kāpināmo skaitli:");
      int a =  sc.nextInt(); 
      System.out.println("Ievadi ar ko kāpināt skaitli:");
      int b = sc.nextInt();       
      
      int c = a;
      for(int i = 0; i<b-1; i++){         
           c = c*a;                      
        }
      System.out.println("Rezultāts ir " + c);
    }
    
}


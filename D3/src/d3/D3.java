/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d3;

import java.util.Scanner;

/**
 *
 * @author Uldis
 */
public class D3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        skaitluSumma();
        
        darbibasIzvele();
    }
    
    private static void skaitluSumma(){
      Scanner sc = new Scanner (System.in);
  
      int summa = 0;
      for(int i = 0; i<5; i++){         
           System.out.println("Ievadi skaitli:");
           int a = sc.nextInt();
           summa += a;      
        }
      
      System.out.println("Skaitļu summma ir " + summa);               
    }
    
    private static void darbibasIzvele(){
        Scanner sc = new Scanner (System.in);
       
        int izvele = 1;
        int a = 0;
        int b = 0;
        
        while (izvele != 0)
        {
           System.out.println("Izvēlies darbību: saskaitīt (1), atņemt (2), iziet (0)");
           izvele = sc.nextInt(); 
    
            
           switch(izvele){
                case 1:
                {                           
                    System.out.println("Ievadi pirmo skaitli:");
                    a =  sc.nextInt(); 
                    System.out.println("Ievadi otro skaitli:");
                    b = sc.nextInt();                 
                    System.out.println("Rezultāts ir " + saskaitisana(a,b));
                    break;
                }
                case 2:
                {                             
                    System.out.println("Ievadi pirmo skaitli:");
                    a =  sc.nextInt(); 
                    System.out.println("Ievadi otro skaitli:");
                    b = sc.nextInt();                    
                    System.out.println("Rezultāts ir " + atnemsana(a,b));
                    break;                
                }
                case 0:
                {  
                    System.out.println("Paldies!"); 
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
    
    
    
    
    
    
}

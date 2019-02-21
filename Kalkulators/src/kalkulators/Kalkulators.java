/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulators;

import java.util.Scanner;

public class Kalkulators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       kalkulators();
    }
    
    private static void kalkulators(){
        Scanner sc = new Scanner (System.in);
               
    while (true)
        {   
        System.out.println("Izvēlies darbību: saskaitīt (1), atņemt (2), dalīt (3), reizināt (4), kāpināt (5), iziet (0)");
        int izvele = sc.nextInt();
        double a = 0;
        double b = 0;
        
        if(izvele == 1 || izvele == 2 || izvele == 3 || izvele == 4 || izvele == 5)
        {
            System.out.println("Ievadi pirmo skaitli:");
            a =  sc.nextInt(); 
            System.out.println("Ievadi otro skaitli:");
            b = sc.nextInt();    
        }
        else if (izvele!=0){
            System.out.println("Tu ievadīji nepareizu darbību!");
        }
        else{
            break;
        }
        
           switch(izvele){
                case 1:
                {           
                    System.out.println("Rezultāts ir " + saskaitisana(a,b));
                    break;
                }
                case 2:
                {                             
                    System.out.println("Rezultāts ir " + atnemsana(a,b));
                    break;                
                }
                case 3:
                {                      
                    System.out.println("Rezultāts ir " + dalisana(a,b));
                    break;                
                }
                case 4:
                {                                  
                    System.out.println("Rezultāts ir " + reizinasana(a,b));
                    break;                
                }
                case 5:
                {                                     
                    System.out.println("Rezultāts ir " + kapinasana(a,b));
                    break;                
                } 
            }
        }  
        
    }    
    
    private static double saskaitisana(double a, double b){
        double  result = 0;
        
        result = a+b;
        
        return result;
    }
    
    private static double atnemsana(double a, double b){
        double result = 0;
        
        result = a-b;
        
        return result;
    }
    
    private static double reizinasana(double a, double b){
        double result = 0;

        result = a*b;

        return result;
    }
    
    private static double dalisana(double a, double b){
        double result = 0;

        result = a/b;

        return result;
    }
    
    private static double kapinasana(double a, double b){
        double result = 0;

        result = Math.pow(a,b);

        return result;
    }
    
}

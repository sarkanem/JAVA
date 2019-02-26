/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d5;

import java.util.Scanner;

public class D5 {


    public static void main(String[] args) {
              
      PirmaUzdevumaMenu();
        
    }
    
    private static void PirmaUzdevumaMenu() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Izvēlies darbību: skaitļuSumma (1), paraVaiNepara (2), iziet (0)");
            int izvele = sc.nextInt();
            
            if (izvele==0){
                System.out.println("Paldies!");
                break;
            }

            Saraksti saraksti = new Saraksti();

            switch (izvele) {
                case 1: {
                    saraksti.skaitluSumma();
                    break;
                }
                case 2: {
                    saraksti.paraVaiNepara();
                    break;
                }
    
                default: {
                    System.out.println("Tu ievadīji nepareizu darbību!");
                    break;
                }
            }
        }
    }    
}

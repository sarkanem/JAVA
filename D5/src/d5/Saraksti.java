/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Saraksti {

    private ArrayList<Integer> ievade() {
// bez individuālas prasīšanas:
//        System.out.println("Cik garu sarakstu vēlies?");
//        int garums = sc.nextInt();
//        for (int i = 0; i < garums; i++) {
//            System.out.println("Ievadiet skaitli: ");
//            skaitli.add(sc.nextInt());
//        }

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> skaitli = new ArrayList<>();
        
        String izvele = "J";
        
        while(!izvele.equals("N"))
        {           
           System.out.println("Ievadīt skaitli? (J/N)");
           izvele = sc.next().toUpperCase(); 
           
           switch(izvele)
           {
               case "J":
                   skaitli.add(sc.nextInt());
                   break;
               case "N":
                   System.out.println("Paldies!"); 
                   break;                   
           } 
        }
        return skaitli;
    }

    public void skaitluSumma() {

        int summa = 0;

        ArrayList<Integer> skaitluSaraksts = ievade();

        for (int i = 0; i < skaitluSaraksts.size(); i++) {
            summa += skaitluSaraksts.get(i);
        } 
        // var saīsinātajā veidā:
        // for (int sk: skaitluSarkasts) {
        // summa+=sk;}
        System.out.println("Skaitļu summa ir " + summa);
    }

    public void paraVaiNepara() {
        
        ArrayList<Integer> skaitluSaraksts = ievade();

        for (int i = 0; i < skaitluSaraksts.size(); i++) {
            if (skaitluSaraksts.get(i) % 2 == 0) {
                skaitluSaraksts.set(i, 0);  // nomainīt tieši attiecīgā indeksa ciparu
            }
        }
//        for (int i = 0; i < skaitluSaraksts.size(); i++) {
//            System.out.println(skaitluSaraksts.get(i));
//        }            
        System.out.println(skaitluSaraksts);
    }
}

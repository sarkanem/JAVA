/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Masivi {
    
    public void viendimensija(){
        
        int[] masivs = new int[3];
        
        Scanner sc = new Scanner(System.in);
                        
        masivs[0] = 1;
        masivs[1] = 2;
        masivs[2] = 3;  
        
        for (int i = 0; i<masivs.length; i++){
            System.out.println("Ievadiet skaitli: ");
            masivs[i] = sc.nextInt();
        }
        
        for (int i = 0; i<masivs.length; i++){
           System.out.print(masivs[i]+ " ");
        }             
    }
    
    public void uzdevums() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cik garu masīvu vēlies?");

        int[] masivs = new int[sc.nextInt()];
        
        int summa = 0;

        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Ievadiet skaitli: ");
            masivs[i] = sc.nextInt();
            summa += masivs[i];
        }     
        
        System.out.println("Skaitļu summa ir " + summa);
    }    

    public void zvaigznes() {
        
        String[] zvaigznes = new String[4];

//      vai arī definēt ārpus cikla  zvaigznes[0]="*"; un tad ciklā int i=1 un tad nav jāizmanto if un else
//      vai arī String a = ""; un tad ciklā rakstīt a=a+"*"; un  zvaigznes[i] =a;
        for (int i = 0; i < zvaigznes.length; i++) {
            if (i == 0) {
                zvaigznes[i] = "*";
            } else {
                zvaigznes[i] = zvaigznes[i - 1] + "*";
            }
       
            System.out.println(zvaigznes[i]);
        }
      
        for (int i = zvaigznes.length-2; i >=0; i--) {
            System.out.println(zvaigznes[i]);
        } 
    }    
    
    
    public void nepara(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cik garu masīvu vēlies?");

        int[] masivs = new int[sc.nextInt()];

        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Ievadiet skaitli: ");
            masivs[i] = sc.nextInt();
            if (masivs[i] % 2 != 0) {
                masivs[i] = 0;
            }
        }

        for (int i = 0; i < masivs.length; i++) {
            System.out.print(masivs[i] + " ");
        }    
    }

    public void saraksts() {   
        List<Integer> skaitluSaraksts = new ArrayList<>(); // jāraksta pilns Integer  tad spiez alt+Enter // listi ērtāki par masīviem, jo nav jādefinē garums

        skaitluSaraksts.add(2); // indekss 0
        skaitluSaraksts.add(3); // indekss 1
        skaitluSaraksts.add(4); // indekss 2

        for (int i = 0; i < skaitluSaraksts.size(); i++) {
            System.out.println(skaitluSaraksts.get(i));
        }
         
        //izņemt vērtību
        skaitluSaraksts.remove(0);
        
        // izvadīt sarakstu
        for (int i = 0; i < skaitluSaraksts.size(); i++) {
            System.out.println(skaitluSaraksts.get(i));
        }
        
        // vai arī šādi pierakstīt:
        for (int sk : skaitluSaraksts) {
            System.out.println(sk);
        }
        
        //lai lietotājs var ievadīt vērtības sarakstā
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            skaitluSaraksts.add(sc.nextInt());
        }

    }
}
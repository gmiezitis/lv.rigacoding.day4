/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day4;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Loops {
    public static void hashtagN(){
         Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitu N: ");
        
        int n = input.nextInt();
        
        for(int rinda = 0; rinda < n; rinda++){
            for(int kolona = 0; kolona <n; kolona ++){
                System.out.print("#");
            }
            
            
            System.out.println();
       
        
        }
        
        
        
    }
    
    
    
    //n skaitlu sumaa 
    public static void countN(){
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Ievadi skaitu N: ");
        int n = input.nextInt();
        int sum = 0;
        double average = 0;
        
        for(int i = 1; i < n; i++){
            System.out.print("Ievadi" + i + ". skaitli: ");
            int skaitlis = input.nextInt();
             
             
             sum = sum + skaitlis;
        
        
        
        }
        average = (double) sum / n;
        
        System.out.println("Skaitļu summa = " + sum);
        System.out.println("Vidējais vertiba  = " + average);
        System.out.println("Videja vertiba = " + String.format("%.2f", average));
        
        
        
      
    }   

        
      


        
   
    //skaitlu summa lidz N 
    public static void countToN(){
     Scanner input = new Scanner(System.in);
     
     System.out.println("Ievadi skaitli N;");
     int n = input.nextInt();
     int total = 0;
     
     // i++ ir tas pats kas i = i + 1
     
     for(int i = 1; i <= n; i++){
         
         System.out.println(i);
         
         total = total + i;
         //total += i;
     }
     System.out.println("Skaitļu summa = " + total);
    }
    
}

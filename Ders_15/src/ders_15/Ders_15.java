/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_15;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Üniversite kaçıncı sınıfsın: ");
        int sinif = input.nextInt();
        
            switch(sinif){
            case 1:
                System.out.println("ÇAYLAK");
                break;
                
            case 2:
                System.out.println("KALFA");
                break;
            case 3:
                System.out.println("USTA");
                break;
            case 4:
                System.out.println("ÜSTAD");
                break;
            default :
                System.out.println("Geçerli bir sınıf giriniz!");
        }
        
    }
    
}

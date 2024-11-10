/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproject;

/**
 *
 * @author sheila
 */
import java.util.Scanner;

public class AritmathicGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*********************");
        System.out.println("aritmathic game");
        System.out.println("*********************");
        System.out.println("");

        while(true){
            System.out.println("Main menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");  
            System.out.println("3. exit");
            System.out.print("enter menu: ");   

            Scanner m = new Scanner(System.in);
            int menu = m.nextInt();
            
            if(menu == 1){               
                Addition a = new Addition();
                a.penjumlahan();
            }
            
            else if(menu == 2){
                Substraction s = new Substraction();
                s.pengurangan();
            }
            else{
                break;
            }
        }
    }
    
}

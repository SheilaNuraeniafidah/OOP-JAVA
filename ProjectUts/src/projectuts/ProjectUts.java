/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectuts;

/**
 *
 * @author user
 */
import java.util.Scanner;



public class ProjectUts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("******************");
        System.out.println("Arithmatics Game");
        System.out.println("******************");
        Scanner nama = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = nama.nextLine();
        System.out.println("******************");
        System.out.println("Arithmatics Game");
        System.out.println("******************");                
        
        while(true){
            System.out.println("Main Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.print("Enter Menu: ");
            
            Scanner m = new Scanner(System.in);
            int menu = m.nextInt();
                        
            if (menu == 1){
                System.out.println("**************************");
                System.out.println("Arithmatic Game - Addition");
                System.out.println("**************************");
                int lives = 3;
                int score = 0;
                while(lives != 0){
                    Addition a1 = new Addition();
                    a1.penjumlahan();
                    
                    Scanner ans1 = new Scanner(System.in);
                    System.out.print("Answer: ");
                    int jwb1 = ans1.nextInt();
                    
                    if(a1.num1 + a1.num2 == jwb1){
                        score = score + 5; 
                        System.out.println("yes " + name + ", you're right [score : " + score + " ] [lives : " + lives + " ]" );                                             
                    }
                    
                    else if(a1.num1 + a1.num2 != jwb1){
                        score = score - 2;
                        lives = lives - 1;
                        System.out.println("sorry " + name + ", wrong answer [score : " + score + " ] [lives : " + lives + " ]");                    
                    }
                    
                    while(score == 100){
                        System.out.println("");
                        System.out.println("Congratulations " + name + ", you have finished this game, please try another menu");
                        System.out.println("");
                        break;
                    }                    
                    
                    while(lives == 0){
                        System.out.println("");
                        System.out.println("sorry " + name + ", don't give up, i'm sure you can do better");
                        System.out.println("");
                        break;
                    }   
                }
            }
            if (menu == 2){
                System.out.println("*****************************");
                System.out.println("Arithmatic Game - Subtraction");
                System.out.println("*****************************");
                int lives = 3;
                int score = 0;
                
                while(lives != 0){
                    Substraction s1 = new Substraction();
                    s1.pengurangan();
                    
                    Scanner ans2 = new Scanner(System.in);
                    System.out.print("Answer : ");
                    int jwb2 = ans2.nextInt();
                    
                    if (s1.num1 - s1.num2 == jwb2){
                        score = score + 5;
                        System.out.println("yes " + name + ", you're right [score : " + score + " ] [lives : " + lives + " ]" );                        
                    }
                    
                    else if (s1.num1 - s1.num2 != jwb2){
                        score = score - 2;
                        lives = lives - 1;
                        System.out.println("sorry, " + name + ", wrong answer [score :  " + score + " ][lives : " + lives + " ]");                        
                    }
                    while (score == 100){
                        System.out.println("");
                        System.out.println("congratulations, " + name + ", you have finished this game, please try another menu");
                        System.out.println("");
                        break;
                    }
                    while (lives == 0){
                        System.out.println("");
                        System.out.println("sorry, " + name + ", don't give up, i'm sure you can do better");
                        System.out.println("");
                        break;
                    }
                }
            }
            else{
                break;
            }
        }
    }
}    
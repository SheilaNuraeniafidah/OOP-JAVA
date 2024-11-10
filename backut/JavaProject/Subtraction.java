package JavaProject;

import java.util.Scanner;

public class Subtraction {
    int num1 = (int)(Math.random()*10);
    int num2 = (int)(Math.random()*10);
    int lives = 3;
    int score = 0;

    void pengurangan(){
        System.out.println("********************");
        System.out.println("Arithmatic Game - Substraction");
        System.out.println("********************");
        System.out.print("enter your name : ");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();

        while(lives > 0 ){
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            int sum = num1 - num2;
            System.out.println("what is the result of "+ num1 + " - " +num2 + " ?");
            System.out.print("Answer : ");
            Scanner ans1 = new Scanner(System.in);
            int jwb1 = ans1.nextInt();

                if(jwb1 == sum){
                    score = score + 5;
                    System.out.println("yes " + name + " you're right, score: " + score + ", lives: " + lives);                               
                }

                else if(jwb1 != sum){
                    score = score - 2;
                    lives = lives - 1;
                    System.out.println("sorry " + name + ", wrong answer, score: " + score + ", lives: " + lives);                   
                }

                if(lives == 0){
                    System.out.println("");
                    System.out.println("sorry " + name + " i'm sure you can do better");
                    System.out.println("");
                    break;
                }

                if (score >= 100){
                    System.out.println("");
                    System.out.println("Congratulations " + name + " you have finished this game, please try another menu");
                    System.out.println("");
                    break;
                }

        }

    }

}


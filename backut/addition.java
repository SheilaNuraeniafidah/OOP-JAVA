

import java.util.Random;
import java.util.Scanner;

public class addition {
    int num1 = (int)(Math.random()*10);
    int num2 = (int)(Math.random()*10);
    int lives = 3;
    int score = 0;

    void penjumlahan(){
        System.out.println("********************");
        System.out.println("Arithmatic Game - Addition");
        System.out.println("********************");

        while(lives != 0){
        int sum = num1 + num2;
        System.out.println("what is the result of "+ num1 + " + " +num2 + " ?");
        System.out.print("Answer : ");
        Scanner ans1 = new Scanner(System.in);
        int jwb1 = ans1.nextInt();
            if(jwb1 == sum){
                score = score + 5;
                System.out.println("yes");
            }
        }

    }
}


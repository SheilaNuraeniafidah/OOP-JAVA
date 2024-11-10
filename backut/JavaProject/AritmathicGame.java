package JavaProject;

import java.util.Scanner;

public class AritmathicGame {
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
                Subtraction s = new Subtraction();
                s.pengurangan();
            }

            else{
                break;
            }
        }
    }
}

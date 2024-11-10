

import java.util.Scanner;
public class uts{
    public static void main(String[] args) {
        System.out.println("*********************");
        System.out.println("aritmathic game");
        System.out.println("*********************");
        System.out.println("");

        System.out.print("enter your name : ");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();

        while(true){
            System.out.println("Main menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");  
            System.out.println("3. exit");
            System.out.print("enter menu: ");   

            Scanner m = new Scanner(System.in);
            int menu = m.nextInt();
            
            if(menu == 1){
                addition a = new addition();
                a.penjumlahan();
            }
            else{
                break;
            }
        }
    }
}
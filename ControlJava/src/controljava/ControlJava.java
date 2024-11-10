/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controljava;

/**
 *
 * @author user
 */
import java.util.Scanner; 
public class ControlJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // statement control pada java//
        int a = 20;
        if (a < 10){
            System.out.println("a kurang dari 10");
        }
        else if(a < 15){
            System.out.println("a kurang dari 15 ");
        }
        else{
            System.out.println("a lebih dari 20");
        }
        
        //statement control with if else//
        int jam = 20;
        if(jam < 18){
            System.out.println("selamat siang");
        }
        else{
            System.out.println("selamat malam");
        }
        
        //statement control without if else//
        int time = 20;
        String result = (time < 18)?  "good day" : "good evening";
        System.out.println(result);
            
        //statement control menggunakan input//
        Scanner t = new Scanner(System.in);
        System.out.print("input your time");
        int clock = t.nextInt();
        
        String r = (clock < 18)? "good afternoon" : "good night";
        System.out.println(r);
    }
}

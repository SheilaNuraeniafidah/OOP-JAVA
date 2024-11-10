/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuts;
/**
 *
 * @author user
 */
import java.util.Random;

public class Substraction {
    int num1 = (int)(Math.random()*10);
    int num2 = (int)(Math.random()*10);
    
    void pengurangan(){
        int subs = num1 - num2;
        System.out.println("what is the result of " + num1 + " - " + num2 + " ?");               
    }    
}
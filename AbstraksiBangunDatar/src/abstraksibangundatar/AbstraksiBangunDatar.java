/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraksibangundatar;

/**
 *
 * @author user
 */
public class AbstraksiBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square a = new Square();
        a.sisi = 5.0;
        a.hasil();
        
        Rectangle b = new Rectangle();
        b.length = 4.0;
        b.width= 5.0;
        b.hasil();
        
        Circle c = new Circle();
        c.radius = 7.0;
        c.hasil();
    }    
}

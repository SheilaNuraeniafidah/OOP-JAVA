/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latinterface;

/**
 *
 * @author user
 */
public class LatInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Square a = new Square();
       a.side = 4.0;
       a.printResult();
       
       Rectangle b = new Rectangle();
       b.length = 6.0;
       b.width = 4.0;
       b.printResult();
       
       Circle c = new Circle();
       c.radius = 7;
       c.printResult();
       
       Triangle d = new Triangle();
       d.base = 6;
       d.height = 7;
       d.printResult();
    }
    
}

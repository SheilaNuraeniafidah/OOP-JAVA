/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContohEncapsulationCircle;

/**
 *
 * @author user
 */
public class ContohEncapsulationCircle{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle();
        c1.setradius(-10);
        c1.calculateArea();
        System.out.println("the area of circle with radius " + c1.getradius() + " is " + c1.calculateArea());
        
        Circle c2 = new Circle();
        c2.setradius(7);
        c2.calculateArea();
        System.out.println("the area of circle with radius " + c2.getradius() + " is " + c2.calculateArea());
    }
    
}

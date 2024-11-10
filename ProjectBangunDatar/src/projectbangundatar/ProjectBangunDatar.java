/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author user
 */
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square A = new Square();
        A.sidelength = 25;
        
        Circle B = new Circle();
        B.radius = A.sidelength / 2.0 ;
        
        double totalArea = A.calculateArea() - B.calculateArea();
        System.out.println("the result is:" + totalArea);
        
        Square D = new Square();
        D.sidelength = 30;
        
        Circle C = new Circle();
        C.radius = D.sidelength / 4.0;
        
        double totalCircle = 4 * C.calculateArea();
        double totaluas = D.calculateArea() - totalCircle;
        System.out.println("the result is:" + totaluas);
        
        Rectangle R = new Rectangle();
        R.length = 20 * 100 ;
        R.width = 15 * 100;
        
        Square S = new Square();
        S.sidelength = 40;
        
        int totalSquare = 5 * S.calculateArea();
        int totalbox = R.hitungluas() / totalSquare;
        System.out.println("total box ;" + totalbox );
        
  
        Circle c1 = new Circle();
        c1.radius = 10;
        Output.printArea(c1.calculateArea());
        

  
  }        
}

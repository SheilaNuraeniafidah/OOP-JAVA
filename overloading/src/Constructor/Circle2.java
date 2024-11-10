/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/**
 *
 * @author user
 */
public class Circle2 {
    double radius;
    
    Circle2(double c){
        this.radius = c;
    }
    
    double  calculateArea(){
        double area = this.radius * this.radius * 3.14;
        return area;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraksibangundatar;

/**
 *
 * @author user
 */
public class Circle extends BangunDatar{
    Double radius;
    
    @Override
    Double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    Double parimeter() {
        return 2 * Math.PI * this.radius;
    }
    
     void hasil(){
        System.out.println("luas lingkaran : " + this.area());
        System.out.println("keliling lingkaran : " + this.parimeter());
    }
}

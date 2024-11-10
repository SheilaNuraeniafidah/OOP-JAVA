/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraksibangundatar;

/**
 *
 * @author user
 */
public class Rectangle extends BangunDatar{
    Double length;
    Double width;

    @Override
    Double area() {
        return this.length * this.width;
    }

    @Override
    Double parimeter() {
        return 2 * (this.length + this.width);
    }
    
    void hasil(){
        System.out.println("luas persegi panjang : " + this.area());
        System.out.println("keliling persegi panjang : " + this.parimeter());
    }
}

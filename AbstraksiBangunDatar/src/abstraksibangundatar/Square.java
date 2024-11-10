/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraksibangundatar;

/**
 *
 * @author user
 */
public class Square extends BangunDatar{
    Double sisi;

    @Override
    Double area() {
        return this.sisi * this.sisi;
    }
    @Override
    Double parimeter() {
        return 4 * this.sisi;
    }
    
    void hasil(){
        System.out.println("luas persegi : " + this.area());
        System.out.println("keliling persegi : " + this.parimeter());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latinterface;
/**
 *
 * @author user
 */
public class Triangle extends MyClass1 {
    double base;
    double height;

    @Override
    public Double calcArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public void printResult() {
        System.out.println("luas segitiga : " + this.calcArea());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latinterface;

import packinterface.*;

/**
 *
 * @author user
 */
public class Rectangle extends MyClass1 implements Parimeter, Symetries{
    double width ;
    double length;
    @Override
    public Double calcArea() {
        return this.length * this.width;
    }

    @Override
    public void printResult() {
        System.out.println("luas persegi panjang : " + this.calcArea());
        System.out.println("keliling persegi panjang : " + this.calcparimeter());
        System.out.println("simetri putar : " + this.calcRotateSymetries());
        System.out.println("simetri lipat : " + this.calcFoldSymetries());
    }

    @Override
    public Double calcparimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double calcRotateSymetries() {
        return 2;
    }

    @Override
    public double calcFoldSymetries() {
        return 2;
    }
    
}

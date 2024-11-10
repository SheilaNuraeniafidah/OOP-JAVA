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
public class Circle extends MyClass1 implements Parimeter, Symetries{
    int radius;

    @Override
    public Double calcArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void printResult() {
        System.out.println("luas lingkaran : " + this.calcArea());
        System.out.println("keliling lingkaran : " + this.calcparimeter());
        System.out.println("simetris putar lingkaran : " + this.calcRotateSymetries());
        System.out.println("simetri lipat lingkaran : " + this.calcFoldSymetries());
    }

    @Override
    public Double calcparimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public double calcRotateSymetries() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public double calcFoldSymetries() {
        return Double.POSITIVE_INFINITY;
    }
}

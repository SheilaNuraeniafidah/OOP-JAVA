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
public class Square extends MyClass1 implements Parimeter, Symetries{
    Double side;  

    @Override
    public Double calcArea() {
        return this.side * this.side;
    }
    
    @Override
    public void printResult() {
        System.out.println("luas persegi : " + this.calcArea());
        System.out.println("keliling persegi : " + this.calcparimeter());
        System.out.println("simetris putar persegi : " + this.calcRotateSymetries());
        System.out.println("simetri lipat persegi : " + this.calcFoldSymetries());
    }

    @Override
    public Double calcparimeter() {
       return  4 * this.side;
    }

    @Override
    public double calcRotateSymetries() {
        return 4;
    }

    @Override
    public double calcFoldSymetries() {
        return 4;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;
import packinterface.*;
/**
 *
 * @author user
 */
public class prisma extends class1 implements NewInterface1, NewInterface2{
    public double TinggiPrisma;
    public double TinggiSegitiga;
    
    prisma (double tp, double lp, double ts) {
        this.TinggiPrisma = tp;
        this.Lebar = lp;
        this.TinggiSegitiga = ts;
    }
    
    public double luasSelimut(){
        return 3 *(this.TinggiPrisma * this.Lebar);
    }
    
    public double luasAlasPrisma(){
        return 2 * 1/2 * this.Lebar * this.TinggiSegitiga;
    }

    @Override
    public void hasil() {
        System.out.println("Hasil luas perumkaan prisma adalah " + this.area());
        System.out.println("Hasil volume prisma adalah " + this.volume());
    }

    @Override
    public Double area() {
        return this.luasSelimut() + this.luasAlasPrisma();
    }

    @Override
    public double volume() {
         return this.luasAlasPrisma() * this.TinggiPrisma;
    }
  
    
}

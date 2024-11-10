/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latinputjava;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class LatInputJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*mengubah input menjadi p1*/
    Scanner p = new Scanner(System.in);
        System.out.print("masukkan sisi persegi: ");
        int pjgsisi = p.nextInt();
        
        Persegi p1 = new Persegi();
        p1.sisi = pjgsisi;
        p1.hitungluas();
        p1.hitungkeliling();
        
        Scanner r = new Scanner(System.in);
        System.out.print("masukkan panjang rectangular: ");
        int panjang = r.nextInt();
        System.out.print("masukkan lebar rectangular: ");
        int lebar = r.nextInt();
        
        Rectangular r15 = new Rectangular();
        r15.lebar = lebar;
        r15.panjang = panjang;
        r15.calculateArea();
        r15.calculateKeliling();
        
        Scanner circle = new Scanner(System.in);
        System.out.print("masukkan jari-jari : ");
        Double radius = circle.nextDouble();
        Double Area = 3.14 * radius * radius;
        System.out.println("luas lingkaran : " + Area );          
    }
}

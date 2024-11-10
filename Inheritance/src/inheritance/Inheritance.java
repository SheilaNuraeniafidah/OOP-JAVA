/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author user
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     * inherritance : suatu class yang memiliki atribut atau method yang sama dengan class yang lain
     */
    public static void main(String[] args) {
        Staff a = new Staff();
        a.staffID = "K3522079";
        a.staffName = "sheila";
        a.staffLevel = 1 ;
        a.printStaff();
        
        Lecturer b = new Lecturer();
        b.staffID = "K352200";
        b.staffLevel = 1;
        b.staffName = "albert";
        b.nidn = "A1233";
        
        b.printStaff();
         //menggunakan abstraksi//

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author user
 */
public class Lecturer extends Staff {
    String nidn;
     
    int allowance(){
        return 1000000;    
    }
    //overriding: merupakan bagian dari inheritance yang memungkinkan membuat method yang sama dengan super classnya namun implementasinya berbeda//
    void printStaff(){
        super.printStaff();
        System.out.println("NIDN : " + this.nidn);
        System.out.println("allowance : " + this.allowance());
    }
    
}

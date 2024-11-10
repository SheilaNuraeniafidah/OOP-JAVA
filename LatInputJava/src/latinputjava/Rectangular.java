/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latinputjava;

/**
 *
 * @author user
 */
public class Rectangular {
    int panjang ;
    int lebar ;
    
    int calculateArea(){
        int luas = this.panjang * this.lebar ;
        System.out.println("luas persegi panjang: " + luas);
        return luas ; 
    }
    void calculateKeliling(){
        int keliling;
        keliling = 2* (this.panjang + this.lebar);
        System.out.println("keliling persegi panjang:" + keliling);
    }
}

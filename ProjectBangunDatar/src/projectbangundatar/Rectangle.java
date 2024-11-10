/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author user
 */
public class Rectangle {
    int length;
    int width ;
    
    int hitungluas(){
        int luas = this.length * this.width ;
        return luas ; 
    }
    void hitungkeliling(){
        int keliling;
        keliling = 2* (this.length + this.width);
        System.out.println("keliling persegi panjang:" + keliling);
    }
}

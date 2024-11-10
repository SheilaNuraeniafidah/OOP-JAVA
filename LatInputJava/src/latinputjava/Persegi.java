/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latinputjava;

/**
 *
 * @author user
 */
public class Persegi {
    int sisi;
    
    int hitungluas(){
    int luas = this.sisi * this.sisi;
        System.out.println("luas persegi adalah : " + luas);
        return luas;
    }
    int hitungkeliling(){
        int keliling = 4 * this.sisi;
        System.out.println("keliling persegi adalah : " + keliling);
        return keliling;
    }
    
}

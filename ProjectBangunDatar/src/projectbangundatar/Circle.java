/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author user
 */
public class Circle {
    double radius ;
    String name;
    
    /*counstructor circle*/
     double calculateArea (){
        double area = 3.14 * this.radius * this.radius;
        return area;
    }
    
     void hitungKeliling(){
        double keliling;
        keliling = 2 * 3.14 * this.radius;
        System.out.println("keliling lingkaran " + this.name + keliling + " satuan keliling");
    }
public class output{     
     static void printarea(double area){
         System.out.println("the area is" + area);
         
     }
     
}
}

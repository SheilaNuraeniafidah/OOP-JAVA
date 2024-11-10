/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author user
 */
public class Square {
    int sidelength ;
    
    int calculateArea (){
        int area = sidelength * sidelength;
        return area;
    }
    int calculatePerimeter (int x){
        int perimeter = 4 * sidelength;
        return perimeter;
    }    
}

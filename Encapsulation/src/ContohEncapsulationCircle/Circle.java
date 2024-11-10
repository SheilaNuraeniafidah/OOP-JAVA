/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohEncapsulationCircle;

/**
 *
 * @author user
 */
public class Circle {
    private int radius;
    private Double luas;
    
    public void setradius(int r){
        if (r > 0){
            this.radius = r;
        }
        else {
            System.out.println("invalid value");
            System.exit(0);
        }
    }
    
    public int getradius(){
        return this.radius;
    }
    
    public Double calculateArea(){
        this.luas = Math.PI * this.radius * this.radius;
        return this.luas;
    }
}

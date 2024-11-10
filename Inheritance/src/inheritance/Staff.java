/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author user
 */
public class Staff {
    String staffID;
    String staffName;
    int staffLevel;
    
    int salary(){
        return 2000000;
    }
    void printStaff(){
        System.out.println("statff id : " + this.staffID);
        System.out.println("statff name : " + this.staffName);
        System.out.println("statff level : " + this.staffLevel); 
        System.out.println("salary : " + this.salary());
    }       
}

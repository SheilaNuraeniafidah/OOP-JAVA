/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractionsalary;

/**
 *
 * @author user
 */
public abstract class Employee {
    String Nama ;
    String EmployeeID;
    int workinglife;
    
    int basicsalary(){
        return 3000000;
    }
     abstract int allowance();
     
     int totalsalary(){
         return this.basicsalary() + this.allowance();
     }
    
}

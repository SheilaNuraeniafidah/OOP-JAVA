/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public abstract class Employee {
    String employeeID;
    String Name;
    int workinglife;
    
    int mainSalary(){
        return 3000000;
    }
    abstract int allowance();
    int totalsalary(){
        return this.mainSalary() + this.allowance();
    }
}

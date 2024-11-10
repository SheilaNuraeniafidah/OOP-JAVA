/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractionsalary;

/**
 *
 * @author user
 */
public class EmployeeA extends Employee{

    @Override
    int allowance() {
        if (this.workinglife < 10){
            return 2000000;
        }
        else{
            return 3000000;
        }
    }
    
}

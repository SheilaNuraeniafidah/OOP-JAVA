/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectsalary;

/**
 *
 * @author user
 */
public class ProjectSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeA a = new EmployeeA();
        a.Name = "vivian";
        a.employeeID = "Z01";
        a.setworkinglife(1);
        a.setTunjanganAnak(0);
        a.Status = false;
        a.totalsalary();
        
        EmployeeB b = new EmployeeB();
        b.Name = "lubis";
        b.employeeID = "Z02";
        b.Status = true;
        b.setworkinglife(2);
        b.setTunjanganAnak(1);
        b.totalsalary();
        
    }
    
}

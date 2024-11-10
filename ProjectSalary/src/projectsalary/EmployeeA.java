/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectsalary;

/**
 *
 * @author user
 */
public class EmployeeA extends Employee{
    
    void setworkinglife(int w ){
        if (w > 0 ){
            this.worklife = w;
        }
        else{
            System.out.println("ops incorrect value");
            System.exit(0);
        }
    }
    int getworkinglife(){
        return this.worklife;
    }
    private int salaryTunj(){
        if (this.worklife <= 10){
            return 2000000;
        }
        else{
            return 3000000;
        }
    }
    
    
    void setTunjanganAnak(int a){
        if (a >= 0){
            this.anak = a;
        }
        else{
            System.out.println("ops incorrect value");
            System.exit(0);
        }
    }
    int getTunjanganAnak(){
        return this.anak;
    }
    private Double tunjanganAnak(){
        return 0.05 * this.mainSalary()*this.anak;
    }
    
    
    
    private Double tunjanganIstri(){
        if (this.Status = true){
            return 0.1 * this.mainSalary();
        }
        else{
            return 0.0;
        }
    }
    
    
    private Double total(){
        return this.mainSalary() + this.salaryTunj() + this.tunjanganAnak() + this.tunjanganIstri();
    }
    void totalsalary(){
        System.out.println("employee id ; " + this.employeeID);
        System.out.println("name : " + this.Name);
        System.out.println("worklife : " + this.getworkinglife());
        System.out.println("anak : " + this.getTunjanganAnak());
        System.out.println("status : " + this.Status);
        System.out.println("total salary : " + this.total());
    }
}

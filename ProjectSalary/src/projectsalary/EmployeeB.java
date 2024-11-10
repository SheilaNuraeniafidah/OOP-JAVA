/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectsalary;

/**
 *
 * @author user
 */
public class EmployeeB extends Employee {
    
    void setworkinglife(int w){
        if (w > 0){
            this.worklife = w;
        }
        else{
            System.out.println("ops invalid value");
            System.exit(0);
        }
    }
    int getworkinglife(){
        return this.worklife;
    }
    private int gajitunjangan(){ 
        if (this.worklife <= 10){
            return 3000000;
        }
        else{
            return 4000000;
        }
    }
    
    
    void setTunjanganAnak(int a){
        if (a >= 0 ){
            this.anak = a;
        }
        else{
            System.out.println("ops invalid value");
            System.exit(0);
        }
    }
    int getTunjanganAnak(){
        return this.anak;
    }
    private Double tunjanganAnak(){
        return 0.06 * this.mainSalary()*this.anak;
    }
    
    
    private Double tunjanganIstri(){
        if (this.Status = true){
            return 0.11 * this.mainSalary();
        }
        else{
            return 0.0;
        }
    }
    
    private Double total(){
        return this.mainSalary() + this.gajitunjangan() + this.tunjanganAnak() + this.tunjanganIstri();
    }
    void totalsalary(){
        System.out.println("employee id ; " + this.employeeID);
        System.out.println("name : " + this.Name);
        System.out.println("worklife : " + this.getworkinglife());
        System.out.println("anak : "+ this.getTunjanganAnak() );
        System.out.println("status : " + this.Status);
        System.out.println("total salary : " + this.total());
    }
   
}

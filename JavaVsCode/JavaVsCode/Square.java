package JavaVsCode;

public class Square {
    int sidelength;
    String nama;

    void hitungKeliling(){
        int keliling ;
        keliling = 4 * this.sidelength;
        System.out.println("keliling persegi" +this.nama + keliling + " satuan luas");
    }
     void hitungLuas(){
        int luas ;
        luas = this.sidelength * this.sidelength;
        System.out.println("luas persegi" + this.nama + luas + " satuan luas");
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2.nilai.terbesar;

/**
 *
 * @author user
 */
public class Tugas2NilaiTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3,maks;
        n1 = 10;
        n2 = 23;
        n3 = 5;
        System.out.println("Number 1 = " +n1);
        System.out.println("Number 2 = " +n2);
        System.out.println("Number 3 = " +n3);
        maks = (n1>n2)?n1:n2;
        maks = (maks>n3)?maks:n3;
        System.out.println("Nilai tertingginya adalah angka = " +maks);
    }
    
}

package tugastentangclassobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fikripraja
 * 5160411326
 */
public class TugasTentangClassObject {
    
    private static List<data> dataa = new ArrayList<>();

    private static void inputData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan nim   : ");
        String nim = s.nextLine();
        System.out.print("Masukan nama  : ");
        String nama = s.nextLine();
        System.out.print("Masukan ipk   : ");
        float ipk = s.nextFloat();
        data m = new data (nim, nama, ipk);
        dataa.add(m);

    }
    
    private static void tampilData() {
        if (dataa.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            System.out.println("-------------------------");
            int counter = 1;
            for (data data : dataa) {
                System.out.println("Data ke-" + counter);
                System.out.println("NIM : " + data.getNim());
                System.out.println("Nama: " + data.getNama());
                System.out.println("IPK : " + data.getIpk());
                counter++;
            }
        }
    }
    
    private static void sortingData() {
        int pilih = 0;
        do {
            System.out.println("");
            System.out.println("Sorting data mahasiswa");
            System.out.println("--------------------------");
            System.out.println("1. Sorting by nim");
            System.out.println("2. Sorting by nama");
            System.out.println("3. Sorting by ipk");
            System.out.println("4. Kembali ke awal");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            pilih = s.nextInt();
            switch (pilih) {
                case 1:
                    sortingbyNIM();
                    break;
                case 2:
                    sortingbyNama();
                    break;
                case 3:
                    sortingbyIPK();
                    break;
            }
        } while (pilih != 4);
    }
    
    private static void sortingbyNIM() {
        if (dataa.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            Collections.sort(dataa, new Comparator<data>(){
            @Override
            public int compare (data m1, data m2){
        return m1.getNim().compareTo(m2.getNim());
            }
                });
            System.out.println("-------------------------");
            int counter = 1;
            for (data data : dataa) {
                System.out.println("Data ke-" + counter);
                System.out.println("NIM : " + data.getNim());
                System.out.println("Nama: " + data.getNama());
                System.out.println("IPK : " + data.getIpk());
                counter++;
            }
        }
    }
    
    private static void sortingbyNama() {
        if (dataa.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            Collections.sort(dataa, new Comparator<data>(){
            @Override
            public int compare (data m1, data m2){
        return m1.getNama().compareTo(m2.getNama());
            }
                });
            System.out.println("-------------------------");
            int counter = 1;
            for (data data : dataa) {
                System.out.println("Data ke-" + counter);
                System.out.println("NIM : " + data.getNim());
                System.out.println("Nama: " + data.getNama());
                System.out.println("IPK : " + data.getIpk());
                counter++;
            }
        }
    }
    
    private static void sortingbyIPK() {
        if (dataa.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            Collections.sort(dataa, new Comparator<data>(){
            @Override
            public int compare (data m1, data m2){
        float change1 = Float.valueOf(m1.getIpk());
        float change2 = Float.valueOf(m2.getIpk());
        if (change1 < change2) return -1;
        if (change1 == change2) return 0; 
        if (change2 > change2) return 1;
                return 0;
            }
                });
            System.out.println("-------------------------");
            int counter = 1;
            for (data data : dataa) {
                System.out.println("Data ke-" + counter);
                System.out.println("NIM : " + data.getNim());
                System.out.println("Nama: " + data.getNama());
                System.out.println("IPK : " + data.getIpk());
                counter++;
            }
        }
    }

    public static void tugasnya() {
        int pilih = 0;
        do {
            System.out.println("");
            System.out.println("Tugas tentang class-object");
            System.out.println("--------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            pilih = s.nextInt();
            switch (pilih) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    sortingData();
                    break;
            }
        } while (pilih != 4);
    }
 
    public static void main(String[] args) {
       tugasnya();
    }

}

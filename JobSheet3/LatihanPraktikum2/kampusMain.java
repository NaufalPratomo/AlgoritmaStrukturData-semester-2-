package JobSheet3.LatihanPraktikum2;

import java.util.Scanner;

public class kampusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        kampus[] kmpsArray = new kampus[3];

        for (int i = 0; i < kmpsArray.length; i++) {
            kmpsArray[i]=new kampus();
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan nama : ");
            kmpsArray[i].nama=sc.nextLine();
            System.out.print("Masukkan nim : ");
            kmpsArray[i].nim=sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            kmpsArray[i].jenisKelamin=sc.nextLine();
            System.out.print("Masukkan IPK : ");
            kmpsArray[i].IPK=sc.nextDouble();
            sc.nextLine();
        }

        System.out.println();
        for (int i = 0; i < kmpsArray.length; i++) {
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.println("nama : "+kmpsArray[i].nama);
            System.out.println("nim : "+kmpsArray[i].nim);
            System.out.println("Jenis kelamin : "+kmpsArray[i].jenisKelamin);
            System.out.println("Nilai IPK : "+kmpsArray[i].IPK);
        }
    }
}

package JobSheet4.BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-"+(i+1)+": ");
            fk[i].nilai=sc.nextInt();
        }

        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Penghitungan faktorial menggunakan Brute Force adalah "+fk[i].FaktorialBF(fk[i].nilai));
        }
        System.out.println("Hasil _ DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Penghitungan faktorial menggunakan Divide and Conquer adalah "+fk[i].FaktorialDC(fk[i].nilai));
        }
    }
}

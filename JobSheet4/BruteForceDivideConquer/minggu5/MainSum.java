package JobSheet4.BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9) ");

        System.out.println("=============================================================");
        System.out.print("Masukkan Banyak Perusahaan: ");
        int perusahaan = sc.nextInt();
        Sum[] sm = new Sum[perusahaan];
        for (int i = 0; i < perusahaan; i++) {
            System.out.print("Masukkan jumlah bulan perusahaan ke-" + (i + 1) + " : ");
            int elm = sc.nextInt();
            sm[i] = new Sum(elm, new double[elm]);

            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < sm.length; i++) {
            System.out.println("==============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println(
                    "Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));
            System.out.println("==============================================================");
            System.out.println("Algoritma Divide and Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = "
                    + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
        }
    }
}

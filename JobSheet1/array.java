package JobSheet1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {"Pancasila        ", "KTI             ", "CTPS            ", "MATDAS          ", "B.Inggris        ", "DASPRO          ", "Praktikum DASPRO", "K3              "};
        int jumlahMataKuliah = mataKuliah.length;
        int[] sks = new int[jumlahMataKuliah];
        double[] nilai = new double[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilai[i] = sc.nextDouble();
            System.out.print("Masukkan bobot SKS: ");
            sks[i] = sc.nextInt();
        }

        double total = 0;
        int totalSKS = 0;
        System.out.println("\nHasil Konversi Nilai\n");
        System.out.println("MK              \t\t\t\t\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            String nilaiHuruf = "";
            double bobotNilai = 0;
            if (nilai[i] > 84) {
                nilaiHuruf = "A";
                bobotNilai = 4;
            } else if (nilai[i] > 79) {
                nilaiHuruf = "B+";
                bobotNilai = 3.5;
            } else if (nilai[i] > 69) {
                nilaiHuruf = "B";
                bobotNilai = 3;
            } else if (nilai[i] > 59) {
                nilaiHuruf = "C+";
                bobotNilai = 2.5;
            } else if (nilai[i] > 49) {
                nilaiHuruf = "C";
                bobotNilai = 2;
            } else if (nilai[i] > 39) {
                nilaiHuruf = "D";
                bobotNilai = 1;
            } else {
                nilaiHuruf = "E";
                bobotNilai = 0;
            }
            total += bobotNilai * sks[i];
            totalSKS += sks[i];
            System.out.println(mataKuliah[i] + "\t\t\t\t\t\t" + nilai[i] + "\t\t\t" + nilaiHuruf + "\t\t\t" + bobotNilai);
        }
        double ipsemester = total / totalSKS;
        System.out.println("\nIP Anda adalah: " + ipsemester);
    }
}

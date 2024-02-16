package JobSheet1;

import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("Masukkan nilai tugas: ");
        int tugas = sc.nextInt();
        System.out.println("Masukkan nilai kuis: ");
        int kuis = sc.nextInt();
        System.out.println("Masukkan nilai UTS: ");
        int uts = sc.nextInt();
        System.out.println("Masukkan nilai UAS: ");
        int uas = sc.nextInt();

        //batasan bila diluar ketentuan
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        //deklarasi
        double nilaiAkhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;
        String nilaiHuruf;
        String keterangan;

        if (nilaiAkhir >= 81) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 74) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 66) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 61) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 51) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 40) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")
                || nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
    }
}

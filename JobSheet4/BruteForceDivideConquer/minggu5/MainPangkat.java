package JobSheet4.BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int element = sc.nextInt();

        Pangkat[] png = new Pangkat[element];
        for (int i = 0; i < element; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            png[i] = new Pangkat(sc.nextInt(), 0);
            System.out.println("Masukkan nilai pangkat: ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("Pilih metode:\n1. Brute Force\n2. Divide and Conquer");
        int metode = sc.nextInt();

        switch(metode) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < element; i++) {
                    System.out.println("Hasil dari"
                    +png[i].nilai+" pangkat "
                    +png[i].pangkat+" adalah "
                    +png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < element; i++) {
                    System.out.println("Hasil dari"
                    +png[i].nilai+" pangkat "
                    +png[i].pangkat+" adalah "
                    +png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}

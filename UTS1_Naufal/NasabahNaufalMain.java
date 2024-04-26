package UTS1_Naufal;

import java.util.Scanner;

public class NasabahNaufalMain {
    public static void main(String[] args) {
        Scanner scNaufal = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Nasabah: ");
        int banyakNasabahNaufal = scNaufal.nextInt();
        while (banyakNasabahNaufal < 6) {
            System.out.println("Jumlah Nasabah Minimal 6");
            banyakNasabahNaufal = scNaufal.nextInt();
        }
        NasabahNaufal[] nasabahNaufal = new NasabahNaufal[banyakNasabahNaufal];

        boolean menuNaufal = false;
        while (menuNaufal == false) {
            System.out.println("Menu Nasabah Naufal: ");
            System.out.println("1. Mengisi data Nasabah");
            System.out.println("2. Menampilkan data Nasabah");
            System.out.println("3. Mencari data Nasabah");
            System.out.println("4. Mengurutkan data Nasabah");
            System.out.println("5. Exit");

            System.out.print("Pilih Menu Nasabah: ");
            int PilihNaufal = scNaufal.nextInt();

            switch (PilihNaufal) {
                case 1:
                    for (int i = 0; i < nasabahNaufal.length; i++) {
                        System.out.println("============================");
                        System.out.println("Masukkan data nasabah ke-" + (i + 1));
                        System.out.print("Masukkan nomor rekening nasabah: ");
                        String no = scNaufal.next();
                        System.out.print("Masukkan nama nasabah: ");
                        String nm = scNaufal.next();
                        System.out.print("Masukkan NIK nasabah: ");
                        String nik = scNaufal.next();
                        System.out.print("Masukkan umur nasabah: ");
                        int umur = scNaufal.nextInt();
                        System.out.print("Masukkan saldo nasabah: ");
                        double sdo = scNaufal.nextDouble();
                        nasabahNaufal[i] = new NasabahNaufal(no, nm, nik, umur, sdo);
                    }
                    break;

                    case 2:
                    for (int i = 0; i < nasabahNaufal.length; i++) {
                        System.out.println("Data nasabah ke-" + (i + 1) + ": "+ nasabahNaufal[i].showDataNasabah());
                    }
                    break;

                    case 3:
                    System.out.print("Masukkan Nama Nasabah Yang Dicari: ");
                    String cariNamaNasabahNaufal = scNaufal.next();
                    int hasilNaufal = NasabahNaufal.mencariNamaNasabah(nasabahNaufal, cariNamaNasabahNaufal);
                    if (hasilNaufal == -1) {
                        System.out.println("Nasabah tidak ditemukan");
                    } else {
                        System.out.println("Nasabah dengan Nama " + cariNamaNasabahNaufal + " ditemukan pada indeks ke-" + hasilNaufal);
                        System.out.println("Dan data nasabah tersebut adalah: ");
                        System.out.println(nasabahNaufal[hasilNaufal].showDataNasabah());
                    }
                    break;

                    case 4:
                    System.out.println();
                    System.out.println("Mengurutkan data nasabah berdasarkan umur nasabah termuda hingga tertua.");
                    NasabahNaufal.sortNasabahNaufal(nasabahNaufal);
                    break;

                    case 5:
                    menuNaufal = true;
                    System.out.println("Terima Kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi");
            }
        }
    }
}

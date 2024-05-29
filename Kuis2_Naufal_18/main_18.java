package Kuis2_Naufal_18;

import java.util.Scanner;

public class main_18 {
    public static void main(String[] args) {
        Scanner Naufal18 = new Scanner(System.in);
        rumus_18 rumus18 = new rumus_18();
        int nomorAntrian18 = 1;
        int nomorPesanan18 = 1;

        System.out.println("======== QUIZ 2 PRAKTIKUM ASD TI ========");
        System.out.println("dibuat oleh : Muhammad Naufal Pratomo");
        System.out.println("NIM         : 2341720075");
        System.out.println("Absen       : 18");
        System.out.println("=========================================");
        System.out.println("Sistem Antrian Resto");

        do {
            System.out.println("Menu : ");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total pendapatan");
            System.out.println("6. Exit");

            System.out.print("Pilih (1-6): ");
            int pilih18 = Naufal18.nextInt();
            Naufal18.nextLine();
            switch (pilih18) {
                case 1:
                    System.out.print("Nama Customer :");
                    String nama18 = Naufal18.nextLine();
                    System.out.print("Nomor HP : ");
                    String noHp18 = Naufal18.nextLine();
                    Pembeli_18 data18 = new Pembeli_18(nomorAntrian18, nama18, noHp18);
                    rumus18.addLast18(data18, null);
                    nomorAntrian18++;
                    break;


                case 2:
                    System.out.println("No.        Nama Customer     Nomor HP");
                    rumus18.print18();
                    break;

                case 3:
                    System.out.print("Pesanan: ");
                    String namaPesanan18 = Naufal18.nextLine();
                    System.out.print("Harga:");
                    int harga18 = Naufal18.nextInt();
                    Naufal18.nextLine();
                    Pesanan_18 pesanan18 = new Pesanan_18(nomorPesanan18, namaPesanan18, harga18);
                    rumus18.Tambah18(pesanan18, nomorPesanan18 - 1);

                    System.out.println("No.        Nama Pesanan     Harga");
                    System.out.println(nomorPesanan18 + "          " + namaPesanan18 + "           " + harga18);
                    nomorPesanan18++;
                    rumus18.removeFirst18();
                    System.out.println("Total Antrian: " + rumus18.size18);
                    break;

                case 4:
                System.out.println("Data sort pesanan: ");
                    rumus18.sortPesanan18();
                    rumus18.tampilPesanan18();
                    break;

                case 5:
                    rumus18.totalJual18();
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                System.out.println("Pilihan anda tidak ada");
                    break;
            }
        } while (true);
    }
}

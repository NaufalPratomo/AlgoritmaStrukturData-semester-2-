package JobSheet8.Tugas;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian paling belakang");
        System.out.println("5. Cek Antrian (Berdasarkan Nama)");
        System.out.println("6. Tampilkan data seluruh pembeli");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasita queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    int noHP = sc.nextInt();
                    Pembeli pb = new Pembeli(nama, noHP);
                    sc.nextLine();
                    antri.enqueue(pb);
                    break;
                case 2:
                    Pembeli data = antri.dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHP);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli: ");
                    String namaPembeli = sc.nextLine();
                    antri.peekPosition(namaPembeli);
                    break;
                case 6:
                    antri.daftarPembeli();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
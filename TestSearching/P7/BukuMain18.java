package TestSearching.P7;
import java.util.Scanner;

public class BukuMain18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku18 data = new PencarianBuku18();
        int jumBuku = 5;

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s.nextLine();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock   \t : ");
            int stock = s.nextInt();
            s.nextLine();  // consume newline left-over

            Buku18 m = new Buku18(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("______________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan judul buku yang dicari : ");
        System.out.print("Judul buku : ");
        String cari = s1.nextLine();  
        System.out.println("menggunakan sequential search");
        int posisiSeq = data.FindSeqSearchJudul(cari);
        data.TampilPosisi(cari, posisiSeq);  

        System.out.println("menggunakan binary search");
        int posisiBin = data.FindBinarySearchJudul(cari);
        data.TampilPosisi(cari, posisiBin);  
    }
}

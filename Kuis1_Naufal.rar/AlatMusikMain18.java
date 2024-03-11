import java.util.Scanner;

public class AlatMusikMain18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        String nama18;
        String merk18;
        String kategori18;
        int stok18;
        int jumlah18;

        AlatMusik18[] amArray18 = new AlatMusik18[5];
        for (int i = 0; i < amArray18.length; i++) {
            System.out.print("Masukkan Nama: ");
            nama18 = sc18.nextLine();
            System.out.print("Masukkan Merk: ");
            merk18 = sc18.nextLine();
            System.out.print("Masukkan Kategori: ");
            kategori18 = sc18.nextLine();
            System.out.print("Masukkan Stok: ");
            stok18 = sc18.nextInt();
            System.out.print("Masukkan Jumlah: ");
            jumlah18 = sc18.nextInt();
            sc18.nextLine();
            amArray18[i] = new AlatMusik18(nama18, merk18, kategori18, stok18, jumlah18);
        }

        System.out.println("== Daftar Alat Musik ==");
        for (int i = 0; i < amArray18.length; i++) {
            amArray18[i].tampil();
            System.out.println("Sisa Stok: " + amArray18[i].hitungSisa());
            amArray18[i].hitungSisa();
        }
    }
}

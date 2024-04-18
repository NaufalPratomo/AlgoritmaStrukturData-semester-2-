package JobSheet7;

public class Utama18 {
    public static void main(String[] args) {
        Gudang18 gudang = new Gudang18(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. keluar");
            System.out.println("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.println("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang18 barangBaru = new Barang18(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi.");
            }
        }
    }
}
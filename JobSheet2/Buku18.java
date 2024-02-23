package JobSheet2;

public class Buku18 {

    String judul, pengarang;
    int halaman, stock, harga, hargaTotal, jumlah, diskon;

    void tampilInformasi() {
        System.out.println("==========================================");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa Stock: " + stock);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Total: Rp "+hargaTotal);
        System.out.println("Diskon: Rp "+diskon);
        System.out.println("Harga bayar: Rp "+hitungHargaBayar());
        System.out.println("==========================================");
    }

    void terjual(int jml) {
        if (stock > 0) {
            jumlah = jml;
            stock -= jml;
        }
    }

    void restock(int jml) {
        stock += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        return harga * jumlah;
    }

    int hitungDiskon() {
        if (hargaTotal > 150000) {
            return (int) (hargaTotal * 0.12);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return (int) (hargaTotal * 0.05);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        return hargaTotal-diskon;
    }

    public Buku18() {

    }

    public Buku18(String jud, String pg, int hal, int stock, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stock = stock;
        harga = har;
    }
}

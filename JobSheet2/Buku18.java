package JobSheet2;

public class Buku18 {
    
    String judul, pengarang;
    int halaman, stock, harga;

    void tampilInformasi(){
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Jumlah halaman: "+halaman);
        System.out.println("Sisa Stock"+stock);
        System.out.println("Harga: Rp "+harga);
    }

    void terjual(int jml){
        if (stock > 0){
            stock -= jml;
        }
    }

    void restock(int jml){
        stock += jml;
    }

    void gantiHarga(int hrg){
        harga=hrg;
    }
}

public class AlatMusik18 {
    
    public String nama18;
    public String merk18;
    public String kategori18;
    public int stok18;
    public int jumlah18;

    public AlatMusik18 (String nama, String merk, String kategori, int stok, int jumlah) {
        this.nama18 = nama;
        this.merk18 = merk;
        this.kategori18 = kategori;
        this.stok18 = stok;
        this.jumlah18 = jumlah;
    }

    void tampil(){
        System.out.println(
            "Alat musik " + this.nama18 + " dari merk " + this.merk18 + " dengan kategori " + this.kategori18 + " dan stok " + this.stok18 + " dengan jumlah " + this.jumlah18 + " buah."
            );
    }

    int hitungSisa(){
        return this.stok18 - this.jumlah18;
    }

    void cariAlatMusikTerlaris(int i18){
        
    }

    void daftarAlatMusik(){
        
    }
}

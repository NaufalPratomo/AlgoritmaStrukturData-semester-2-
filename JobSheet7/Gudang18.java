package JobSheet7;

public class Gudang18 {

    public Barang18[] tumpukan;
    public int size;
    public int top;

    public Gudang18(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang18[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang18 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang18 ambilBarang() {
        if (!cekKosong()) {
            Barang18 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: "+konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang18 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang18 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang:");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi stack = new StackKonversi();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang18 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang18 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    
    public Barang18 cariBarang(int kode, String nama) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == kode || tumpukan[i].nama.equals(nama)) {
                System.out.println("Barang ditemukan: " + tumpukan[i].nama);
                return tumpukan[i];
            }
        }
        System.out.println("Barang tidak ditemukan");
        return null;
    }
}